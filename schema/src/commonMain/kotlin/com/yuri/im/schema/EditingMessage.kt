package com.yuri.im.schema

object EditingMessage: ChatMessage {
    override val fromSelf: Boolean
        get() = false

    override val sender: MessageSender
        get() = throw UnsupportedOperationException("EditingMessage sender is not available")
}