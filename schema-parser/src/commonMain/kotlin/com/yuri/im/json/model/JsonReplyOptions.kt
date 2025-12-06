package com.yuri.im.json.model

import com.yuri.im.schema.ReplyOptions
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Reply options. 回复选项。
 *
 * @property options 回复选项列表
 */
@Serializable
internal data class JsonReplyOptions(
    @SerialName("options")
    val options: List<String>,
) {
    fun toModel(): ReplyOptions {
        return ReplyOptions(options)
    }
}