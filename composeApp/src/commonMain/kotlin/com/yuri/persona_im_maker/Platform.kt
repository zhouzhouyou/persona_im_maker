package com.yuri.persona_im_maker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform