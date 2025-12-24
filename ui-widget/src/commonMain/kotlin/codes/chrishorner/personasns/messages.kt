package codes.chrishorner.personasns

import com.yuri.im.schema.ChatMessage
import com.yuri.im.schema.ChatSession
import com.yuri.im.schema.PlainText
import com.yuri.im.schema.ReplyOptions

class MessagesState(private val chatSession: ChatSession, ) {
    private var messageList: MutableList<ChatMessage> = chatSession.messages.toMutableList()

    private var count = 0

    fun selectOption(index: Int): AdvanceResult {
        val currentMessage = messageList[count - 1] as ReplyOptions
        messageList.apply {
            set(count - 1, PlainText(text = currentMessage.options[index]))
        }

        return AdvanceResult(
            popLast = true,
            messages = messageList.take(count)
        )
    }

    data class AdvanceResult(
        val popLast: Boolean,
        val messages: List<ChatMessage>
    )

    fun advance(optionIndex: Int = 0): AdvanceResult {
        val previousMessage = messageList.getOrNull(count - 1)
        if (previousMessage is ReplyOptions) {
            selectOption(optionIndex)
            return AdvanceResult(
                popLast = true,
                messages = messageList.take(count)
            )
        }

        count++

        if (count > messageList.size) {
            count = 1
            messageList = chatSession.messages.toMutableList()
        }

        return AdvanceResult(
            popLast = false,
            messages = messageList.take(count)
        )
    }
}