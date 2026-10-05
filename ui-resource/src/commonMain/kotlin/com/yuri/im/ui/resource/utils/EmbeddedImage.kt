package com.yuri.im.ui.resource.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.IntSize
import com.yuri.im.schema.ImageAsset
import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.jetbrains.compose.resources.decodeToImageBitmap
import org.jetbrains.compose.resources.stringResource
import com.yuri.im.ui.resource.*

/** Shared bounded cache: repeated resource IDs reuse decoded images and small editor thumbnails. */
private object ImageCache {
    private data class Cached(val asset: ImageAsset, val thumbnail: Boolean, val result: Result<ImageBitmap>)
    private val mutex = Mutex()
    private val cache = mutableListOf<Cached>()
    suspend fun get(asset: ImageAsset, thumbnail: Boolean): Result<ImageBitmap> = mutex.withLock {
        cache.firstOrNull { it.asset.id == asset.id && it.thumbnail == thumbnail && it.asset == asset }?.let {
            cache.remove(it); cache.add(it); return@withLock it.result
        }
        val result = try {
            val bitmap = asset.bytes.decodeToImageBitmap()
            val scale = (256f / maxOf(bitmap.width, bitmap.height)).coerceAtMost(1f)
            Result.success(if (thumbnail && scale < 1f) {
                val size = IntSize((bitmap.width * scale).toInt().coerceAtLeast(1), (bitmap.height * scale).toInt().coerceAtLeast(1))
                ImageBitmap(size.width, size.height).also { small ->
                    Canvas(small).drawImageRect(bitmap, dstSize = size, paint = Paint().apply { filterQuality = FilterQuality.Medium })
                }
            } else bitmap)
        } catch (e: CancellationException) { throw e }
        catch (e: Exception) { Result.failure(e) }
        cache.add(Cached(asset, thumbnail, result))
        while (cache.size > 32 || cache.sumOf { it.asset.bytes.size.toLong() } > 32 * 1024 * 1024 || cache.sumOf { it.result.getOrNull()?.let { b -> b.width.toLong() * b.height } ?: 0L } > 8_000_000) cache.removeAt(0)
        result
    }
}

@Composable
fun EmbeddedImage(asset: ImageAsset, description: String?, modifier: Modifier = Modifier, thumbnail: Boolean = false) {
    val bitmap by produceState<Result<ImageBitmap>?>(null, asset, thumbnail) {
        value = withContext(Dispatchers.Default) { ImageCache.get(asset, thumbnail) }
    }
    bitmap?.getOrNull()?.let { Image(it, description, modifier, contentScale = ContentScale.Fit) }
        ?: BasicText(stringResource(if (bitmap == null) UiResources.string.image_loading else UiResources.string.image_unavailable), modifier = modifier)
}
