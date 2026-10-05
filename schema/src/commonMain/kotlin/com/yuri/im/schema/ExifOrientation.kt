package com.yuri.im.schema

/** Reads only JPEG EXIF orientation; all offsets stay inside the APP1 segment. */
internal fun exifOrientation(bytes: ByteArray): Int {
    fun u(i: Int) = bytes[i].toInt() and 255
    var p = 2
    while (p + 4 <= bytes.size && u(p) == 255) {
        while (p < bytes.size && u(p) == 255) p++
        if (p + 2 >= bytes.size) return 1
        val marker = u(p++)
        if (marker == 218 || marker == 217) return 1
        if (marker == 1 || marker in 208..215) continue
        val length = (u(p) shl 8) or u(p + 1)
        if (length < 2 || p.toLong() + length > bytes.size) return 1
        val start = p + 2
        val end = p + length
        if (marker == 225 && length >= 16 && bytes.copyOfRange(start, start + 6).contentEquals(byteArrayOf(69,120,105,102,0,0))) {
            val t = start + 6
            val little = u(t) == 73 && u(t + 1) == 73
            if (!little && !(u(t) == 77 && u(t + 1) == 77)) return 1
            fun word(i: Int): Int = if (little) u(i) or (u(i + 1) shl 8) else (u(i) shl 8) or u(i + 1)
            fun long(i: Int): Long = if (little) word(i).toLong() or (word(i + 2).toLong() shl 16) else (word(i).toLong() shl 16) or word(i + 2).toLong()
            if (word(t + 2) != 42) return 1
            val offset = long(t + 4)
            if (offset < 8 || t + offset + 2 > end) return 1
            val directory = t + offset.toInt()
            val count = word(directory)
            if (directory.toLong() + 2 + count * 12L > end) return 1
            for (i in 0 until count) {
                val entry = directory + 2 + i * 12
                if (word(entry) == 274 && word(entry + 2) == 3 && long(entry + 4) == 1L) {
                    return word(entry + 8).takeIf { it in 1..8 } ?: 1
                }
            }
            return 1
        }
        p = end
    }
    return 1
}
