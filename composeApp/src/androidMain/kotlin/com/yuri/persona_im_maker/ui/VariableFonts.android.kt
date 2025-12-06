package com.yuri.persona_im_maker.ui

import com.yuri.persona_im_maker.utils.AppContextProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


actual suspend fun loadResource(file: String): ByteArray? {
    return withContext(Dispatchers.IO) {
        val assetManager = AppContextProvider.appContext.assets

        runCatching {
            assetManager.open(file).use { it.readBytes() }
        }.getOrNull()
    }
}