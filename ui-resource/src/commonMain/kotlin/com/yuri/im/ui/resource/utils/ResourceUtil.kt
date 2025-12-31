package com.yuri.im.ui.resource.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import com.yuri.im.schema.BuildInCustomMessageSender
import com.yuri.im.schema.ChatMessage
import com.yuri.im.schema.CustomMessageSender
import com.yuri.im.schema.EmotionMarker
import com.yuri.im.schema.MessageSender
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.ReceivedMessageSender
import com.yuri.im.schema.StandardMessageSender
import com.yuri.im.ui.resource.*
import com.yuri.im.ui.resource.custom.*
import com.yuri.im.ui.resource.emotion.*
import com.yuri.im.ui.resource.standard.*
import org.jetbrains.compose.resources.stringResource

object ResourceUtil {
    @Composable
    fun getReceivedMessageAvatarPainter(receiveMessage: ReceiveMessage): Painter {
        return getReceivedMessageSenderAvatarPainter(receiveMessage.sender)
    }

    @Composable
    fun getReceivedMessageSenderAvatarPainter(sender: ReceivedMessageSender): Painter {
        return when (sender) {
            is StandardMessageSender -> rememberVectorPainter(image = getStandardSenderAvatar(sender))
            is BuildInCustomMessageSender -> rememberVectorPainter(image = getBuildInCustomSenderAvatar(sender))
            is CustomMessageSender -> {
                TODO("Not Implemented")
            }
        }
    }

    @Composable
    fun getReceivedMessageSenderPortrait(receiveMessage: ReceiveMessage): Painter {
        return getReceivedMessageSenderPortrait(receiveMessage.sender)
    }

    @Composable
    fun getReceivedMessageSenderPortrait(sender: ReceivedMessageSender): Painter {
        return when (sender) {
            is StandardMessageSender -> rememberVectorPainter(image = getStandardSenderPortrait(sender))
            is BuildInCustomMessageSender -> rememberVectorPainter(image = getBuildInCustomSenderPortrait(sender))
            is CustomMessageSender -> {
                TODO("Not Implemented")
            }
        }
    }

    fun getStandardSenderPortrait(sender: StandardMessageSender): ImageVector {
        // TODO: Some portraits are different from avatars; for example, SENDER_ORE_NO_BEKO and SENDER_TRIPLE_SEVEN are black and white.
        return getStandardSenderAvatar(sender)
    }

    fun getStandardSenderAvatar(send: StandardMessageSender): ImageVector {
        return when (send) {
            StandardMessageSender.SENDER_UNKNOWN -> StandardSenderAvatar.StandardAlibaba
            StandardMessageSender.SENDER_MAKOTO -> StandardSenderAvatar.StandardMakotoNiijima
            StandardMessageSender.SENDER_HARU -> StandardSenderAvatar.StandardHaruOkumura
            StandardMessageSender.SENDER_YUSUKE -> StandardSenderAvatar.StandardYusukeKitagawa
            StandardMessageSender.SENDER_ANN -> StandardSenderAvatar.StandardAnnTakamaki
            StandardMessageSender.SENDER_RYUJI -> StandardSenderAvatar.StandardRyujiSakamoto
            StandardMessageSender.SENDER_GORO -> StandardSenderAvatar.StandardGoroAkechi
            StandardMessageSender.SENDER_FUTABA -> StandardSenderAvatar.StandardFutabaSakura
            StandardMessageSender.SENDER_CHIHAYA -> StandardSenderAvatar.StandardChihayaMifune
            StandardMessageSender.SENDER_MUNEHISA -> StandardSenderAvatar.StandardMunehisaIwai
            StandardMessageSender.SENDER_TAE -> StandardSenderAvatar.StandardTaeTakemi
            StandardMessageSender.SENDER_SADAYO -> StandardSenderAvatar.StandardSadayoKawakami
            StandardMessageSender.SENDER_BECKY -> StandardSenderAvatar.StandardSadayoKawakamiBecky
            StandardMessageSender.SENDER_ICHIKO -> StandardSenderAvatar.StandardIchikoOhya
            StandardMessageSender.SENDER_SHINYA -> StandardSenderAvatar.StandardShinyaOda
            StandardMessageSender.SENDER_HIFUMI -> StandardSenderAvatar.StandardHifumiTogo
            StandardMessageSender.SENDER_YUUKI -> StandardSenderAvatar.StandardYuukiMishima
            StandardMessageSender.SENDER_TORANOSUKE -> StandardSenderAvatar.StandardToranosukeYoshida
            StandardMessageSender.SENDER_KASUMI -> StandardSenderAvatar.StandardKasumiYoshizawa
            StandardMessageSender.SENDER_SUMIRE -> StandardSenderAvatar.StandardSumireYoshizawa
            StandardMessageSender.SENDER_TAKUTO -> StandardSenderAvatar.StandardTakutoMaruki
            StandardMessageSender.SENDER_CAROLINE -> StandardSenderAvatar.StandardCaroline
            StandardMessageSender.SENDER_JUSTINE -> StandardSenderAvatar.StandardJustine
            StandardMessageSender.SENDER_LALA -> StandardSenderAvatar.StandardLalaEscargot
            StandardMessageSender.SENDER_ALIBABA -> StandardSenderAvatar.StandardAlibaba
            StandardMessageSender.SENDER_PHANTOM_THIEVES -> StandardSenderAvatar.StandardPhantomThieves
            StandardMessageSender.SENDER_ORE_NO_BEKO -> StandardSenderAvatar.StandardOreNoBekoColorful
            StandardMessageSender.SENDER_TRIPLE_SEVEN -> StandardSenderAvatar.StandardTripleSeven
            StandardMessageSender.SENDER_RAFFLESHIA -> StandardSenderAvatar.StandardRafflesia
        }
    }

