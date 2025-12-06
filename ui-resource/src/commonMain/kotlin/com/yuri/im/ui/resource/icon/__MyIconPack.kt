package com.yuri.im.ui.resource.icon

import androidx.compose.ui.graphics.vector.ImageVector
import com.yuri.im.ui.resource.icon.myiconpack.Add
import com.yuri.im.ui.resource.icon.myiconpack.Check
import com.yuri.im.ui.resource.icon.myiconpack.Delete
import com.yuri.im.ui.resource.icon.myiconpack.DragIndicator
import com.yuri.im.ui.resource.icon.myiconpack.Edit
import com.yuri.im.ui.resource.icon.myiconpack.Menu
import com.yuri.im.ui.resource.icon.myiconpack.Save
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Add, Check, Delete, DragIndicator, Edit, Menu, Save)
    return __AllIcons!!
  }
