package com.yuri.im.schema

/**
 * Build-in custom message sender. 内建自定义消息发送者。
 */
enum class BuildInCustomMessageSender(val id: Int): ReceivedMessageSender {
    /**
     * fallback
     */
    CUSTOM_SENDER_UNKNOWN(0),

    /**
     * Sae Niijima. 新岛冴
     */
    CUSTOM_SENDER_SAE(1),

    /**
     * Morogan. 摩尔加纳
     */
    CUSTOM_SENDER_MOROGAN(2),

    /**
     * Morogan Human. 摩尔加纳人形态
     */
    CUSTOM_SENDER_MOROGAN_HUMAN(3),


    ;

    override fun hashKey(): String = "buildInCustom $id"
}