    fun getBuildInCustomSenderPortrait(sender: BuildInCustomMessageSender): ImageVector {
        return getBuildInCustomSenderAvatar(sender)
    }

    fun getBuildInCustomSenderAvatar(sender: BuildInCustomMessageSender): ImageVector {
        return when (sender) {
            BuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN -> StandardSenderAvatar.StandardAlibaba
            BuildInCustomMessageSender.CUSTOM_SENDER_SAE -> BuildInCustomSenderAvatar.CustomSaeNiijima
            BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN -> BuildInCustomSenderAvatar.CustomMorogan
            BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN_HUMAN -> BuildInCustomSenderAvatar.CustomMoroganHuman
        }
    }

    fun getSenderBackgroundColor(sender: ReceivedMessageSender): Color {
        return when (sender) {
            is StandardMessageSender -> when (sender) {
                StandardMessageSender.SENDER_ANN -> BackgroundColors.BG_ANN
                StandardMessageSender.SENDER_MAKOTO -> BackgroundColors.BG_MAKATO
                StandardMessageSender.SENDER_HARU -> BackgroundColors.BG_HARU
                StandardMessageSender.SENDER_YUSUKE -> BackgroundColors.BG_YUSUKE
                StandardMessageSender.SENDER_RYUJI -> BackgroundColors.BG_RYUJI
                StandardMessageSender.SENDER_GORO -> BackgroundColors.BG_GORO
                StandardMessageSender.SENDER_FUTABA -> BackgroundColors.BG_FUTABA
                StandardMessageSender.SENDER_KASUMI -> BackgroundColors.BG_KASUMI
                StandardMessageSender.SENDER_ALIBABA -> BackgroundColors.BG_ALIBABA
                else -> BackgroundColors.BG_DEFAULT
            }

            else -> BackgroundColors.BG_DEFAULT
        }
    }

    fun getChatMessageBackgroundColor(chatMessage: ChatMessage): Color {
        return when (chatMessage) {
            is ReceiveMessage -> getSenderBackgroundColor(chatMessage.sender)
            else -> BackgroundColors.BG_UNSPECIFIED
        }
    }

