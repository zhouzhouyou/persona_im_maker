package codes.chrishorner.personasns

import com.yuri.im.schema.ChatMessage
import com.yuri.im.schema.ChatSession

class MessagesState(private val chatSession: ChatSession) {
    private var count = 0

    fun advance(): List<ChatMessage> {
        count++

        if (count > chatSession.messages.size) {
            count = 1
        }

        return chatSession.messages.take(count)
    }
}