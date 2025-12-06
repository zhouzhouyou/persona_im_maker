package com.yuri.im.json.model

import com.yuri.im.schema.BuildInCustomMessageSender
import com.yuri.im.schema.CustomMessageSender
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.StandardMessageSender
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Received message. 收到的消息。
 *
 * @property standard 标准发送者
 * @property buildInCustom 内建自定义发送者
 * @property custom 自定义发送者
 * @property emotionMarker 情感标记
 * @property content 消息内容
 */
@Serializable
internal data class JsonReceiveMessage(
    @SerialName("standard")
    val standard: JsonStandardMessageSender? = null,

    @SerialName("buildInCustom")
    val buildInCustom: JsonBuildInCustomMessageSender? = null,

    @SerialName("custom")
    val custom: JsonCustomMessageSender? = null,

    @SerialName("emotionMarker")
    val emotionMarker: JsonEmotionMarker = JsonEmotionMarker.EMOTION_MARKER_NONE,

    @SerialName("content")
    val content: String,
) {
    fun toModel(): ReceiveMessage {
        val sender = when {
            standard != null -> standard.toModel()
            buildInCustom != null -> buildInCustom.toModel()
            custom != null -> custom.toModel()
            else -> throw IllegalArgumentException("ReceiveMessage must have standard, buildInCustom, or custom")
        }

        return ReceiveMessage(
            sender,
            emotionMarker.toModel(),
            content,
        )
    }
}



internal fun ReceiveMessage.toDto(): JsonReceiveMessage {
    val standard = if (this.sender is StandardMessageSender) (this.sender as StandardMessageSender).toDto() else null
    val buildInCustom = if (this.sender is BuildInCustomMessageSender) (this.sender as BuildInCustomMessageSender).toDto() else null
    val custom = if (this.sender is CustomMessageSender) (this.sender as CustomMessageSender).toDto() else null

    return JsonReceiveMessage(
        standard = standard,
        buildInCustom = buildInCustom,
        custom = custom,
        emotionMarker = this.emotionMarker.toDto(),
        content = this.content,
    )
}