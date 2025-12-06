package com.yuri.persona_im_maker.utils

import android.content.ClipData
import android.content.ClipboardManager
import androidx.compose.ui.platform.ClipEntry

private fun getClipboardManager(): ClipboardManager {
    return AppContextProvider.appContext.getSystemService(ClipboardManager::class.java)
}

actual suspend fun ClipEntry?.getPlainText(): String? {
    val clipboard = getClipboardManager()
    return clipboard.primaryClip?.getItemAt(0)?.text?.toString()
}

actual fun createClipEntryWithPlainText(text: String): ClipEntry {
    val clipboard = getClipboardManager()
    val clip = ClipData.newPlainText("text", text)
    clipboard.setPrimaryClip(clip)
    return ClipEntry(clip)
}