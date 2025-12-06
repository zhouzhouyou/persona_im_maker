package com.yuri.persona_im_maker.chat.session

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.*
import androidx.navigation3.scene.Scene
import androidx.navigation3.scene.SceneStrategy
import androidx.navigation3.scene.SceneStrategyScope
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowSizeClass.Companion.WIDTH_DP_MEDIUM_LOWER_BOUND
import com.russhwolf.settings.Settings
import com.yuri.im.schema.ChatSession
import com.yuri.persona.im.task.state.Cancelled
import com.yuri.persona.im.task.state.DataOf
import com.yuri.persona.im.task.state.ErrorOf
import com.yuri.persona.im.task.state.Idle
import com.yuri.persona.im.task.state.ProgressOf
import com.yuri.persona.im.task.state.TaskState
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEditorView
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEditorViewModel
import com.yuri.persona_im_maker.chat.session.play.ChatSessionView
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

sealed interface ChatSessionNavRoute: NavKey

@Serializable
data object ChatSessionManage : ChatSessionNavRoute

@Serializable
data object ChatSessionCreate : ChatSessionNavRoute

@Serializable
data class ChatSessionEdit(
    val sessionID: String
) : ChatSessionNavRoute



@Serializable
data class ChatSessionDisplay(
    val sessionID: String
) : ChatSessionNavRoute

