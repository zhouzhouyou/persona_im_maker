package com.yuri.im.json.model

import com.yuri.im.schema.StandardMessageSender
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder


/**
 * IM message senders exists in game. 游戏中会出现在IM中的发送者。
 *
 */
@Serializable(with = JsonStandardMessageSenderSerializer::class)
@SerialName("standard")
internal enum class JsonStandardMessageSender(val value: Int) {
    /**
     * fallback
     */
    SENDER_UNKNOWN(0),

    /**
     * Makoto Niijima. 新岛真
     */
    SENDER_MAKATO(1),

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

    fun toModel(): StandardMessageSender {
        return when (this) {
            SENDER_UNKNOWN -> StandardMessageSender.SENDER_UNKNOWN
            SENDER_MAKATO -> StandardMessageSender.SENDER_MAKOTO
            SENDER_HARU -> StandardMessageSender.SENDER_HARU
            SENDER_YUSUKE -> StandardMessageSender.SENDER_YUSUKE
            SENDER_ANN -> StandardMessageSender.SENDER_ANN
            SENDER_RYUJI -> StandardMessageSender.SENDER_RYUJI
            SENDER_GORO -> StandardMessageSender.SENDER_GORO
            SENDER_FUTABA -> StandardMessageSender.SENDER_FUTABA
            SENDER_CHIHAYA -> StandardMessageSender.SENDER_CHIHAYA
            SENDER_MUNEHISA -> StandardMessageSender.SENDER_MUNEHISA
            SENDER_TAE -> StandardMessageSender.SENDER_TAE
            SENDER_SADAYO -> StandardMessageSender.SENDER_SADAYO
            SENDER_BECKY -> StandardMessageSender.SENDER_BECKY
            SENDER_ICHIKO -> StandardMessageSender.SENDER_ICHIKO
            SENDER_SHINYA -> StandardMessageSender.SENDER_SHINYA
            SENDER_HIFUMI -> StandardMessageSender.SENDER_HIFUMI
            SENDER_YUUKI -> StandardMessageSender.SENDER_YUUKI
            SENDER_TORANOSUKE -> StandardMessageSender.SENDER_TORANOSUKE
            SENDER_KASUMI -> StandardMessageSender.SENDER_KASUMI
            SENDER_SUMIRE -> StandardMessageSender.SENDER_SUMIRE
            SENDER_TAKUTO -> StandardMessageSender.SENDER_TAKUTO
            SENDER_CAROLINE -> StandardMessageSender.SENDER_CAROLINE
            SENDER_JUSTINE -> StandardMessageSender.SENDER_JUSTINE
            SENDER_LALA -> StandardMessageSender.SENDER_LALA
            SENDER_ALIBABA -> StandardMessageSender.SENDER_ALIBABA
            SENDER_PHANTOM_THIEVES -> StandardMessageSender.SENDER_PHANTOM_THIEVES
            SENDER_ORE_NO_BEKO -> StandardMessageSender.SENDER_ORE_NO_BEKO
            SENDER_TRIPLE_SEVEN -> StandardMessageSender.SENDER_TRIPLE_SEVEN
            SENDER_RAFFLESHIA -> StandardMessageSender.SENDER_RAFFLESHIA
        }
    }

    companion object {
        fun fromValue(value: Int): JsonStandardMessageSender? {
            return JsonStandardMessageSender.entries.firstOrNull { it.value == value }
        }
    }
}

internal fun StandardMessageSender.toDto(): JsonStandardMessageSender {
    return when (this) {
        StandardMessageSender.SENDER_UNKNOWN -> JsonStandardMessageSender.SENDER_UNKNOWN
        StandardMessageSender.SENDER_MAKOTO -> JsonStandardMessageSender.SENDER_MAKATO
        StandardMessageSender.SENDER_HARU -> JsonStandardMessageSender.SENDER_HARU
        StandardMessageSender.SENDER_YUSUKE -> JsonStandardMessageSender.SENDER_YUSUKE
        StandardMessageSender.SENDER_ANN -> JsonStandardMessageSender.SENDER_ANN
        StandardMessageSender.SENDER_RYUJI -> JsonStandardMessageSender.SENDER_RYUJI
        StandardMessageSender.SENDER_GORO -> JsonStandardMessageSender.SENDER_GORO
        StandardMessageSender.SENDER_FUTABA -> JsonStandardMessageSender.SENDER_FUTABA
        StandardMessageSender.SENDER_CHIHAYA -> JsonStandardMessageSender.SENDER_CHIHAYA
        StandardMessageSender.SENDER_MUNEHISA -> JsonStandardMessageSender.SENDER_MUNEHISA
        StandardMessageSender.SENDER_TAE -> JsonStandardMessageSender.SENDER_TAE
        StandardMessageSender.SENDER_SADAYO -> JsonStandardMessageSender.SENDER_SADAYO
        StandardMessageSender.SENDER_BECKY -> JsonStandardMessageSender.SENDER_BECKY
        StandardMessageSender.SENDER_ICHIKO -> JsonStandardMessageSender.SENDER_ICHIKO
        StandardMessageSender.SENDER_SHINYA -> JsonStandardMessageSender.SENDER_SHINYA
        StandardMessageSender.SENDER_HIFUMI -> JsonStandardMessageSender.SENDER_HIFUMI
        StandardMessageSender.SENDER_YUUKI -> JsonStandardMessageSender.SENDER_YUUKI
        StandardMessageSender.SENDER_TORANOSUKE -> JsonStandardMessageSender.SENDER_TORANOSUKE
        StandardMessageSender.SENDER_KASUMI -> JsonStandardMessageSender.SENDER_KASUMI
        StandardMessageSender.SENDER_SUMIRE -> JsonStandardMessageSender.SENDER_SUMIRE
        StandardMessageSender.SENDER_TAKUTO -> JsonStandardMessageSender.SENDER_TAKUTO
        StandardMessageSender.SENDER_CAROLINE -> JsonStandardMessageSender.SENDER_CAROLINE
        StandardMessageSender.SENDER_JUSTINE -> JsonStandardMessageSender.SENDER_JUSTINE
        StandardMessageSender.SENDER_LALA -> JsonStandardMessageSender.SENDER_LALA
        StandardMessageSender.SENDER_ALIBABA -> JsonStandardMessageSender.SENDER_ALIBABA
        StandardMessageSender.SENDER_PHANTOM_THIEVES -> JsonStandardMessageSender.SENDER_PHANTOM_THIEVES
        StandardMessageSender.SENDER_ORE_NO_BEKO -> JsonStandardMessageSender.SENDER_ORE_NO_BEKO
        StandardMessageSender.SENDER_TRIPLE_SEVEN -> JsonStandardMessageSender.SENDER_TRIPLE_SEVEN
        StandardMessageSender.SENDER_RAFFLESHIA -> JsonStandardMessageSender.SENDER_RAFFLESHIA
    }
}

internal object JsonStandardMessageSenderSerializer : KSerializer<JsonStandardMessageSender> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("JsonStandardMessageSender", PrimitiveKind.INT)

    override fun deserialize(decoder: Decoder): JsonStandardMessageSender {
        return JsonStandardMessageSender.fromValue(decoder.decodeInt()) ?: JsonStandardMessageSender.SENDER_UNKNOWN
    }

    override fun serialize(encoder: Encoder, value: JsonStandardMessageSender) {
        encoder.encodeInt(value.value)
    }
}