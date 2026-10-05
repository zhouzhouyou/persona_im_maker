package com.yuri.im.json.model

import com.yuri.im.schema.ChatMessage
import com.yuri.im.schema.EditingMessage
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.SendMessage
import com.yuri.im.schema.ImageMessage
import com.yuri.im.schema.ImageAsset
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
    val image: JsonImageMessage? = null,
) {
    fun toModel(assets: Map<String, ImageAsset> = emptyMap()): ChatMessage {
        require(listOf(receive, editing, send, image).count { it != null } == 1) { "Message must have exactly one content type" }
        return when {
            image != null -> image.toModel(assets)
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
        is ImageMessage -> JsonChatMessage(image = this.toDto())

    }
}
