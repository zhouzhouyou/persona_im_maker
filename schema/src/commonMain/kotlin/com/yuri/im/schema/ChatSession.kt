package com.yuri.im.schema

/**
 * Chat session. 聊天会话。
 *
 * @property sessionID 会话ID
 * @property alias 会话别名
 * @property messages 会话消息列表
 */
data class ChatSession(
    val sessionID: String,
    val alias: String,
    val messages: List<ChatMessage>
)
