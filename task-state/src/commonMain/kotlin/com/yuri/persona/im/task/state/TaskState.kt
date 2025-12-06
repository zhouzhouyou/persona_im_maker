package com.yuri.persona.im.task.state

/**
 * 任务状态
 * @param R 任务结果类型
 * @param P 任务进度类型
 * @param E 任务错误类型
 */
sealed interface TaskState<out R, out P, out E>

object Idle: TaskState<Nothing, Nothing, Nothing>

object Cancelled: TaskState<Nothing, Nothing, Nothing>

sealed interface ResultOf<out R, out E>: TaskState<R, Nothing, E>

data class DataOf<T>(val data: T): ResultOf<T, Nothing>

data class ErrorOf<E>(val error: E): ResultOf<Nothing, E>

data class ProgressOf<P>(val progress: P): TaskState<Nothing, P, Nothing>
