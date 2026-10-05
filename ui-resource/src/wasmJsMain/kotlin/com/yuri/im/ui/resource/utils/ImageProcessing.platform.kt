package com.yuri.im.ui.resource.utils

import com.yuri.im.schema.ImageAsset
import com.yuri.im.schema.ImageInfo
import org.jetbrains.skia.*

internal actual suspend fun processImage(bytes: ByteArray, info: ImageInfo): ByteArray {
    val image = Image.makeFromEncoded(bytes)
    try {
        // Decode even unchanged images so damaged payloads are rejected at selection/import.
        val decoded = Bitmap.makeFromImage(image)
        decoded.close()
        if (info.orientation == 1 && maxOf(info.width, info.height) <= ImageAsset.DISPLAY_EDGE) return bytes
        val (width, height) = displayDimensions(info)
        val surface = Surface.makeRasterN32Premul(width, height)
        try {
            val canvas = surface.canvas
            // Skia decoding already applies all EXIF orientations (including mirroring).
            val w = image.width.toFloat()
            val h = image.height.toFloat()
            canvas.drawImageRect(image, Rect.makeWH(w, h), Rect.makeWH(width.toFloat(), height.toFloat()), SamplingMode.LINEAR, null, true)
            val result = surface.makeImageSnapshot()
            try {
                val encoded = requireNotNull(result.encodeToData(if (info.mimeType == "image/png") EncodedImageFormat.PNG else EncodedImageFormat.JPEG, 85)) { "Cannot encode image" }
                try { return encoded.bytes } finally { encoded.close() }
            } finally { result.close() }
        } finally { surface.close() }
    } finally { image.close() }
}
