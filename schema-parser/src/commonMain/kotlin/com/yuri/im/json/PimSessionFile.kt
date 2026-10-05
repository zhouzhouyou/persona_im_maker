package com.yuri.im.json

import com.yuri.im.schema.ChatSession
import com.yuri.im.schema.ImageMessage

/** Version 1 .pim: a bounded ZIP with STORE entries, session.json and binary images. */
object PimSessionFile {
    const val MAX_BYTES = com.yuri.im.schema.ImageAsset.MAX_SESSION_BYTES
    const val MAX_IMAGES = com.yuri.im.schema.ImageAsset.MAX_RESOURCES
    private const val MAX_MANIFEST = 1024 * 1024

    fun encode(session: ChatSession): ByteArray {
        val manifest = JsonSerialUtil.toManifest(session).encodeToByteArray()
        require(manifest.size <= MAX_MANIFEST) { "Session manifest is too large" }
        val resources = session.messages.filterIsInstance<ImageMessage>().map { it.imageId }.distinct()
        require(resources.size <= MAX_IMAGES) { "Too many images" }
        val entries = linkedMapOf("session.json" to manifest)
        resources.forEach { id ->
            val image = requireNotNull(session.images[id]).validate()
            entries["images/$id.${if (image.mimeType == "image/png") "png" else "jpg"}"] = image.bytes
        }
        return StoredZip.encode(entries)
    }

    fun decode(bytes: ByteArray): ChatSession {
        val entries = StoredZip.decode(bytes)
        val manifest = requireNotNull(entries["session.json"]) { "Missing session.json" }
        require(manifest.size <= MAX_MANIFEST) { "Session manifest is too large" }
        return JsonSerialUtil.fromManifest(manifest.decodeToString(throwOnInvalidSequence = true), entries - "session.json")
    }
}

/** Deliberately accepts only the bounded, unencrypted STORE subset used by .pim v1. */
internal object StoredZip {
    private val crcTable = IntArray(256) { value ->
        var crc = value
        repeat(8) { crc = if (crc and 1 != 0) (crc ushr 1) xor 0xedb88320.toInt() else crc ushr 1 }
        crc
    }
    private fun crc(bytes: ByteArray): Int {
        var crc = -1
        for (byte in bytes) crc = (crc ushr 8) xor crcTable[(crc xor byte.toInt()) and 255]
        return crc.inv()
    }
    private fun validPath(name: String) = name == "session.json" || name.matches(Regex("images/[A-Za-z0-9_-]{1,80}\\.(png|jpg)"))

    fun encode(entries: Map<String, ByteArray>): ByteArray {
        require(entries.size <= PimSessionFile.MAX_IMAGES + 1 && entries.keys.all(::validPath)) { "Invalid ZIP entries" }
        val total = 22L + entries.entries.sumOf { (name, bytes) -> 76L + name.encodeToByteArray().size * 2L + bytes.size }
        require(total <= PimSessionFile.MAX_BYTES) { "Session exceeds 100 MB" }
        val output = ByteArray(total.toInt())
        var position = 0
        fun short(value: Int) { repeat(2) { output[position++] = (value ushr (8 * it)).toByte() } }
        fun int(value: Int) { repeat(4) { output[position++] = (value ushr (8 * it)).toByte() } }
        fun data(bytes: ByteArray) { bytes.copyInto(output, position); position += bytes.size }
        data class Entry(val name: ByteArray, val offset: Int, val size: Int, val crc: Int)
        val index = entries.map { (name, bytes) ->
            val entry = Entry(name.encodeToByteArray(), position, bytes.size, crc(bytes))
            int(0x04034b50); short(20); short(0x800); short(0); short(0); short(33)
            int(entry.crc); int(entry.size); int(entry.size); short(entry.name.size); short(0)
            data(entry.name); data(bytes)
            entry
        }
        val centralOffset = position
        index.forEach { entry ->
            int(0x02014b50); short(20); short(20); short(0x800); short(0); short(0); short(33)
            int(entry.crc); int(entry.size); int(entry.size); short(entry.name.size); short(0); short(0)
            short(0); short(0); int(0); int(entry.offset); data(entry.name)
        }
        val centralSize = position - centralOffset
        int(0x06054b50); short(0); short(0); short(index.size); short(index.size)
        int(centralSize); int(centralOffset); short(0)
        check(position == output.size)
        return output
    }

