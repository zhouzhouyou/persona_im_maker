package com.yuri.im.schema

/**
 * Custom message sender. 自定义消息发送者。
 *
 * @property resourceID 资源ID
 */
data class CustomMessageSender(
    val resourceID: Int
): ReceivedMessageSender {
    override fun hashKey(): String = "custom $resourceID"
}
