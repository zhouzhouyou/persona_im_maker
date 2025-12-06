package com.yuri.persona_im_maker.ui

import kotlin.js.Promise
import kotlinx.browser.window
import kotlinx.coroutines.await
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Int8Array
import org.w3c.fetch.Response

actual suspend fun loadResource(file: String): ByteArray? {
    return fetch(file).arrayBuffer().await().asByteArray()
}

private suspend fun fetch(url: String): Response =
    windowFetch(url).await()

@Suppress("CAST_NEVER_SUCCEEDS")
fun ArrayBuffer?.asByteArray(): ByteArray? = this?.run { Int8Array(this) as ByteArray }

private fun windowFetch(url: String) = js("window.fetch(url)").unsafeCast<Promise<Response>>()