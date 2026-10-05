package com.yuri.im.schema

import kotlin.io.encoding.Base64

data class ImageMessage(override val sender: MessageSender, val image: ImageAsset) : ChatMessage {
    override val fromSelf: Boolean get() = sender == MessageSenderSelf
}

/** Embedded image data; exported once per ID in the session's resource table. */
data class ImageAsset(val id: String, val mimeType: String, val width: Int, val height: Int, val base64: String) {
    fun bytes(): ByteArray = Base64.decode(base64)

    fun validate(): ImageAsset {
        require(id.isNotBlank()) { "Image ID is missing" }
        require(base64.length <= ((MAX_BYTES + 2) / 3) * 4) { "Image exceeds 2 MB" }
        val info = inspect(bytes())
        require(info == Triple(mimeType, width, height)) { "Image metadata does not match its contents" }
        return this
    }

    companion object {
        const val MAX_BYTES = 2 * 1024 * 1024
        fun fromBytes(id: String, bytes: ByteArray): ImageAsset {
            val (mime, width, height) = inspect(bytes)
            return ImageAsset(id, mime, width, height, Base64.encode(bytes))
        }

        private fun inspect(bytes: ByteArray): Triple<String, Int, Int> {
            require(bytes.size in 1..MAX_BYTES) { "Image exceeds 2 MB or is empty" }
            fun u(i: Int) = bytes[i].toInt() and 255
            fun word(i: Int) = (u(i) shl 8) or u(i + 1)
            fun int(i: Int) = (u(i) shl 24) or (u(i + 1) shl 16) or (u(i + 2) shl 8) or u(i + 3)
            var width = 0
            var height = 0
            val mime = when {
                bytes.size >= 24 && bytes.take(8) == listOf(137, 80, 78, 71, 13, 10, 26, 10).map { it.toByte() } -> {
                    require(bytes.copyOfRange(12, 16).decodeToString() == "IHDR") { "Invalid PNG" }
                    width = int(16); height = int(20)
                    "image/png"
                }
                bytes.size >= 4 && u(0) == 255 && u(1) == 216 -> {
                    var i = 2
                    while (i + 3 < bytes.size) {
                        require(u(i) == 255) { "Invalid JPEG" }
                        while (i < bytes.size && u(i) == 255) i++
                        require(i < bytes.size) { "Invalid JPEG" }
                        val marker = u(i++)
                        if (marker == 217 || marker == 218) break
                        if (marker == 1 || marker in 208..215) continue
                        require(i + 1 < bytes.size) { "Invalid JPEG" }
                        val length = word(i)
                        require(length >= 2 && i + length <= bytes.size) { "Invalid JPEG" }
                        if (marker in listOf(192, 193, 194)) {
                            require(length >= 8) { "Invalid JPEG dimensions" }
                            height = word(i + 3); width = word(i + 5)
                            break
                        }
                        i += length
                    }
                    "image/jpeg"
                }
                else -> throw IllegalArgumentException("Only PNG and JPEG images are supported")
            }
            require(width in 1..8192 && height in 1..8192 && width.toLong() * height <= 16_000_000) {
                "Image dimensions exceed 8192 pixels or 16 megapixels"
            }
            return Triple(mime, width, height)
        }
    }
}
