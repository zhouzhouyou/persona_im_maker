package com.yuri.persona_im_maker.chat.session.editor.ui

import io.github.vinceglb.filekit.utils.toJsArray
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.url.URL
import org.w3c.files.File
import org.w3c.files.FilePropertyBag

@OptIn(ExperimentalWasmJsInterop::class)
internal actual suspend fun saveSessionFile(bytes: ByteArray, suggestedName: String): Boolean {
    val filename = "$suggestedName.pim"
    val file = File(bytes.toJsArray(), filename, FilePropertyBag(type = "application/zip"))
    val url = URL.createObjectURL(file)
    val anchor = document.createElement("a") as HTMLAnchorElement
    anchor.href = url
    anchor.download = filename
    document.body?.appendChild(anchor)
    try { anchor.click() } finally {
        anchor.remove()
        // Give the browser time to start reading the Blob before releasing it.
        window.setTimeout({ URL.revokeObjectURL(url); null }, 1000)
    }
    return true
}
