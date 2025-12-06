@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
package com.yuri.persona_im_maker.utils

import androidx.compose.foundation.internal.readText
import androidx.compose.ui.platform.ClipEntry

actual suspend fun ClipEntry?.getPlainText(): String? {
    return this?.readText()
}

actual fun createClipEntryWithPlainText(text: String): ClipEntry {
    return ClipEntry.withPlainText(text)
}