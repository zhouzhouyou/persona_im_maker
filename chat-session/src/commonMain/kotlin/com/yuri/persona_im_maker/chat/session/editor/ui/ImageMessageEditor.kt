package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.ImageAsset
import com.yuri.im.ui.resource.utils.EmbeddedImage
import com.yuri.persona_im_maker.chat.session.*
import io.github.vinceglb.filekit.dialogs.FileKitType
import io.github.vinceglb.filekit.dialogs.compose.rememberFilePickerLauncher
import io.github.vinceglb.filekit.readBytes
import io.github.vinceglb.filekit.size
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.yuri.im.ui.resource.utils.prepareImage
import org.jetbrains.compose.resources.stringResource
import kotlin.uuid.Uuid

@Composable
internal fun ImageMessageEditor(image: ImageAsset?, onImage: (ImageAsset) -> Unit, onLoading: (Boolean) -> Unit) {
    val scope = rememberCoroutineScope()
    var busy by remember { mutableStateOf(false) }
    var failed by remember { mutableStateOf(false) }
    val picker = rememberFilePickerLauncher(type = FileKitType.File(listOf("png", "jpg", "jpeg"))) { file ->
        if (file != null) scope.launch {
            busy = true; onLoading(true); failed = false
            try {
                val asset = withContext(Dispatchers.Default) {
                    require(file.size() <= ImageAsset.MAX_BYTES)
                    val bytes = file.readBytes()
                    prepareImage(Uuid.random().toString(), bytes)
                }
                onImage(asset)
            } catch (e: CancellationException) {
                throw e
            } catch (_: Exception) {
                failed = true
            } finally {
                busy = false; onLoading(false)
            }
        }
    }
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        image?.let {
            EmbeddedImage(it, stringResource(ChatSessionRes.string.image_message), Modifier.fillMaxWidth().height(160.dp), thumbnail = true)
        }
        Button(enabled = !busy, onClick = { picker.launch() }) {
            Text(stringResource(if (image == null) ChatSessionRes.string.choose_image else ChatSessionRes.string.replace_image))
        }
        Text(stringResource(ChatSessionRes.string.image_limits), style = MaterialTheme.typography.bodySmall)
        if (busy) LinearProgressIndicator(Modifier.fillMaxWidth())
        if (failed) Text(stringResource(ChatSessionRes.string.image_invalid), color = MaterialTheme.colorScheme.error)
    }
}
