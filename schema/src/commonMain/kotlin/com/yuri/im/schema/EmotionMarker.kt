package com.yuri.im.schema

/**
 * Emotion marker. 情感标记。
 */
enum class EmotionMarker {
    /**
     * fallback
     */
    EMOTION_MARKER_UNKNOWN,

    /**
     * None. 无情感标记。
     */
    EMOTION_MARKER_NONE,

    /**
     * Question mark. 问号. ?
     */
    EMOTION_MARKER_QUESTION_MARK,

    /**
     * Exclamation mark. 感叹号. !
     */
    EMOTION_MARKER_EXCLAMATION_MARK,

    /**
     * Double exclamation mark. 双感叹号. !!
     */
    EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK,

    /**
     * Exclamation and question mark. 感叹号和问号. !?
     */
    EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK,
}