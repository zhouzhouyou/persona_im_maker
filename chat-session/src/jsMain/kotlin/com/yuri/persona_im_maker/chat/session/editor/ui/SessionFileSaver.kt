package com.yuri.persona_im_maker.chat.session.editor.ui

import io.github.vinceglb.filekit.utils.toBitsArray
import kotlinx.coroutines.await
import kotlin.js.Promise
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.url.URL
import org.w3c.files.File
import org.w3c.files.FilePropertyBag

@OptIn(ExperimentalWasmJsInterop::class)
internal actual suspend fun saveSessionFile(bytes: ByteArray, suggestedName: String): Boolean {
    val filename = "$suggestedName.pim"
    val file = File(bytes.toBitsArray(), filename, FilePropertyBag(type = "application/zip"))
    if (!sessionSaveUsesDownload()) return saveWithPicker(file, filename).await()
    val url = URL.createObjectURL(file)
    val anchor = document.createElement("a") as HTMLAnchorElement
    anchor.href = url
    anchor.download = filename
    document.body?.appendChild(anchor)
    try { anchor.click() } finally {
        anchor.remove()
        // Give the browser time to start reading the Blob before releasing it.
        window.setTimeout({ URL.revokeObjectURL(url) }, 1000)
    }
    return true
}

internal actual fun sessionSaveUsesDownload(): Boolean = js("!(window.isSecureContext && typeof window.showSaveFilePicker === 'function')")

private fun saveWithPicker(file: File, filename: String): Promise<Boolean> = js("""(function(file, filename) {
    return window.showSaveFilePicker({suggestedName: filename, types: [{description: 'Persona session', accept: {'application/zip': ['.pim']}}]})
        .then(function(handle) { return handle.createWritable(); })
        .then(function(stream) {
            return stream.write(file).then(function() { return stream.close(); }).then(function() { return true; })
                .catch(function(error) { return stream.abort().catch(function() {}).then(function() { throw error; }); });
        })
        .catch(function(error) { if (error.name === 'AbortError') return false; throw error; });
})(file, filename)""")
