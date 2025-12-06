package com.yuri.persona_im_maker.chat.session

import com.yuri.im.schema.ChatSession
import com.yuri.persona.im.task.state.DataOf
import com.yuri.persona.im.task.state.ErrorOf
import com.yuri.persona.im.task.state.ResultOf

object TemporaryMemoryCache : ChatSessionRepo {
    private val cache = mutableMapOf<String, ChatSession>()

    override suspend fun getAll(): ResultOf<List<ChatSession>, Throwable> {
        return DataOf(cache.values.toList())
    }

    override suspend fun add(chatSession: ChatSession): ResultOf<Unit, Throwable> {
        cache[chatSession.sessionID] = chatSession
        return DataOf(Unit)
    }

    override suspend fun get(sessionID: String): ResultOf<ChatSession, Throwable> {
        val result = cache[sessionID]
            ?: return ErrorOf(NoSuchElementException("ChatSession with sessionID $sessionID not found"))
        return DataOf(result)
    }

    override suspend fun remove(sessionID: String): ResultOf<Unit, Throwable> {
        cache.remove(sessionID)
        return DataOf(Unit)
    }
}