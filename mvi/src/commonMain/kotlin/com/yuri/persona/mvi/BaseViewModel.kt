package com.yuri.persona.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

interface ViewState

interface ViewEvent

interface UIEvent

fun interface Reducer<S: ViewState, E: ViewEvent> {
    fun reduce(currentState: S, event: E): S
}

abstract class BaseViewModel<S: ViewState, E: ViewEvent, U: UIEvent>(
    private val initialState: S,
    private val reducer: Reducer<S, E>
): ViewModel() {
    private val _stateFlow = MutableStateFlow(initialState)
    val state: StateFlow<S> by lazy {
        _stateFlow.onStart {
            viewModelScope.launch {
                initialDataLoad()
            }
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.Eagerly,
            initialValue = initialState
        )
    }

    open suspend fun initialDataLoad() {

    }

    abstract fun sendUIEvent(event: U)

    protected fun sendEvent(event: E) {
        val newState = reducer.reduce(_stateFlow.value, event)
        val success = _stateFlow.tryEmit(newState)
    }
}