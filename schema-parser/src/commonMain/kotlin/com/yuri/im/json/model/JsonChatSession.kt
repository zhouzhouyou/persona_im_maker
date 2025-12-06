package com.yuri.im.json.model

import com.yuri.im.schema.ChatSession
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Chat session. 对话。
 *
 * @property sessionID 会话ID
 * @property alias 会话别名
 * @property messages 会话中的消息
 */
@Serializable
internal data class JsonChatSession(
    @SerialName("sessionID")
    val sessionID: String,
    @SerialName("alias")
    val alias: String,
    @SerialName("messages")
    val messages: List<JsonChatMessage>,
    @SerialName("schemaVersion")
    val schemaVersion: Int,
) {
    fun toModel(): ChatSession {
        return ChatSession(
            sessionID,
            alias,
            messages.map { it.toModel() },
        )
    }
}

internal fun ChatSession.toDto(): JsonChatSession {
    return JsonChatSession(
        sessionID,
        alias,
        messages.map { it.toDto() },
        CURRENT_SCHEMA_VERSION
    )
}

const val CURRENT_SCHEMA_VERSION = 1
