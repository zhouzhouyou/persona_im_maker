package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.MessageSender
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.schema.ReceivedMessageSender
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.Glasses
import com.yuri.im.ui.resource.utils.ResourceUtil

@Composable
internal fun getMessageSenderPainter(sender: MessageSender): Painter {
    return when (sender) {
        is ReceivedMessageSender -> ResourceUtil.getReceivedMessageSenderAvatarPainter(sender)
        MessageSenderSelf -> rememberVectorPainter(MyIconPack.Glasses)
    }
}

@Composable
internal fun SenderDisplay(
    messageSender: MessageSender,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(8.dp)
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(paddingValues)
    ) {
        SenderImage(messageSender = messageSender)
        Spacer(modifier = Modifier.height(4.dp))
        SenderDesc(messageSender = messageSender)
    }
}

@Composable
internal fun SenderImage(
    messageSender: MessageSender,
    modifier: Modifier = Modifier
) {
    Image(
        painter = getMessageSenderPainter(sender = messageSender),
        contentDescription = null,
        modifier = modifier.size(48.dp)
    )
}

@Composable
internal fun SenderDesc(
    messageSender: MessageSender
) {
    Text(
        text = ResourceUtil.getSenderStringResource(messageSender),
        style = MaterialTheme.typography.bodySmall,
        maxLines = 1,
        modifier = Modifier.basicMarquee()
    )
}