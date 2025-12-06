package com.yuri.im.schema

/**
 * Standard message sender. 标准消息发送者。
 */
enum class StandardMessageSender(val id: Int): ReceivedMessageSender {
    /**
     * fallback
     */
    SENDER_UNKNOWN(0),

    /**
     * Makoto Niijima. 新岛真
     */
    SENDER_MAKOTO(1),

    /**
     * Haru Okumura. 奥村春
     */
    SENDER_HARU(2),

    /**
     * Yusuke Kitagawa. 喜多川佑介
     */
    SENDER_YUSUKE(3),

    /**
     * Ann Takamaki. 高卷杏
     */
    SENDER_ANN(4),

    /**
     * Ryuji Sakamoto. 坂本龙司
     */
    SENDER_RYUJI(5),

    /**
     * Goro Akechi. 明智吾郎
     */
    SENDER_GORO(6),

    /**
     * Futaba Sakura. 佐仓双叶
     */
    SENDER_FUTABA(7),

    /**
     * Chihaya Mifune. 御船千早
     */
    SENDER_CHIHAYA(8),

    /**
     * Munehisa Iwai. 岩井宗久
     */
    SENDER_MUNEHISA(9),

    /**
     * Tae Takemi. 武见妙
     */
    SENDER_TAE(10),

    /**
     * Sadayo Kawakami. 川上贞代
     */
    SENDER_SADAYO(11),

    /**
     * Sadayo Kawakami (Becky). 川上贞代（Becky）
     */
    SENDER_BECKY(12),

    /**
     * Ichiko Ohya. 大宅一子
     */
    SENDER_ICHIKO(13),

    /**
     * Shinya Oda. 织田信也
     */
    SENDER_SHINYA(14),

    /**
     * Hifumi Togo. 东乡一二三
     */
    SENDER_HIFUMI(15),

    /**
     * Yuuki Mishima. 三岛由辉
     */
    SENDER_YUUKI(16),

    /**
     * Toranosuke Yoshida. 吉田寅之助
     */
    SENDER_TORANOSUKE(17),

    /**
     * Kasumi Yoshizawa. 芳泽霞
     */
    SENDER_KASUMI(18),

    /**
     * Sumire Yoshizawa. 芳泽堇
     */
    SENDER_SUMIRE(19),

    /**
     * Takuto Maruki. 丸喜拓人
     */
    SENDER_TAKUTO(20),

    /**
     * Caroline. 卡萝莉娜
     */
    SENDER_CAROLINE(21),

    /**
     * Justine. 芮丝汀娜
     */
    SENDER_JUSTINE(22),

    /**
     * Lala Escargot. 拉拉・埃斯卡戈 (新宿酒吧 Crossroads 老板)
     */
    SENDER_LALA(23),

    /**
     * Alibaba. 阿里巴巴 （双叶）
     */
    SENDER_ALIBABA(24),

    /**
     * Phantom Thieves. 怪盗团
     */
    SENDER_PHANTOM_THIEVES(25),

    /**
     * Ore no Beko. 牛丼店
     */
    SENDER_ORE_NO_BEKO(26),

    /**
     * Triple Seven. 便利店
     */
    SENDER_TRIPLE_SEVEN(27),

    /**
     * Rafflesia. 花店
     */
    SENDER_RAFFLESHIA(28);

    override fun hashKey(): String = "standard $id"
}