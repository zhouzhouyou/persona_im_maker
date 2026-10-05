package com.yuri.im.schema

/** Messages reference session resources rather than carrying their own image data. */
data class ImageMessage(override val sender: MessageSender, val imageId: String) : ChatMessage {
    override val fromSelf: Boolean get() = sender == MessageSenderSelf
}

data class ImageInfo(val mimeType: String, val width: Int, val height: Int, val orientation: Int = 1)

/** Binary resource. Equality compares content, including image bytes. */
class ImageAsset(val id: String, val mimeType: String, val width: Int, val height: Int, val bytes: ByteArray) {
    fun validate(): ImageAsset {
        require(id.matches(Regex("[A-Za-z0-9_-]{1,80}"))) { "Invalid image ID" }
        val info = inspect(bytes)
        require(info.mimeType == mimeType && info.width == width && info.height == height) { "Image metadata does not match its contents" }
        return this
    }
    override fun equals(other: Any?): Boolean = this === other || other is ImageAsset &&
        id == other.id && mimeType == other.mimeType && width == other.width && height == other.height && bytes.contentEquals(other.bytes)
    override fun hashCode(): Int = 31 * (31 * (31 * id.hashCode() + mimeType.hashCode()) + width) + height + bytes.contentHashCode()

    companion object {
        const val MAX_BYTES = 25 * 1024 * 1024
        const val MAX_SESSION_BYTES = 100 * 1024 * 1024
        const val MAX_RESOURCES = 256
        const val MAX_PIXELS = 32_000_000L
        const val DISPLAY_EDGE = 2048
        fun fromBytes(id: String, bytes: ByteArray): ImageAsset {
            val info = inspect(bytes)
            return ImageAsset(id, info.mimeType, info.width, info.height, bytes).validate()
        }
        fun inspect(bytes: ByteArray): ImageInfo {
            require(bytes.size in 1..MAX_BYTES) { "Image exceeds 25 MB or is empty" }
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
            require(width in 1..32768 && height in 1..32768 && width.toLong() * height <= MAX_PIXELS) {
                "Image dimensions exceed 32768 pixels per side or 32 megapixels"
            }
            return ImageInfo(mime, width, height, if (mime == "image/jpeg") exifOrientation(bytes) else 1)
        }
    }
}
