package com.yuri.persona_im_maker.chat.session.editor.ui

/** Native save dialog; browser download. False means the native dialog was cancelled. */
internal expect suspend fun saveSessionFile(bytes: ByteArray, suggestedName: String): Boolean
