package com.yuri.persona_im_maker.utils

import android.content.Context
import androidx.startup.Initializer

object AppContextProvider {
    lateinit var appContext: Context
        internal set
}

class ContextInitializer: Initializer<Unit> {
    override fun create(context: Context) {
        AppContextProvider.appContext = context.applicationContext
    }

    override fun dependencies(): List<Class<out Initializer<*>?>?> {
        return emptyList()
    }
}
