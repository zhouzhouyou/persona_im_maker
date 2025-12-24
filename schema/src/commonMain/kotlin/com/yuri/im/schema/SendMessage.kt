package com.yuri.im.schema

/**
 * Send message type.
 */
sealed interface SendMessage: ChatMessage {
    override val fromSelf: Boolean
        get() = true
}

data class PlainText(
    override val text: String,
): SendMessage {
    override val sender: MessageSenderSelf
        get() = MessageSenderSelf
}

/**
 * Reply options. 回复选项。
 *
 * @property options 回复选项列表
 */
data class ReplyOptions(
    val options: List<String>,
): SendMessage {
    override val sender: MessageSenderSelf
        get() = MessageSenderSelf
}
