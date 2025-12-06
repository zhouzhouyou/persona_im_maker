package com.yuri.im.json.model

import com.yuri.im.schema.EditingMessage
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Editing message. 表示编辑中的消息
 */
@Serializable
@SerialName("editingMessage")
internal object JsonEditingMessage {
    fun toModel(): EditingMessage {
        return EditingMessage
    }
}

internal fun EditingMessage.toDto(): JsonEditingMessage {
    return JsonEditingMessage
}