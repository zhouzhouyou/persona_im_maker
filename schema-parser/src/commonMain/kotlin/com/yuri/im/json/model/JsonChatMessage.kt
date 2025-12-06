package com.yuri.im.json.model

import com.yuri.im.schema.ChatMessage
import com.yuri.im.schema.EditingMessage
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.SendMessage
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Chat message. 聊天消息。
 *
 * @property receive 收到的消息
 * @property editing 正在编辑的消息
 * @property send 正在发送的消息
 */
@Serializable
internal data class JsonChatMessage(
    @SerialName("receive")
    val receive: JsonReceiveMessage? = null,

    @SerialName("editing")
    val editing: JsonEditingMessage? = null,

    @SerialName("send")
    val send: JsonSendMessage? = null,
) {
    fun toModel(): ChatMessage {
        return when {
            receive != null -> receive.toModel()
            editing != null -> editing.toModel()
            send != null -> send.toModel()
            else -> throw IllegalArgumentException("ChatMessage must have receive, editing, or send")
        }
    }
}

internal fun ChatMessage.toDto(): JsonChatMessage {
    return when (this) {
        is ReceiveMessage -> JsonChatMessage(receive = this.toDto())
        is EditingMessage -> JsonChatMessage(editing = this.toDto())
        is SendMessage -> JsonChatMessage(send = this.toDto())

    }
}