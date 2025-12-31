package com.yuri.im.json.model

import com.yuri.im.schema.BuildInCustomMessageSender
import com.yuri.im.schema.CustomMessageSender
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind.INT
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Build-in custom message sender. 内建自定义发送者。
 */
@Serializable(with = JsonBuildInCustomMessageSenderSerializer::class)
@SerialName("buildInCustom")
internal enum class JsonBuildInCustomMessageSender(val value: Int, ) {
    /**
     * fallback
     */
    CUSTOM_SENDER_UNKNOWN(0),

    /**
     * Sae Niijima. 新岛冴
     */
    CUSTOM_SENDER_SAE(1),

    /**
     * Morogan. 摩尔加纳
     */
    CUSTOM_SENDER_MOROGAN(2),

    /**
     * Morogan Human. 摩尔加纳人形态
     */
    CUSTOM_SENDER_MOROGAN_HUMAN(3);

    fun toModel(): BuildInCustomMessageSender {
        return when (this) {
            CUSTOM_SENDER_UNKNOWN -> BuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN
            CUSTOM_SENDER_SAE -> BuildInCustomMessageSender.CUSTOM_SENDER_SAE
            CUSTOM_SENDER_MOROGAN -> BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN
            CUSTOM_SENDER_MOROGAN_HUMAN -> BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN_HUMAN
        }
    }

    companion object {
        fun fromValue(value: Int): JsonBuildInCustomMessageSender? {
            return JsonBuildInCustomMessageSender.entries.firstOrNull { it.value == value }
        }
    }
}

internal fun BuildInCustomMessageSender.toDto(): JsonBuildInCustomMessageSender {
    return when (this) {
        BuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN -> JsonBuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN
        BuildInCustomMessageSender.CUSTOM_SENDER_SAE -> JsonBuildInCustomMessageSender.CUSTOM_SENDER_SAE
        BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN -> JsonBuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN
        BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN_HUMAN -> JsonBuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN_HUMAN
    }
}

internal object JsonBuildInCustomMessageSenderSerializer : KSerializer<JsonBuildInCustomMessageSender> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("JsonBuildInCustomMessageSender", INT)

    override fun deserialize(decoder: Decoder): JsonBuildInCustomMessageSender {
        return JsonBuildInCustomMessageSender.fromValue(decoder.decodeInt()) ?: JsonBuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN
    }

    override fun serialize(encoder: Encoder, value: JsonBuildInCustomMessageSender) {
        encoder.encodeInt(value.value)
    }
}
