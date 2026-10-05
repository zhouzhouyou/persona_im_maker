package com.yuri.im.ui.resource.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import com.yuri.im.schema.ImageAsset
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jetbrains.compose.resources.decodeToImageBitmap
import org.jetbrains.compose.resources.stringResource
import com.yuri.im.ui.resource.UiResources
import com.yuri.im.ui.resource.image_unavailable
import com.yuri.im.ui.resource.image_loading

/** Decoded once for the lifetime of this image composition, independent of animation frames. */
@Composable
fun EmbeddedImage(asset: ImageAsset, description: String?, modifier: Modifier = Modifier) {
    val bitmap by produceState<Result<ImageBitmap>?>(null, asset) {
        value = withContext(Dispatchers.Default) {
            try { Result.success(asset.bytes().decodeToImageBitmap()) }
            catch (e: CancellationException) { throw e }
            catch (e: Exception) { Result.failure(e) }
        }
    }
    bitmap?.getOrNull()?.let { Image(it, description, modifier, contentScale = ContentScale.Fit) }
        ?: BasicText(stringResource(if (bitmap == null) UiResources.string.image_loading else UiResources.string.image_unavailable), modifier = modifier)
}
