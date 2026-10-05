package com.yuri.im.ui.resource.utils

import com.yuri.im.schema.ImageAsset
import com.yuri.im.schema.ImageInfo
import kotlin.math.roundToInt

/** Limit dimensions before platform decoding. Small, correctly oriented files keep original bytes. */
suspend fun prepareImage(id: String, bytes: ByteArray): ImageAsset {
    val info = ImageAsset.inspect(bytes)
    val normalized = processImage(bytes, info)
    return ImageAsset.fromBytes(id, normalized)
}
internal expect suspend fun processImage(bytes: ByteArray, info: ImageInfo): ByteArray
internal fun displayDimensions(info: ImageInfo): Pair<Int, Int> {
    val width = if (info.orientation >= 5) info.height else info.width
    val height = if (info.orientation >= 5) info.width else info.height
    val scale = (ImageAsset.DISPLAY_EDGE.toFloat() / maxOf(width, height)).coerceAtMost(1f)
    return (width * scale).roundToInt().coerceAtLeast(1) to (height * scale).roundToInt().coerceAtLeast(1)
}
