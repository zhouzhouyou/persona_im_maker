package com.yuri.persona_im_maker.utils

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.ClipEntry
import androidx.compose.ui.platform.asAwtTransferable
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection

@OptIn(ExperimentalComposeUiApi::class)
actual suspend fun ClipEntry?.getPlainText(): String? {
    val transferable = this?.asAwtTransferable ?: return null
    return if (transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
        transferable.getTransferData(DataFlavor.stringFlavor) as? String
    } else {
        null
    }
}

@OptIn(ExperimentalComposeUiApi::class)
actual fun createClipEntryWithPlainText(text: String): ClipEntry {
    return ClipEntry(StringSelection(text))
}