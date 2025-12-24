package com.yuri.persona_im_maker

import com.yuri.im.schema.BuildInCustomMessageSender
import com.yuri.im.schema.EmotionMarker
import com.yuri.im.schema.PlainText
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.ReplyOptions
import com.yuri.im.schema.StandardMessageSender

val messages = listOf(
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_ANN,
        content = "圣诞节到了!",
        emotionMarker = EmotionMarker.EMOTION_MARKER_EXCLAMATION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_MAKOTO,
        content = "有人约到了雨宫莲吗？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_HARU,
        content = "同问"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_TAE,
        content = "很久不见小白鼠了"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_ICHIKO,
        content = "他很久没去过酒吧了"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_KASUMI,
        content = "学长不见了"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_HIFUMI,
        content = "很久没来下棋了"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_CHIHAYA,
        content = "等我占卜一下他明天的命运",
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_CHIHAYA,
        content = "为什么塔罗牌是战车？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK,
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_BECKY,
        content = "这小子，该不会"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_FUTABA,
        content = "我黑入手机看了他的聊天记录，他和龙司他们出去玩"
    ),
    ReplyOptions(
        options = listOf(
            "...",
            "很有你的风格呢，双叶"
        )
    )
)

val messages2 = listOf(
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_YUSUKE,
        content = "最近视力越来越差了，打开钱包都看不到钱",
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_FUTABA,
        content = "应该不是视力的问题"
    ),
    ReplyOptions(
        options = listOf(
            "去打工嘛？",
            "去买彩票吧",
            "我的班主任能介绍一份很赚钱的工作..."
        )
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_MAKOTO,
        content = "不会是什么不合法的工作吧？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_ANN,
        content = "要来当模特吗？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_FUTABA,
        content = "小狐狸也可以当模特?",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_YUSUKE,
        content = "你群聊时倒是挺多话的嘛"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_FUTABA,
        content = "那我不说了"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_FUTABA,
        content = ":|"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_YUSUKE,
        content = "？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_FUTABA,
        content = ":("
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_RYUJI,
        content = "佑介，快道歉"
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_YUSUKE,
        content = "我吗？为何？",
        emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    ),
    ReceiveMessage(
        sender = StandardMessageSender.SENDER_FUTABA,
        content = ":P"
    ),
)