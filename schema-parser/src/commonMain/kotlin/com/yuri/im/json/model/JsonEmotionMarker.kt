package com.yuri.im.json.model

import com.yuri.im.schema.EmotionMarker
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind.*
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Top-end area of message which marks the emotion, 消息右上角标记情绪的区域。
 */
@Serializable(with = JsonEmotionMarkerSerializer::class)
internal enum class JsonEmotionMarker(
    val value: Int,
) {
    /**
     * fallback
     */
    EMOTION_MARKER_UNKNOWN(0),
    /**
     * None
     */
    EMOTION_MARKER_NONE(1),
    /**
     * Question mark. 问号. ?
     */
    EMOTION_MARKER_QUESTION_MARK(2),
    /**
     * Exclamation mark. 感叹号. !
     */
    EMOTION_MARKER_EXCLAMATION_MARK(3),
    /**
     * Double exclamation mark. 双感叹号. !!
     */
    EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK(4),
    /**
     * Exclamation and question mark. 感叹号和问号. !?
     */
    EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK(5),
    ;

    fun toModel(): EmotionMarker {
        return when (this) {
            EMOTION_MARKER_UNKNOWN -> EmotionMarker.EMOTION_MARKER_UNKNOWN
            EMOTION_MARKER_NONE -> EmotionMarker.EMOTION_MARKER_NONE
            EMOTION_MARKER_QUESTION_MARK -> EmotionMarker.EMOTION_MARKER_QUESTION_MARK
            EMOTION_MARKER_EXCLAMATION_MARK -> EmotionMarker.EMOTION_MARKER_EXCLAMATION_MARK
            EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK -> EmotionMarker.EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK
            EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK -> EmotionMarker.EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK
        }
    }

    companion object {
        fun fromValue(value: Int): JsonEmotionMarker? {
            return JsonEmotionMarker.entries.firstOrNull { it.value == value }
        }
    }
}

internal fun EmotionMarker.toDto(): JsonEmotionMarker {
    return when (this) {
        EmotionMarker.EMOTION_MARKER_UNKNOWN -> JsonEmotionMarker.EMOTION_MARKER_UNKNOWN
        EmotionMarker.EMOTION_MARKER_NONE -> JsonEmotionMarker.EMOTION_MARKER_NONE
        EmotionMarker.EMOTION_MARKER_QUESTION_MARK -> JsonEmotionMarker.EMOTION_MARKER_QUESTION_MARK
        EmotionMarker.EMOTION_MARKER_EXCLAMATION_MARK -> JsonEmotionMarker.EMOTION_MARKER_EXCLAMATION_MARK
        EmotionMarker.EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK -> JsonEmotionMarker.EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK
        EmotionMarker.EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK -> JsonEmotionMarker.EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK
    }
}

internal object JsonEmotionMarkerSerializer : KSerializer<JsonEmotionMarker> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("JsonEmotionMarker", INT)

    override fun deserialize(decoder: Decoder): JsonEmotionMarker {
        return JsonEmotionMarker.fromValue(decoder.decodeInt()) ?: JsonEmotionMarker.EMOTION_MARKER_UNKNOWN
    }

    override fun serialize(encoder: Encoder, value: JsonEmotionMarker) {
        encoder.encodeInt(value.value)
    }
}
