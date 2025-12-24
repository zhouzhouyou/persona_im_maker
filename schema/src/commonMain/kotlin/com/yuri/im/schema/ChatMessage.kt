package com.yuri.im.schema

sealed interface ChatMessage {
    val fromSelf: Boolean

    val sender: MessageSender

    val text: String?
        get() = null

    val emotionMarker: EmotionMarker
        get() = EmotionMarker.EMOTION_MARKER_NONE
}