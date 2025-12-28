package com.yuri.persona_im_maker.chat.session.editor

import androidx.lifecycle.viewModelScope
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.Settings
import com.yuri.im.json.JsonSerialUtil
import com.yuri.im.schema.*
import com.yuri.persona.im.task.state.*
import com.yuri.persona.mvi.*
import com.yuri.persona_im_maker.chat.session.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.ExperimentalSerializationApi
import org.jetbrains.compose.resources.getString
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

data class ChatSessionEntry(
    val id: Int,
    val chatMessage: ChatMessage,
)

@OptIn(ExperimentalUuidApi::class)
data class SnackbarMessage(
    val message: String,
    val id: String = Uuid.random().toHexString(),
)


data class ChatSessionEditorViewState(
    val id: String,
    val name: String,
    val initializing: Boolean = false,
    val backgroundParticle: BackgroundParticle = BackgroundParticle.NONE,
    val entries: List<ChatSessionEntry> = emptyList(),
    val favoriteSenders: List<MessageSender> = emptyList(),
    val snackbarMessage: SnackbarMessage? = null,
    // only string now
    val setToClipboardContent: String? = null,
    val importSessionJsonValidateTaskState: TaskState<Unit, Unit, String> = Idle
) : ViewState

sealed interface ChatSessionEditorViewEvent : ViewEvent {
    data class UpdateInitializing(
        val initializing: Boolean
    ) : ChatSessionEditorViewEvent

    data class UpdateEntries(
        val entries: List<ChatSessionEntry>
    ) : ChatSessionEditorViewEvent

    data class UpdateName(
        val name: String
    ) : ChatSessionEditorViewEvent

    data class UpdateBackgroundParticle(
        val backgroundParticle: BackgroundParticle
    ) : ChatSessionEditorViewEvent

    data class UpdateFavoriteSenders(
        val senders: List<MessageSender>
    ) : ChatSessionEditorViewEvent

    data class UpdateSnackbar(
        val message: SnackbarMessage?
    ) : ChatSessionEditorViewEvent

    data class UpdateSetToClipboardContent(
        val content: String?
    ) : ChatSessionEditorViewEvent

    data class ImportSessionJsonValidateTaskState(
        val taskState: TaskState<Unit, Unit, String>
    ) : ChatSessionEditorViewEvent
}

sealed interface ChatSessionEditorUIEvent : UIEvent {

    data class UpdateName(
        val name: String
    ) : ChatSessionEditorUIEvent

    data class AddEntry(
        val chatMessage: ChatMessage,
    ) : ChatSessionEditorUIEvent

    data class ModifyEntry(
        val id: Int,
        val chatMessage: ChatMessage
    ) : ChatSessionEditorUIEvent

    data class DeleteEntry(
        val id: Int
    ) : ChatSessionEditorUIEvent

    data class MoveEntry(
        val id: Int,
        val startIndex: Int,
        val endIndex: Int
    ) : ChatSessionEditorUIEvent

    data object Save : ChatSessionEditorUIEvent

    data class UpdateFavoriteSender(val senders: List<MessageSender>) : ChatSessionEditorUIEvent

    data object ClearSnackbar : ChatSessionEditorUIEvent

    data object ExportSession : ChatSessionEditorUIEvent

    data object ClearSetToClipboardContent : ChatSessionEditorUIEvent

    data class ImportSession(val jsonString: String) : ChatSessionEditorUIEvent

    data object IdleImportSessionValidate : ChatSessionEditorUIEvent

    data class UpdateBackgroundParticle(
        val backgroundParticle: BackgroundParticle
    ) : ChatSessionEditorUIEvent

    data object DeleteAll : ChatSessionEditorUIEvent
}

private val myReducer = Reducer<ChatSessionEditorViewState, ChatSessionEditorViewEvent> { previousState, event ->
    when (event) {
        is ChatSessionEditorViewEvent.UpdateInitializing -> {
            previousState.copy(initializing = event.initializing)
        }

        is ChatSessionEditorViewEvent.UpdateEntries -> {
            previousState.copy(entries = event.entries)
        }

        is ChatSessionEditorViewEvent.UpdateName -> {
            previousState.copy(name = event.name)
        }

        is ChatSessionEditorViewEvent.UpdateFavoriteSenders -> {
            previousState.copy(favoriteSenders = event.senders)
        }

        is ChatSessionEditorViewEvent.UpdateSnackbar -> {
            previousState.copy(snackbarMessage = event.message)
        }

        is ChatSessionEditorViewEvent.UpdateSetToClipboardContent -> {
            previousState.copy(setToClipboardContent = event.content)
        }

        is ChatSessionEditorViewEvent.ImportSessionJsonValidateTaskState -> {
            previousState.copy(importSessionJsonValidateTaskState = event.taskState)
        }

        is ChatSessionEditorViewEvent.UpdateBackgroundParticle -> {
            previousState.copy(backgroundParticle = event.backgroundParticle)
        }
    }
}

