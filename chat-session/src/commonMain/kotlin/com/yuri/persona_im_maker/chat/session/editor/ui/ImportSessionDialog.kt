package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.yuri.persona.im.task.state.ErrorOf
import com.yuri.persona.im.task.state.TaskState
import com.yuri.persona_im_maker.chat.session.ChatSessionRes
import com.yuri.persona_im_maker.chat.session.btn_cancel
import com.yuri.persona_im_maker.chat.session.btn_save
import com.yuri.persona_im_maker.chat.session.label_json_string
import com.yuri.persona_im_maker.chat.session.paste_previous_exported_json_here
import org.jetbrains.compose.resources.stringResource

internal sealed interface ImportSessionDialogState {
    data object None: ImportSessionDialogState

    data object Show: ImportSessionDialogState
}

@Composable
internal fun ImportSessionDialog(
    dialogState: ImportSessionDialogState,
    validState: TaskState<Unit, Unit, String>,
    importSessionFromJson: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    if (dialogState == ImportSessionDialogState.None) {
        return
    }

    var jsonString by mutableStateOf("")

    AlertDialog(
        onDismissRequest = onDismiss,
        text = {
            TextField(
                value = jsonString,
                onValueChange = { jsonString = it },
                label = {
                    Text(stringResource(ChatSessionRes.string.label_json_string))
                },
                placeholder = {
                    Text(stringResource(ChatSessionRes.string.paste_previous_exported_json_here))
                },
                isError = validState is ErrorOf,
                supportingText = {
                    if (validState is ErrorOf) {
                        Text(validState.error, color = MaterialTheme.colorScheme.error)
                    }
                }
            )
        },
        confirmButton = {
            TextButton(
                onClick = {
                    importSessionFromJson(jsonString)
                }
            ) {
                Text(stringResource(ChatSessionRes.string.btn_save))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(ChatSessionRes.string.btn_cancel))
            }
        }
    )
}