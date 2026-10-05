package com.yuri.persona_im_maker.chat.session

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import kotlin.test.Test
import kotlin.test.assertEquals

class PlaybackNavigationTest {
    @Test
    fun switchingLayoutKeepsOnePlaybackEntryAndReturnsToEditor() {
        val editor = ChatSessionEdit("session")
        val backStack = NavBackStack<NavKey>().apply { add(editor) }

        backStack.addSessionDisplayRoute("session", PlaybackLayout.AUTO)
        backStack.addSessionDisplayRoute("session", PlaybackLayout.FULL_SCREEN)
        assertEquals(listOf(editor, ChatSessionDisplay("session", PlaybackLayout.FULL_SCREEN)), backStack.toList())

        backStack.addSessionDisplayRoute("session", PlaybackLayout.AUTO)
        assertEquals(listOf(editor, ChatSessionDisplay("session")), backStack.toList())
        backStack.removeLastOrNull()
        assertEquals(listOf(editor), backStack.toList())
    }

    @Test
    fun repeatedPlaybackDoesNotAddAnotherEntry() {
        val backStack = NavBackStack<NavKey>().apply { add(ChatSessionCreate) }
        repeat(2) { backStack.addSessionDisplayRoute("session", PlaybackLayout.FULL_SCREEN) }
        assertEquals(listOf(ChatSessionCreate, ChatSessionDisplay("session", PlaybackLayout.FULL_SCREEN)), backStack.toList())
    }
}
