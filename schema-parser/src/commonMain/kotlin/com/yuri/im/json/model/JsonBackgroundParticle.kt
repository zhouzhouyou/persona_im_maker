package com.yuri.im.json.model

import com.yuri.im.schema.BackgroundParticle
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializable
internal enum class JsonBackgroundParticle(val id: Int) {
    /**
     * Unknown background particle. 未知背景粒子。
     */
    UNKNOWN(0),

    /**
     * None background particle. 无背景粒子。
     */
    NONE(1),
    /**
     * Sakura background particle. 樱花背景粒子。
     */
    SAKURA(2),
    /**
     * Snowflake background particle. 雪花背景粒子。
     */
    SNOWFLAKE(3);

    fun toModel(): BackgroundParticle {
        return when (this) {
            UNKNOWN -> BackgroundParticle.UNKNOWN
            NONE -> BackgroundParticle.NONE
            SAKURA -> BackgroundParticle.SAKURA
            SNOWFLAKE -> BackgroundParticle.SNOWFLAKE
        }
    }

    companion object {
        fun fromValue(value: Int): JsonBackgroundParticle {
            return JsonBackgroundParticle.entries.firstOrNull { it.id == value } ?: UNKNOWN
        }
    }
}

internal fun BackgroundParticle.toDto(): JsonBackgroundParticle {
    return when (this) {
        BackgroundParticle.UNKNOWN -> JsonBackgroundParticle.UNKNOWN
        BackgroundParticle.NONE -> JsonBackgroundParticle.NONE
        BackgroundParticle.SAKURA -> JsonBackgroundParticle.SAKURA
        BackgroundParticle.SNOWFLAKE -> JsonBackgroundParticle.SNOWFLAKE
    }
}

internal object JsonBackgroundParticleSerializer : KSerializer<JsonBackgroundParticle> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("JsonBackgroundParticle", PrimitiveKind.INT)

    override fun deserialize(decoder: Decoder): JsonBackgroundParticle {
        return JsonBackgroundParticle.fromValue(decoder.decodeInt())
    }

    override fun serialize(encoder: Encoder, value: JsonBackgroundParticle) {
        encoder.encodeInt(value.id)
    }
}
