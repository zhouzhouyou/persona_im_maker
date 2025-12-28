package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yuri.im.schema.BackgroundParticle
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.Check
import com.yuri.persona_im_maker.chat.session.*
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
internal fun BackgroundParticleSelector(
    modifier: Modifier = Modifier.wrapContentSize(),
    current: BackgroundParticle,
    select: (BackgroundParticle) -> Unit
) {
    val options = listOf(BackgroundParticle.NONE, BackgroundParticle.SAKURA, BackgroundParticle.SNOWFLAKE)
    val optionStrings = options.associateWith {
        stringResource(getBackgroundParticleName(it))
    }
    var expanded by remember { mutableStateOf(false) }

    // fixme: rememberTextFieldState will cause following error:
    // Uncaught ClassCastException: Cannot cast instance of <unknown> to kotlin.Int: incompatible types
    //    at kotlin.createJsError (persona_im_maker-composeApp.uninstantiated.mjs:27:1)
    //    at <persona_im_maker:composeApp>.kotlin.createJsError__externalAdapter (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.kotlin.Throwable.<init> (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.kotlin.Throwable.<init> (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.kotlin.Exception.<init> (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.kotlin.RuntimeException.<init> (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.kotlin.ClassCastException.<init> (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.kotlin.wasm.internal.THROW_CCE_WITH_INFO (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.androidx.compose.foundation.text.input.<no name provided>.restore (NATIVE_IMPLEMENTATIONS.kt:1:1)
    //    at <persona_im_maker:composeApp>.androidx.compose.foundation.text.input.<no name provided>.restore (NATIVE_IMPLEMENTATIONS.kt:1:1)
    val textFieldState = remember {
        TextFieldState()
    }

    LaunchedEffect(current) {
        textFieldState.setTextAndPlaceCursorAtEnd(optionStrings[current]!!)
    }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = it },
        modifier = modifier,
    ) {
        TextField(
            // The `menuAnchor` modifier must be passed to the text field to handle
            // expanding/collapsing the menu on click. A read-only text field has
            // the anchor type `PrimaryNotEditable`.
            modifier = Modifier.menuAnchor(ExposedDropdownMenuAnchorType.PrimaryNotEditable),
            state = textFieldState,
            readOnly = true,
            lineLimits = TextFieldLineLimits.SingleLine,
            label = { Text(stringResource(ChatSessionRes.string.background_particle)) },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
        )

        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            containerColor = MenuDefaults.groupStandardContainerColor,
            shape = MenuDefaults.standaloneGroupShape,
            modifier = Modifier
        ) {
            val optionCount = options.size
            options.forEachIndexed { index, option ->
                DropdownMenuItem(
                    shapes = MenuDefaults.itemShape(index, optionCount),
                    text = {
                        Text(
                            stringResource(getBackgroundParticleName(option)),
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    },
                    selected = current == option,
                    onClick = {
                        select(option)
                    },
                    checkedLeadingIcon = { Icon(MyIconPack.Check, contentDescription = null) },
                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                )
            }
        }
    }
}

private fun getBackgroundParticleName(backgroundParticle: BackgroundParticle): StringResource {
    return when (backgroundParticle) {
        BackgroundParticle.NONE, BackgroundParticle.UNKNOWN -> ChatSessionRes.string.background_particle_none
        BackgroundParticle.SAKURA -> ChatSessionRes.string.background_particle_sakura
        BackgroundParticle.SNOWFLAKE -> ChatSessionRes.string.background_particle_snowflake
    }
}

@Preview
@Composable
private fun TestBackgroundParticleSelector() {
    MaterialTheme {
        Box {
            BackgroundParticleSelector(
                current = BackgroundParticle.NONE,
                select = {}
            )
        }
    }
}