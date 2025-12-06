package com.yuri.im.json.model

import com.yuri.im.schema.CustomMessageSender
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Custom message sender. 自定义发送者。
 *
 * @property resourceID 资源ID
 */
@Serializable
@SerialName("custom")
internal data class JsonCustomMessageSender(
    @SerialName("resourceID")
    val resourceID: Int
): JsonMessageSender {
    fun toModel(): CustomMessageSender {
        return CustomMessageSender(resourceID)
    }
}

internal fun CustomMessageSender.toDto(): JsonCustomMessageSender {
    return JsonCustomMessageSender(resourceID = this.resourceID)
}
