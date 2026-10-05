package com.yuri.im.json.model

import com.yuri.im.schema.ChatSession
import com.yuri.im.schema.ImageMessage
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
    @SerialName("backgroundParticle")
    val backgroundParticle: JsonBackgroundParticle,
    val images: List<JsonImageAsset> = emptyList(),
) {
    fun toModel(): ChatSession {
        require(schemaVersion in 1..CURRENT_SCHEMA_VERSION) { "Unsupported session format: $schemaVersion" }
        require(images.map { it.id }.distinct().size == images.size) { "Duplicate image IDs" }
        val assets = images.associate { it.id to it.toModel() }
        return ChatSession(
            sessionID,
            alias,
            messages.map { it.toModel(assets) },
            backgroundParticle.toModel(),
        )
    }
}

internal fun ChatSession.toDto(): JsonChatSession {
    val assets = messages.filterIsInstance<ImageMessage>().map { it.image.validate() }.groupBy { it.id }
    require(assets.values.all { group -> group.distinct().size == 1 }) { "Conflicting image IDs" }
    return JsonChatSession(
        sessionID,
        alias,
        messages.map { it.toDto() },
        CURRENT_SCHEMA_VERSION,
        backgroundParticle.toDto(),
        assets.values.map { it.first().toDto() },
    )
}

const val CURRENT_SCHEMA_VERSION = 2
