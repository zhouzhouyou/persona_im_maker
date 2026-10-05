package com.yuri.im.json.model

import com.yuri.im.schema.ImageAsset
import com.yuri.im.schema.ImageMessage
import kotlinx.serialization.Serializable

@Serializable
internal data class JsonImageAsset(val id: String, val mimeType: String, val width: Int, val height: Int, val base64: String) {
    fun toModel() = ImageAsset(id, mimeType, width, height, base64).validate()
}

@Serializable
internal data class JsonImageMessage(val sender: JsonMessageSender, val imageId: String) {
    fun toModel(assets: Map<String, ImageAsset>) = ImageMessage(
        sender.toMessageSender(), requireNotNull(assets[imageId]) { "Missing image resource: $imageId" }
    )
}

internal fun ImageMessage.toDto() = JsonImageMessage(sender.toJsonMessageSender(), image.id)
internal fun ImageAsset.toDto() = JsonImageAsset(id, mimeType, width, height, base64)
