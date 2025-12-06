package com.yuri.im.schema

/**
 * Received message. 收到的消息。
 *
 * @property sender 发送者
 * @property emotionMarker 情感标记
 * @property content 消息内容
 */
data class ReceiveMessage(
    val sender: ReceivedMessageSender,
    override val emotionMarker: EmotionMarker = EmotionMarker.EMOTION_MARKER_NONE,
    val content: String
): ChatMessage {
    override val text: String
        get() = content

    override val fromSelf: Boolean
        get() = false
}
