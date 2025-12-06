package com.yuri.im.json.model

import com.yuri.im.schema.PlainText
import com.yuri.im.schema.ReplyOptions
import com.yuri.im.schema.SendMessage
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Send message. 发送的消息。
 *
 * @property text 消息文本
 * @property replies 回复选项
 */
@Serializable
internal data class JsonSendMessage(
    @SerialName("text")
    val text: String? = null,

    @SerialName("replies")
    val replies: JsonReplyOptions? = null,
) {
    fun toModel(): SendMessage {
        return when {
            text != null -> PlainText(text)
            replies != null -> replies.toModel()
            else -> throw IllegalArgumentException("SendMessage must have text or replies")
        }
    }
}

internal fun SendMessage.toDto(): JsonSendMessage {
    return when (this) {
        is PlainText -> JsonSendMessage(text = this.text)
        is ReplyOptions -> JsonSendMessage(replies = JsonReplyOptions(this.options))
    }
}