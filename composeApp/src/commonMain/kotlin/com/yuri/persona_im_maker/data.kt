package com.yuri.persona_im_maker

import com.yuri.im.schema.EmotionMarker
import com.yuri.im.schema.PlainText
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.StandardMessageSender

val messages = listOf(
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_ANN,
        content = "Hello!",
        emotionMarker = EmotionMarker.EMOTION_MARKER_EXCLAMATION_MARK
    ),
    PlainText(
        text = "你好",
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_CAROLINE,
        content = "我怎么在这里！？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_RYUJI,
        content = "出去玩吗？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    ),
)