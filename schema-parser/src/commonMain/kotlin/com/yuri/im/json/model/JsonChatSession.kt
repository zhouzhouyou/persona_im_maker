package com.yuri.im.json.model

import com.yuri.im.schema.*
import kotlinx.serialization.Serializable

@Serializable
internal data class JsonChatSession(
    val sessionID: String,
    val alias: String,
    val messages: List<JsonChatMessage>,
    val backgroundParticle: JsonBackgroundParticle,
    val formatVersion: Int,
    val images: List<JsonImageAsset> = emptyList(),
) {
    fun toModel(resources: Map<String, ByteArray>): ChatSession {
        require(formatVersion == 1) { "Unsupported session format: $formatVersion" }
        require(images.map { it.id }.distinct().size == images.size) { "Duplicate image IDs" }
        require(images.all { it.mimeType in listOf("image/png", "image/jpeg") }) { "Unsupported image type" }
        val assets = images.associate { it.id to it.toModel(requireNotNull(resources[it.path]) { "Missing image resource: ${it.id}" }) }
        require(resources.keys == images.map { it.path }.toSet()) { "Unexpected resource entries" }
        val content = messages.map { it.toModel() }
        require(content.filterIsInstance<ImageMessage>().all { it.imageId in assets }) { "Missing image reference" }
        return ChatSession(sessionID, alias, content, backgroundParticle.toModel(), assets)
    }
}
internal fun ChatSession.toDto(): JsonChatSession {
    val referenced = messages.filterIsInstance<ImageMessage>().map { it.imageId }.toSet()
    require(referenced.all { it in images }) { "Missing image reference" }
    val assets = referenced.map { id -> requireNotNull(images[id]).validate().also { require(it.id == id) } }
    return JsonChatSession(sessionID, alias, messages.map { it.toDto() }, backgroundParticle.toDto(), formatVersion = 1, images = assets.map { it.toDto() })
}
