package com.yuri.persona_im_maker.chat.session.editor.ui

import io.github.vinceglb.filekit.FileKit
import io.github.vinceglb.filekit.dialogs.openFileSaver
import io.github.vinceglb.filekit.write

internal actual fun sessionSaveUsesDownload(): Boolean = false

internal actual suspend fun saveSessionFile(bytes: ByteArray, suggestedName: String): Boolean {
    // FileKit uses SAF CreateDocument; write() opens the returned content URI
    // through ContentResolver, including truncation when overwriting a document.
    val file = FileKit.openFileSaver(suggestedName = suggestedName, extension = "pim") ?: return false
    file.write(bytes)
    return true
}
