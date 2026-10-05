package com.yuri.im.ui.resource.utils

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Paint
import com.yuri.im.schema.ImageAsset
import com.yuri.im.schema.ImageInfo
import java.io.ByteArrayOutputStream

internal actual suspend fun processImage(bytes: ByteArray, info: ImageInfo): ByteArray {
    val options = BitmapFactory.Options().apply {
        inSampleSize = 1
        while (maxOf(info.width, info.height) / inSampleSize > 4096) inSampleSize *= 2
    }
    val bitmap = requireNotNull(BitmapFactory.decodeByteArray(bytes, 0, bytes.size, options)) { "Cannot decode image" }
    try {
        if (info.orientation == 1 && maxOf(info.width, info.height) <= ImageAsset.DISPLAY_EDGE) return bytes
        val (width, height) = displayDimensions(info)
        val output = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        try {
            val canvas = Canvas(output)
            val ow = if (info.orientation >= 5) bitmap.height else bitmap.width
            val oh = if (info.orientation >= 5) bitmap.width else bitmap.height
            canvas.scale(width.toFloat() / ow, height.toFloat() / oh)
            val w = bitmap.width.toFloat(); val h = bitmap.height.toFloat()
            when (info.orientation) {
                2 -> { canvas.translate(w, 0f); canvas.scale(-1f, 1f) }
                3 -> { canvas.translate(w, h); canvas.rotate(180f) }
                4 -> { canvas.translate(0f, h); canvas.scale(1f, -1f) }
                5 -> { canvas.rotate(90f); canvas.scale(1f, -1f) }
                6 -> { canvas.translate(h, 0f); canvas.rotate(90f) }
                7 -> { canvas.translate(h, w); canvas.rotate(90f); canvas.scale(-1f, 1f) }
                8 -> { canvas.translate(0f, w); canvas.rotate(270f) }
            }
            canvas.drawBitmap(bitmap, Matrix(), Paint(Paint.FILTER_BITMAP_FLAG))
            val stream = ByteArrayOutputStream()
            require(output.compress(if (info.mimeType == "image/png") Bitmap.CompressFormat.PNG else Bitmap.CompressFormat.JPEG, 85, stream)) { "Cannot encode image" }
            return stream.toByteArray()
        } finally { output.recycle() }
    } finally { bitmap.recycle() }
}
