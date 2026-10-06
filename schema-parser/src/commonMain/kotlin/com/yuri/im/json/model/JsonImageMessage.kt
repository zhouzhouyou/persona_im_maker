package com.yuri.im.json.model

import com.yuri.im.schema.*
import kotlinx.serialization.Serializable

@Serializable
internal data class JsonImageAsset(val id: String, val mimeType: String, val width: Int, val height: Int) {
    val path: String get() = "images/$id.${if (mimeType == "image/png") "png" else "jpg"}"
    fun toModel(bytes: ByteArray) = ImageAsset(id, mimeType, width, height, bytes).validate()
}
@Serializable
internal data class JsonImageMessage(val sender: JsonMessageSender, val imageId: String) {
    fun toModel() = ImageMessage(sender.toMessageSender(), imageId)
}
internal fun ImageMessage.toDto() = JsonImageMessage(sender.toJsonMessageSender(), imageId)
internal fun ImageAsset.toDto() = JsonImageAsset(id, mimeType, width, height)
