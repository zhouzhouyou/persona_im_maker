package com.yuri.im.schema

object EditingMessage: ChatMessage {
    override val fromSelf: Boolean
        get() = false
}