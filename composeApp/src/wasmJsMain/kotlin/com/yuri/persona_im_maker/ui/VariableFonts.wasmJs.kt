package com.yuri.persona_im_maker.ui

import com.yuri.persona_im_maker.loadRes
import com.yuri.persona_im_maker.toByteArray

actual suspend fun loadResource(file: String): ByteArray? {
    return loadRes(file).toByteArray()
}