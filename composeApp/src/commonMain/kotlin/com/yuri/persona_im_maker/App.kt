package com.yuri.persona_im_maker

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import com.russhwolf.settings.Settings
import com.yuri.im.schema.*
import com.yuri.persona_im_maker.chat.session.ChatSessionEdit
import com.yuri.persona_im_maker.chat.session.ChatSessionNavHost
import com.yuri.persona_im_maker.chat.session.TemporaryMemoryCache
import kotlinx.coroutines.launch
import androidx.compose.ui.tooling.preview.Preview

class AppWrapper() {
    @Composable
    fun Content() {
        App()
    }
}

@Composable
@Preview
fun App() {
    val cs = rememberCoroutineScope()
    var loading by remember {
        mutableStateOf(true)
    }

    val settings = Settings()

    LaunchedEffect(Unit) {
        cs.launch {
            TemporaryMemoryCache.add(
                ChatSession(
                    sessionID = "1",
                    alias = "",
                    messages = messages,
                )
            )
            loading = false
        }
    }

    MaterialTheme {
        when (loading) {
            true -> LoadingScreen()
            false -> ChatSessionNavHost(settings = settings, startDestination = ChatSessionEdit(sessionID = "1"))
        }
    }
}

@Composable
private fun LoadingScreen() {
    CircularProgressIndicator()
}