private val config = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclass(ChatSessionManage::class, ChatSessionManage.serializer())
            subclass(ChatSessionCreate::class, ChatSessionCreate.serializer())
            subclass(ChatSessionEdit::class, ChatSessionEdit.serializer())
            subclass(ChatSessionDisplay::class, ChatSessionDisplay.serializer())
        }
    }
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun ChatSessionNavHost(settings: Settings, startDestination: ChatSessionNavRoute = ChatSessionCreate) {
    val chatSessionRepo = TemporaryMemoryCache

    val backStack = rememberNavBackStack(config, startDestination)
    val twoPaneStrategy = rememberTwoPaneSceneStrategy<NavKey>()

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        sceneStrategy = twoPaneStrategy,
        entryProvider = entryProvider {
            entry<ChatSessionManage> {
                TODO()
            }

            entry<ChatSessionCreate>(
                metadata = TwoPaneScene.twoPane()
            ) {
                ChatSessionEditorView(
                    viewModel { ChatSessionEditorViewModel(settings, chatSessionRepo) },
                    navToPlay = { backStack.addSessionDisplayRoute(it) },
                    back = { backStack.removeLastOrNull() }
                )
            }

            entry<ChatSessionDisplay>(
                metadata = TwoPaneScene.twoPane()
            ) {
                val chatSessionDisplay: ChatSessionDisplay = it

                ChatDisplayWrapper(
                    chatSessionRepo = chatSessionRepo,
                    chatSessionID = chatSessionDisplay.sessionID,
                    navBack = { backStack.removeLastOrNull() }
                )
            }

            entry<ChatSessionEdit>(
                metadata = TwoPaneScene.twoPane()
            ) {
                val chatSessionEdit: ChatSessionEdit = it
                ChatSessionEditorView(
                    viewModel { ChatSessionEditorViewModel(settings, chatSessionRepo, chatSessionEdit.sessionID) },
                    navToPlay = { backStack.addSessionDisplayRoute(it) },
                    back = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}
private fun NavBackStack<NavKey>.addSessionDisplayRoute(sessionID: String) {
    val chatSessionDisplayRoute = ChatSessionDisplay(sessionID)
    // Avoid adding the same product route to the back stack twice.
    if (!contains(chatSessionDisplayRoute)) {
        add(chatSessionDisplayRoute)
    }
}


@Composable
private fun ChatDisplayWrapper(chatSessionRepo: ChatSessionRepo, chatSessionID: String, navBack: () -> Unit) {
    var chatSession: TaskState<ChatSession, Unit, Throwable> by remember(chatSessionID) {
        mutableStateOf(ProgressOf(Unit))
    }

    LaunchedEffect(chatSessionID) {
        chatSession = chatSessionRepo.get(chatSessionID)
    }

    when (val session = chatSession) {
        is ProgressOf -> {
            LinearProgressIndicator()
        }
        is DataOf -> {
            ChatSessionView(
                chatSession = session.data,
                navBack = navBack
            )
        }
        is ErrorOf -> {
            Text(session.error.message ?: "Unknown error")
        }
        Idle, Cancelled -> {
            // ignored
        }
    }
}

// --- TwoPaneScene ---
/**
 * A custom [Scene] that displays two [NavEntry]s side-by-side in a 50/50 split.
 */
class TwoPaneScene<T : Any>(
    override val key: Any,
    override val previousEntries: List<NavEntry<T>>,
    val firstEntry: NavEntry<T>,
    val secondEntry: NavEntry<T>
) : Scene<T> {
    override val entries: List<NavEntry<T>> = listOf(firstEntry, secondEntry)
    override val content: @Composable (() -> Unit) = {
        Row(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.weight(0.5f)) {
                firstEntry.Content()
            }
            Column(modifier = Modifier.weight(0.5f)) {
                secondEntry.Content()
            }
        }
    }

    companion object {
        internal const val TWO_PANE_KEY = "TwoPane"
        /**
         * Helper function to add metadata to a [NavEntry] indicating it can be displayed
         * in a two-pane layout.
         */
        fun twoPane() = mapOf(TWO_PANE_KEY to true)
    }
}


@Composable
fun <T: Any> rememberTwoPaneSceneStrategy() : TwoPaneSceneStrategy<T> {
    val windowSizeClass = currentWindowAdaptiveInfo().windowSizeClass

    return remember(windowSizeClass){
        TwoPaneSceneStrategy(windowSizeClass)
    }
}


// --- TwoPaneSceneStrategy ---
/**
 * A [SceneStrategy] that activates a [TwoPaneScene] if the window is wide enough
 * and the top two back stack entries declare support for two-pane display.
 */
class TwoPaneSceneStrategy<T : Any>(val windowSizeClass: WindowSizeClass) : SceneStrategy<T> {

    override fun SceneStrategyScope<T>.calculateScene(entries: List<NavEntry<T>>): Scene<T>? {

        // Condition 1: Only return a Scene if the window is sufficiently wide to render two panes.
        // We use isWidthAtLeastBreakpoint with WIDTH_DP_MEDIUM_LOWER_BOUND (600dp).
        if (!windowSizeClass.isWidthAtLeastBreakpoint(WIDTH_DP_MEDIUM_LOWER_BOUND)) {
            return null
        }

        val lastTwoEntries = entries.takeLast(2)

        // Condition 2: Only return a Scene if there are two entries, and both have declared
        // they can be displayed in a two pane scene.
        return if (lastTwoEntries.size == 2
            && lastTwoEntries.all { it.metadata.containsKey(TwoPaneScene.TWO_PANE_KEY) }
        ) {
            val firstEntry = lastTwoEntries.first()
            val secondEntry = lastTwoEntries.last()

            // The scene key must uniquely represent the state of the scene.
            // A Pair of the first and second entry keys ensures uniqueness.
            val sceneKey = Pair(firstEntry.contentKey, secondEntry.contentKey)

            TwoPaneScene(
                key = sceneKey,
                // Where we go back to is a UX decision. In this case, we only remove the top
                // entry from the back stack, despite displaying two entries in this scene.
                // This is because in this app we only ever add one entry to the
                // back stack at a time. It would therefore be confusing to the user to add one
                // when navigating forward, but remove two when navigating back.
                previousEntries = entries.dropLast(1),
                firstEntry = firstEntry,
                secondEntry = secondEntry
            )

        } else {
            null
        }
    }


}