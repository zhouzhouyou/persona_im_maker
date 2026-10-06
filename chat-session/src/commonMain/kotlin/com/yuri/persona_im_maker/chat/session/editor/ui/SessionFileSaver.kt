package com.yuri.persona_im_maker.chat.session.editor.ui

/** True only when the platform cannot offer a native save-location picker. */
internal expect fun sessionSaveUsesDownload(): Boolean

/** User-confirmed save; false when the location picker was cancelled. */
internal expect suspend fun saveSessionFile(bytes: ByteArray, suggestedName: String): Boolean
