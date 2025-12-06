package codes.chrishorner.personasns

import android.graphics.BlurMaskFilter
import android.graphics.BlurMaskFilter.Blur.NORMAL
import androidx.compose.ui.draw.CacheDrawScope
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.unit.dp

actual fun shadowPaintConfig(paint: Paint): CacheDrawScope.() -> Unit = {
    paint.apply {
        asFrameworkPaint().maskFilter = BlurMaskFilter(4.dp.toPx(), NORMAL)
    }
}