    fun decode(bytes: ByteArray): Map<String, ByteArray> {
        require(bytes.size in 22..PimSessionFile.MAX_BYTES) { "Invalid ZIP size (maximum 100 MB)" }
        fun bounds(position: Int, size: Int) { require(position >= 0 && size >= 0 && position.toLong() + size <= bytes.size) { "Truncated ZIP" } }
        fun short(p: Int): Int { bounds(p, 2); return (bytes[p].toInt() and 255) or ((bytes[p + 1].toInt() and 255) shl 8) }
        fun int(p: Int): Int { bounds(p, 4); return short(p) or (short(p + 2) shl 16) }
        val end = (bytes.size - 22 downTo (bytes.size - 65557).coerceAtLeast(0)).firstOrNull { int(it) == 0x06054b50 && it + 22L + short(it + 20) == bytes.size.toLong() }
            ?: throw IllegalArgumentException("Missing ZIP directory")
        require(short(end + 4) == 0 && short(end + 6) == 0) { "Multi-volume ZIP is unsupported" }
        val count = short(end + 10)
        require(count in 1..PimSessionFile.MAX_IMAGES + 1 && short(end + 8) == count) { "Too many ZIP entries" }
        val centralSize = int(end + 12)
        val centralOffset = int(end + 16)
        require(centralOffset >= 0 && centralSize >= 0 && centralOffset.toLong() + centralSize == end.toLong()) { "Invalid ZIP directory" }
        var position = centralOffset
        var localEnd = 0
        var total = 0L
        val entries = linkedMapOf<String, ByteArray>()
        repeat(count) {
            bounds(position, 46)
            require(int(position) == 0x02014b50) { "Invalid ZIP directory entry" }
            val flags = short(position + 8)
            require(flags == 0 || flags == 0x800) { "Encrypted/streamed ZIP is unsupported" }
            require(short(position + 10) == 0 && short(position + 34) == 0) { "Only STORE entries are supported" }
            val checksum = int(position + 16)
            val size = int(position + 24)
            require(size >= 0 && int(position + 20) == size) { "Invalid STORE size" }
            total += size
            require(total <= PimSessionFile.MAX_BYTES) { "ZIP resources exceed 100 MB" }
            val nameSize = short(position + 28)
            val extraSize = short(position + 30)
            val commentSize = short(position + 32)
            bounds(position + 46, nameSize + extraSize + commentSize)
            val nameBytes = bytes.copyOfRange(position + 46, position + 46 + nameSize)
            val name = nameBytes.decodeToString(throwOnInvalidSequence = true)
            require(validPath(name) && name !in entries) { "Invalid or duplicate ZIP path" }
            val offset = int(position + 42)
            require(offset == localEnd) { "Overlapping or hidden ZIP entries" }
            bounds(offset, 30)
            require(int(offset) == 0x04034b50 && short(offset + 6) == flags && short(offset + 8) == 0 && int(offset + 14) == checksum && int(offset + 18) == size && int(offset + 22) == size && short(offset + 26) == nameSize) { "ZIP entry metadata mismatch" }
            bounds(offset + 30, nameSize)
            require(bytes.copyOfRange(offset + 30, offset + 30 + nameSize).contentEquals(nameBytes)) { "ZIP path mismatch" }
            val dataStart = offset.toLong() + 30 + nameSize + short(offset + 28)
            val dataEnd = dataStart + size
            require(dataEnd <= centralOffset && dataStart <= centralOffset) { "Invalid ZIP entry bounds" }
            if (name == "session.json") require(size <= 1024 * 1024) { "Manifest is too large" }
            else require(size <= com.yuri.im.schema.ImageAsset.MAX_BYTES) { "Image is too large" }
            val data = bytes.copyOfRange(dataStart.toInt(), dataEnd.toInt())
            require(crc(data) == checksum) { "ZIP checksum mismatch" }
            entries[name] = data
            localEnd = dataEnd.toInt()
            position += 46 + nameSize + extraSize + commentSize
        }
        require(position == end && localEnd == centralOffset) { "Unexpected ZIP data" }
        return entries
    }
}