    fun getEmotionalMarkerImageVector(emotionMarker: EmotionMarker): ImageVector? {
        return when (emotionMarker) {
            EmotionMarker.EMOTION_MARKER_UNKNOWN, EmotionMarker.EMOTION_MARKER_NONE -> null
            EmotionMarker.EMOTION_MARKER_QUESTION_MARK -> EmotionMarkerImage.EmotionMarkerQuestion
            EmotionMarker.EMOTION_MARKER_EXCLAMATION_MARK -> EmotionMarkerImage.EmotionMarkerExclamation
            EmotionMarker.EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK -> EmotionMarkerImage.EmotionMarkerDoubleExclamation
            EmotionMarker.EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK -> EmotionMarkerImage.EmotionMarkerExclamationAndQuestion
        }
    }

    @Composable
    fun getSenderStringResource(sender: MessageSender): String {
        return when (sender) {
            MessageSenderSelf -> stringResource(UiResources.string.sender_ren)
            StandardMessageSender.SENDER_ANN -> stringResource(UiResources.string.sender_ann)
            StandardMessageSender.SENDER_SADAYO -> stringResource(UiResources.string.sender_sadayo)
            StandardMessageSender.SENDER_BECKY -> stringResource(UiResources.string.sender_becky)
            StandardMessageSender.SENDER_TAE -> stringResource(UiResources.string.sender_tae)
            StandardMessageSender.SENDER_CAROLINE -> stringResource(UiResources.string.sender_caroline)
            StandardMessageSender.SENDER_RYUJI -> stringResource(UiResources.string.sender_ryuji)
            StandardMessageSender.SENDER_FUTABA -> stringResource(UiResources.string.sender_futaba)
            StandardMessageSender.SENDER_LALA -> stringResource(UiResources.string.sender_lala)
            StandardMessageSender.SENDER_MAKOTO -> stringResource(UiResources.string.sender_makoto)
            StandardMessageSender.SENDER_HARU -> stringResource(UiResources.string.sender_haru)
            StandardMessageSender.SENDER_YUSUKE -> stringResource(UiResources.string.sender_yusuke)
            StandardMessageSender.SENDER_GORO -> stringResource(UiResources.string.sender_goro)
            StandardMessageSender.SENDER_CHIHAYA -> stringResource(UiResources.string.sender_chihaya)
            StandardMessageSender.SENDER_MUNEHISA -> stringResource(UiResources.string.sender_munehisa)
            StandardMessageSender.SENDER_ICHIKO -> stringResource(UiResources.string.sender_ichiko)
            StandardMessageSender.SENDER_SHINYA -> stringResource(UiResources.string.sender_shinya)
            StandardMessageSender.SENDER_HIFUMI -> stringResource(UiResources.string.sender_hifumi)
            StandardMessageSender.SENDER_YUUKI -> stringResource(UiResources.string.sender_yuuki)
            StandardMessageSender.SENDER_TORANOSUKE -> stringResource(UiResources.string.sender_toranosuke)
            StandardMessageSender.SENDER_KASUMI -> stringResource(UiResources.string.sender_kasumi)
            StandardMessageSender.SENDER_SUMIRE -> stringResource(UiResources.string.sender_sumire)
            StandardMessageSender.SENDER_TAKUTO -> stringResource(UiResources.string.sender_takuto)
            StandardMessageSender.SENDER_JUSTINE -> stringResource(UiResources.string.sender_justine)
            StandardMessageSender.SENDER_ALIBABA -> stringResource(UiResources.string.sender_alibaba)
            StandardMessageSender.SENDER_PHANTOM_THIEVES -> stringResource(UiResources.string.sender_phantom_thieves)
            StandardMessageSender.SENDER_ORE_NO_BEKO -> stringResource(UiResources.string.sender_ore_no_beko)
            StandardMessageSender.SENDER_TRIPLE_SEVEN -> stringResource(UiResources.string.sender_triple_seven)
            StandardMessageSender.SENDER_RAFFLESHIA -> stringResource(UiResources.string.sender_raffleshia)
            BuildInCustomMessageSender.CUSTOM_SENDER_SAE -> stringResource(UiResources.string.sender_sae)
            BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN -> stringResource(UiResources.string.sender_morgana)
            BuildInCustomMessageSender.CUSTOM_SENDER_MOROGAN_HUMAN -> stringResource(UiResources.string.sender_morgana)
            else -> "Unknown"
        }
    }
}