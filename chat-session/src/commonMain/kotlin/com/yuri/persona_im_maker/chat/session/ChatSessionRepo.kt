package com.yuri.persona_im_maker.chat.session

import com.yuri.im.schema.ChatSession
import com.yuri.persona.im.task.state.ResultOf

interface ChatSessionRepo {
    suspend fun getAll(): ResultOf<List<ChatSession>, Throwable>

    suspend fun add(chatSession: ChatSession): ResultOf<Unit, Throwable>

    suspend fun get(sessionID: String): ResultOf<ChatSession, Throwable>

    suspend fun remove(sessionID: String): ResultOf<Unit, Throwable>
}