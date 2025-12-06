package com.yuri.im.schema

sealed interface MessageSender {
    fun hashKey(): String
}

data object MessageSenderSelf: MessageSender {
    override fun hashKey(): String = "self"
}