@OptIn(ExperimentalUuidApi::class)
class ChatSessionEditorViewModel(
    private val settings: Settings,
    private val chatSessionRepo: ChatSessionRepo,
    private val currentSessionID: String? = null,
    initialState: ChatSessionEditorViewState = ChatSessionEditorViewState(
        id = currentSessionID ?: Uuid.random().toHexString(), name = "", initializing = currentSessionID != null,
    ),
    reducer: Reducer<ChatSessionEditorViewState, ChatSessionEditorViewEvent> = myReducer
) : BaseViewModel<ChatSessionEditorViewState, ChatSessionEditorViewEvent, ChatSessionEditorUIEvent>(
    initialState,
    reducer
) {
    override suspend fun initialDataLoad() {
        initFavoriteSenders()
        initChatSession()
    }

    @OptIn(ExperimentalSerializationApi::class, ExperimentalSettingsApi::class)
    private suspend fun initFavoriteSenders() {
        val favoriteSendersJsonString = settings.getStringOrNull(key = FAVORITE_SENDERS_KEY)

        val favoriteSenders = when (favoriteSendersJsonString) {
            null -> defaultFavoriteSenders
            else -> runCatching {
                JsonSerialUtil.fromJsonToMessageSenderList(favoriteSendersJsonString).take(MAX_FAVORITE_SENDERS)
            }.getOrElse { defaultFavoriteSenders }
        }

        sendEvent(
            ChatSessionEditorViewEvent.UpdateFavoriteSenders(favoriteSenders)
        )
    }

    private suspend fun initChatSession() {
        if (currentSessionID == null) {
            return
        }

        when (val chatSessionResp = chatSessionRepo.get(currentSessionID)) {
            is DataOf -> {
                updateEntries(chatSessionResp.data.mapToChatSessionEntryList())
                sendEvent(
                    ChatSessionEditorViewEvent.UpdateBackgroundParticle(chatSessionResp.data.backgroundParticle)
                )
                sendEvent(ChatSessionEditorViewEvent.UpdateName(chatSessionResp.data.alias))

                sendEvent(ChatSessionEditorViewEvent.UpdateInitializing(false))
            }

            else -> {
                // TODO: 处理错误和加载动画
            }
        }
    }

    private fun ChatSession.mapToChatSessionEntryList(): List<ChatSessionEntry> {
        return messages.map { it.mapToChatSessionEntry() }
    }

    private fun ChatMessage.mapToChatSessionEntry(): ChatSessionEntry {
        return ChatSessionEntry(
            id = entryID++,
            chatMessage = this,
        )
    }

    private var entryID = 0

    private fun updateEntries(entries: List<ChatSessionEntry>) {
        sendEvent(
            ChatSessionEditorViewEvent.UpdateEntries(entries)
        )
    }

    /**
     * move the entry with id from startIndex to endIndex
     */
    private fun List<ChatSessionEntry>.move(id: Int, startIndex: Int, endIndex: Int): List<ChatSessionEntry> {
        val entry = first { it.id == id }
        val newEntries = toMutableList()
        newEntries.removeAt(startIndex)
        newEntries.add(endIndex, entry)
        return newEntries
    }

    private fun buildChatSession(): ChatSession {
        val chatSession = ChatSession(
            sessionID = state.value.id, // 暂时使用0，后续可以从持久化存储中获取
            alias = state.value.name,
            backgroundParticle = state.value.backgroundParticle,
            messages = state.value.entries.map {
               it.chatMessage
            }
        )

        return chatSession
    }

    private suspend fun buildChatSessionJson(): String {
        val chatSession = buildChatSession()

        val json = JsonSerialUtil.toJson(chatSession)
        return json
    }

    fun save() = viewModelScope.launch(Dispatchers.Default) {
        val chatSession = buildChatSession()
        chatSessionRepo.add(chatSession)
    }

    @OptIn(ExperimentalSerializationApi::class, ExperimentalSettingsApi::class)
    private fun updateFavoriteSenders(senders: List<MessageSender>) {
        sendEvent(
            ChatSessionEditorViewEvent.UpdateFavoriteSenders(senders)
        )

        settings.putString(
            key = FAVORITE_SENDERS_KEY,
            value = JsonSerialUtil.messageSenderListToJson(senders)
        )
    }

    private fun toast(message: String?) {
        sendEvent(
            ChatSessionEditorViewEvent.UpdateSnackbar(
                when (message) {
                    null -> null
                    else -> SnackbarMessage(message)
                }
            )
        )
    }

    private fun exportAsJson() = viewModelScope.launch(Dispatchers.Default) {
        // TODO: Add loading dialog support
        runCatching {
            val json = buildChatSessionJson()
            sendEvent(
                ChatSessionEditorViewEvent.UpdateSetToClipboardContent(json)
            )
        }.onSuccess {
            toast(getString(ChatSessionRes.string.export_session_success))
        }.onFailure {
            toast(getString(
                ChatSessionRes.string.failed_to_export_session,
                it.message ?: it.toString()
            ))
        }

    }

    private fun importFromJson(jsonString: String) = viewModelScope.launch(Dispatchers.Default) {
        sendEvent(
            ChatSessionEditorViewEvent.ImportSessionJsonValidateTaskState(ProgressOf(Unit))
        )

        runCatching {
            JsonSerialUtil.fromJson(jsonString)
        }.onSuccess {
            sendEvent(
                ChatSessionEditorViewEvent.ImportSessionJsonValidateTaskState(DataOf(Unit))
            )
            toast(getString(ChatSessionRes.string.import_session_success))
            updateEntries(it.mapToChatSessionEntryList())
        }.onFailure {
            sendEvent(
                ChatSessionEditorViewEvent.ImportSessionJsonValidateTaskState(
                    ErrorOf(
                        getString(
                            ChatSessionRes.string.failed_to_parse_json,
                            it.message ?: it
                        )
                    )
                )
            )
        }
    }

    override fun sendUIEvent(event: ChatSessionEditorUIEvent) {
        when (event) {
            is ChatSessionEditorUIEvent.UpdateName -> {
                sendEvent(
                    ChatSessionEditorViewEvent.UpdateName(event.name)
                )
            }

            is ChatSessionEditorUIEvent.AddEntry -> {
                updateEntries(
                    state.value.entries + ChatSessionEntry(
                        id = entryID++,
                        chatMessage = event.chatMessage
                    )
                )
            }

            is ChatSessionEditorUIEvent.DeleteEntry -> {
                updateEntries(
                    state.value.entries.filterNot { it.id == event.id }
                )
            }

            is ChatSessionEditorUIEvent.ModifyEntry -> {
                updateEntries(
                    state.value.entries.map {
                        if (it.id == event.id) {
                            it.copy(
                                chatMessage = event.chatMessage
                            )
                        } else {
                            it
                        }
                    }
                )
            }

            is ChatSessionEditorUIEvent.MoveEntry -> {
                updateEntries(
                    state.value.entries.move(
                        event.id,
                        event.startIndex,
                        event.endIndex
                    )
                )
            }

            ChatSessionEditorUIEvent.Save -> save()
            is ChatSessionEditorUIEvent.UpdateFavoriteSender -> {
                updateFavoriteSenders(event.senders)
            }

            ChatSessionEditorUIEvent.ClearSnackbar -> {
                toast(null)
            }

            ChatSessionEditorUIEvent.ExportSession -> {
                exportAsJson()
            }

            ChatSessionEditorUIEvent.ClearSetToClipboardContent -> {
                sendEvent(
                    ChatSessionEditorViewEvent.UpdateSetToClipboardContent(null)
                )
            }

            is ChatSessionEditorUIEvent.ImportSession -> {
                importFromJson(event.jsonString)
            }

            ChatSessionEditorUIEvent.IdleImportSessionValidate -> {
                sendEvent(
                    ChatSessionEditorViewEvent.ImportSessionJsonValidateTaskState(Idle)
                )
            }

            is ChatSessionEditorUIEvent.UpdateBackgroundParticle -> {
                sendEvent(
                    ChatSessionEditorViewEvent.UpdateBackgroundParticle(event.backgroundParticle)
                )
            }

            ChatSessionEditorUIEvent.DeleteAll -> {
                updateEntries(emptyList())
            }
        }
    }

    companion object {
        private const val TAG = "ChatSessionEditorViewModel"
        private const val FAVORITE_SENDERS_KEY = "favorite_senders"

        private val defaultFavoriteSenders = listOf(
            MessageSenderSelf,
            StandardMessageSender.SENDER_ANN,
            StandardMessageSender.SENDER_RYUJI,
            StandardMessageSender.SENDER_MAKOTO
        )
        const val MAX_FAVORITE_SENDERS = 4
    }
}