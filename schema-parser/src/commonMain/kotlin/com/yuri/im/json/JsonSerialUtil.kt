package com.yuri.im.json

import com.yuri.im.json.model.JsonBuildInCustomMessageSender
import com.yuri.im.json.model.JsonBuildInCustomMessageSenderSerializer
import com.yuri.im.json.model.JsonChatSession
import com.yuri.im.json.model.JsonCustomMessageSender
import com.yuri.im.json.model.JsonMessageSender
import com.yuri.im.json.model.JsonMessageSenderSelf
import com.yuri.im.json.model.JsonStandardMessageSender
import com.yuri.im.json.model.JsonStandardMessageSenderSerializer
import com.yuri.im.json.model.toDto
import com.yuri.im.json.model.toJsonMessageSender
import com.yuri.im.json.model.toMessageSender
import com.yuri.im.schema.BuildInCustomMessageSender
import com.yuri.im.schema.ChatSession
import com.yuri.im.schema.CustomMessageSender
import com.yuri.im.schema.MessageSender
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.schema.StandardMessageSender
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

object JsonSerialUtil {
    @OptIn(ExperimentalSerializationApi::class)
    private val json = Json {
        ignoreUnknownKeys = true
        prettyPrint = true
        prettyPrintIndent = " "
        encodeDefaults = false
    }

    fun fromJson(jsonString: String): ChatSession {
        val jsonChatSession = json.decodeFromString(JsonChatSession.serializer(), jsonString)

        return jsonChatSession.toModel()
    }

    fun toJson(chatSession: ChatSession): String {
        val jsonChatSession = chatSession.toDto()

        return json.encodeToString(jsonChatSession)
    }

    fun fromJsonToMessageSenderList(jsonString: String): List<MessageSender> {
        val jsonMessageSenderList = json.decodeFromString(ListSerializer(JsonMessageSender.serializer()), jsonString)

        return jsonMessageSenderList.map(JsonMessageSender::toMessageSender)
    }

    fun messageSenderListToJson(messageSenderList: List<MessageSender>): String {
        val jsonMessageSenderList = messageSenderList.map { it.toJsonMessageSender() }

        return json.encodeToString(ListSerializer(JsonMessageSender.serializer()), jsonMessageSenderList)
    }
}