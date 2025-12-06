package com.yuri.im

import com.yuri.im.json.JsonSerialUtil
import com.yuri.im.schema.BuildInCustomMessageSender
import com.yuri.im.schema.ChatSession
import com.yuri.im.schema.CustomMessageSender
import com.yuri.im.schema.EditingMessage
import com.yuri.im.schema.EmotionMarker
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.schema.PlainText
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.ReplyOptions
import com.yuri.im.schema.StandardMessageSender
import kotlin.test.Test
import kotlin.test.assertEquals

class JsonTest {
    @Test
    fun testSerialize() {
        val chatSession = ChatSession(
            sessionID = "a",
            alias = "test",
            messages = listOf(
                ReceiveMessage(
                    sender = StandardMessageSender.SENDER_ANN,
                    emotionMarker = EmotionMarker.EMOTION_MARKER_QUESTION_MARK,
                    content = "Ann"
                ),
                ReceiveMessage(
                    sender = BuildInCustomMessageSender.CUSTOM_SENDER_SAE,
                    emotionMarker = EmotionMarker.EMOTION_MARKER_UNKNOWN,
                    content = "Sae"
                ),
                ReceiveMessage(
                    sender = CustomMessageSender(1),
                    emotionMarker = EmotionMarker.EMOTION_MARKER_NONE,
                    content = "Custom"
                ),
                EditingMessage,
                ReplyOptions(
                    listOf(
                        "Yes",
                        "No"
                    )
                ),
                PlainText("plain text")
            ),
        )

        val jsonString = JsonSerialUtil.toJson(chatSession)
        println(jsonString)

        val deserialized = JsonSerialUtil.fromJson(jsonString)

        assertEquals(chatSession, deserialized)
    }

    @Test
    fun testMessageSender() {
        val messageSenderList = listOf(
            MessageSenderSelf,
            StandardMessageSender.SENDER_ANN,
            BuildInCustomMessageSender.CUSTOM_SENDER_SAE,
        )

        val jsonString = JsonSerialUtil.messageSenderListToJson(messageSenderList)
        println(jsonString)

        val deserialized = JsonSerialUtil.fromJsonToMessageSenderList(jsonString)
        assertEquals(messageSenderList, deserialized)
    }
}