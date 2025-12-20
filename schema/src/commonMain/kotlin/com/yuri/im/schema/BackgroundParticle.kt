package com.yuri.im.schema

/**
 * Background particle. 背景粒子。
 */
enum class BackgroundParticle(val id: Int) {
    /**
     * Unknown background particle. 未知背景粒子。
     */
    UNKNOWN(0),

    /**
     * None background particle. 无背景粒子。
     */
    NONE(1),
    /**
     * Sakura background particle. 樱花背景粒子。
     */
    SAKURA(2),
    /**
     * Snowflake background particle. 雪花背景粒子。
     */
    SNOWFLAKE(3)
}