package com.yuri.persona_im_maker.ui

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.io.IOException

actual suspend fun loadResource(file: String): ByteArray?  = withContext(Dispatchers.IO) {
    val classLoader = Thread.currentThread().contextClassLoader
    try {
        classLoader.getResourceAsStream(file).use { inputStream ->
            return@withContext inputStream?.readBytes()
        }
    } catch (e: IOException) {
        e.printStackTrace()
        return@withContext null
    }
}