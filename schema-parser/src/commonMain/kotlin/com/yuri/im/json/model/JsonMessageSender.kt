package com.yuri.im.json.model

import com.yuri.im.schema.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface JsonMessageSender

@Serializable
@SerialName("self")
internal data object JsonMessageSenderSelf : JsonMessageSender

@Serializable
@SerialName("standard")
internal data class JsonStandardMessageSenderWrapper(@SerialName("value") val value: JsonStandardMessageSender) :
    JsonMessageSender

@Serializable
@SerialName("buildInCustom")
internal data class JsonBuildInCustomMessageSenderWrapper(@SerialName("value") val value: JsonBuildInCustomMessageSender) :
    JsonMessageSender

fun JsonMessageSender.toMessageSender(): MessageSender {
    return when (this) {
        is JsonMessageSenderSelf -> MessageSenderSelf
        is JsonCustomMessageSender -> TODO()
        is JsonStandardMessageSenderWrapper -> value.toModel()
        is JsonBuildInCustomMessageSenderWrapper -> value.toModel()
    }
}

fun MessageSender.toJsonMessageSender(): JsonMessageSender {
    return when (this) {
        is MessageSenderSelf -> JsonMessageSenderSelf
        is StandardMessageSender -> JsonStandardMessageSenderWrapper(toDto())
        is BuildInCustomMessageSender -> JsonBuildInCustomMessageSenderWrapper(toDto())
        is CustomMessageSender -> TODO()
    }
}
