package com.yuri.im.ui.resource.standard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.StandardSenderAvatar
import kotlin.Unit

public val StandardSenderAvatar.StandardShinyaOda: ImageVector
    get() {
        if (_standardShinyaOda != null) {
            return _standardShinyaOda!!
        }
        _standardShinyaOda = Builder(name = "StandardShinyaOda", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.9f, 136.7f)
                curveTo(389.6f, 121.9f, 392.6f, 116.0f, 411.4f, 110.3f)
                curveTo(434.9f, 103.1f, 447.4f, 117.2f, 468.9f, 120.0f)
                curveTo(477.7f, 121.4f, 487.3f, 120.8f, 496.1f, 121.9f)
                curveTo(517.6f, 124.6f, 539.4f, 126.1f, 560.8f, 129.1f)
                curveTo(598.3f, 134.4f, 648.6f, 133.1f, 671.2f, 169.2f)
                curveTo(685.3f, 191.6f, 695.6f, 217.6f, 707.3f, 241.4f)
                curveTo(716.0f, 259.4f, 725.5f, 277.2f, 732.7f, 295.9f)
                curveTo(738.6f, 310.9f, 742.6f, 328.2f, 747.3f, 343.5f)
                curveTo(754.7f, 369.4f, 755.2f, 394.9f, 761.3f, 421.1f)
                curveTo(767.6f, 448.2f, 781.7f, 474.6f, 789.0f, 501.5f)
                curveTo(799.4f, 540.2f, 808.1f, 587.3f, 809.1f, 627.7f)
                curveTo(809.3f, 636.1f, 809.8f, 645.1f, 808.2f, 653.2f)
                curveTo(807.1f, 657.6f, 795.1f, 651.3f, 792.3f, 650.1f)
                curveTo(789.8f, 664.5f, 786.9f, 677.1f, 783.5f, 691.3f)
                curveTo(780.8f, 688.2f, 777.5f, 683.7f, 773.8f, 682.5f)
                curveTo(761.4f, 682.9f, 739.4f, 724.6f, 731.5f, 727.9f)
                curveTo(726.1f, 727.0f, 724.9f, 725.5f, 720.3f, 728.8f)
                curveTo(706.7f, 738.5f, 709.4f, 751.3f, 690.0f, 746.8f)
                curveTo(680.4f, 760.2f, 683.8f, 763.9f, 689.0f, 778.8f)
                curveTo(700.3f, 787.1f, 722.7f, 796.3f, 736.6f, 804.0f)
                lineTo(826.5f, 853.8f)
                curveTo(840.0f, 861.3f, 861.9f, 871.9f, 873.2f, 881.6f)
                curveTo(879.7f, 887.1f, 894.4f, 907.3f, 900.8f, 914.3f)
                curveTo(908.5f, 922.8f, 914.8f, 942.4f, 921.3f, 952.4f)
                curveTo(926.6f, 961.9f, 929.8f, 970.1f, 934.0f, 979.9f)
                curveTo(937.3f, 987.9f, 943.8f, 997.1f, 946.5f, 1005.6f)
                curveTo(943.6f, 1009.8f, 891.9f, 1008.0f, 884.6f, 1007.9f)
                lineTo(773.5f, 1008.0f)
                lineTo(430.0f, 1007.9f)
                lineTo(316.0f, 1007.9f)
                curveTo(296.7f, 1007.9f, 274.7f, 1007.4f, 255.6f, 1008.1f)
                curveTo(259.5f, 998.2f, 262.9f, 988.2f, 265.9f, 978.0f)
                curveTo(267.8f, 971.2f, 274.7f, 942.3f, 278.5f, 937.1f)
                curveTo(302.0f, 905.2f, 344.1f, 888.6f, 377.6f, 869.3f)
                curveTo(386.5f, 864.1f, 404.6f, 856.7f, 410.0f, 849.6f)
                curveTo(419.2f, 837.3f, 427.7f, 815.4f, 434.0f, 801.5f)
                curveTo(419.0f, 792.2f, 404.4f, 783.9f, 390.3f, 773.1f)
                curveTo(388.7f, 771.9f, 387.7f, 771.6f, 385.8f, 772.0f)
                curveTo(385.5f, 776.3f, 385.8f, 778.3f, 383.0f, 781.2f)
                curveTo(372.0f, 772.9f, 350.1f, 740.8f, 337.7f, 730.7f)
                curveTo(337.7f, 730.7f, 333.9f, 729.9f, 333.6f, 729.9f)
                curveTo(332.3f, 732.4f, 329.3f, 738.9f, 326.9f, 739.6f)
                curveTo(321.0f, 737.2f, 307.0f, 715.9f, 302.9f, 709.6f)
                lineTo(299.3f, 709.0f)
                curveTo(295.4f, 704.1f, 289.4f, 697.2f, 286.4f, 692.1f)
                curveTo(281.9f, 693.1f, 279.3f, 694.0f, 275.0f, 692.4f)
                curveTo(266.4f, 689.0f, 264.9f, 691.6f, 257.2f, 693.6f)
                curveTo(255.0f, 684.3f, 241.6f, 634.0f, 231.8f, 635.1f)
                lineTo(227.9f, 638.7f)
                curveTo(223.0f, 636.0f, 223.3f, 626.1f, 221.9f, 620.8f)
                curveTo(208.3f, 624.5f, 194.9f, 628.8f, 181.7f, 633.8f)
                curveTo(159.4f, 642.0f, 140.9f, 651.4f, 116.6f, 652.1f)
                curveTo(88.5f, 653.0f, 81.6f, 650.8f, 59.4f, 634.4f)
                curveTo(60.2f, 630.2f, 62.6f, 614.4f, 64.2f, 611.4f)
                curveTo(73.9f, 593.3f, 95.1f, 581.3f, 111.0f, 568.9f)
                curveTo(125.7f, 557.4f, 144.4f, 550.6f, 158.8f, 539.0f)
                curveTo(177.6f, 523.8f, 194.1f, 503.6f, 213.4f, 489.3f)
                curveTo(208.9f, 465.4f, 203.5f, 437.5f, 200.8f, 413.3f)
                curveTo(197.8f, 386.1f, 200.3f, 355.4f, 199.5f, 328.0f)
                curveTo(199.5f, 311.6f, 208.7f, 285.0f, 217.5f, 271.1f)
                curveTo(222.6f, 263.1f, 240.8f, 248.7f, 248.8f, 241.7f)
                lineTo(291.6f, 204.2f)
                curveTo(308.1f, 189.8f, 325.1f, 173.5f, 342.0f, 159.8f)
                curveTo(352.0f, 151.6f, 369.6f, 143.7f, 380.9f, 136.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(521.2f, 381.1f)
                curveTo(525.4f, 389.2f, 531.3f, 412.7f, 535.4f, 415.0f)
                curveTo(539.2f, 413.8f, 540.6f, 410.3f, 542.4f, 406.8f)
                lineTo(543.3f, 405.1f)
                curveTo(549.5f, 429.6f, 552.7f, 463.3f, 555.5f, 488.6f)
                curveTo(561.5f, 482.7f, 563.1f, 480.8f, 568.3f, 474.0f)
                curveTo(572.5f, 484.4f, 573.2f, 486.3f, 582.0f, 493.2f)
                curveTo(580.9f, 504.7f, 578.1f, 513.1f, 575.9f, 523.4f)
                curveTo(573.0f, 537.0f, 561.1f, 582.0f, 562.9f, 594.5f)
                curveTo(566.7f, 594.1f, 565.0f, 590.9f, 568.9f, 591.5f)
                curveTo(571.7f, 596.7f, 570.8f, 602.1f, 574.0f, 605.1f)
                lineTo(575.9f, 605.4f)
                curveTo(579.0f, 601.7f, 583.9f, 589.5f, 586.7f, 584.6f)
                curveTo(590.4f, 578.3f, 592.0f, 576.5f, 596.7f, 571.0f)
                curveTo(596.6f, 586.9f, 599.5f, 603.1f, 598.9f, 618.8f)
                curveTo(598.4f, 634.3f, 588.2f, 665.7f, 580.4f, 679.2f)
                curveTo(577.4f, 684.5f, 572.8f, 689.2f, 568.6f, 693.5f)
                curveTo(546.4f, 715.5f, 473.8f, 777.5f, 443.2f, 777.1f)
                curveTo(437.3f, 777.0f, 432.1f, 773.9f, 427.5f, 770.6f)
                curveTo(412.3f, 759.7f, 399.6f, 744.8f, 385.5f, 732.5f)
                curveTo(372.0f, 720.8f, 356.2f, 711.0f, 343.9f, 698.0f)
                curveTo(337.4f, 690.8f, 331.7f, 682.9f, 327.1f, 674.3f)
                curveTo(318.7f, 658.9f, 294.2f, 597.2f, 300.4f, 582.6f)
                curveTo(308.7f, 576.3f, 319.2f, 591.3f, 328.7f, 588.2f)
                curveTo(330.1f, 585.4f, 330.0f, 586.6f, 329.1f, 583.6f)
                curveTo(320.8f, 575.3f, 308.0f, 572.1f, 315.2f, 558.2f)
                lineTo(316.7f, 557.6f)
                curveTo(319.3f, 559.5f, 320.9f, 562.8f, 323.1f, 565.3f)
                curveTo(331.0f, 574.2f, 345.4f, 576.9f, 353.1f, 566.4f)
                curveTo(357.2f, 560.8f, 356.1f, 555.6f, 355.5f, 549.0f)
                curveTo(359.0f, 552.5f, 364.3f, 559.5f, 369.1f, 558.7f)
                curveTo(369.8f, 557.3f, 370.2f, 556.8f, 371.1f, 555.6f)
                curveTo(375.1f, 554.2f, 374.0f, 554.6f, 378.6f, 555.5f)
                curveTo(381.4f, 558.3f, 380.6f, 558.3f, 384.0f, 559.0f)
                lineTo(385.4f, 557.5f)
                curveTo(385.1f, 550.7f, 364.1f, 517.0f, 359.2f, 511.4f)
                curveTo(387.3f, 481.5f, 422.8f, 454.2f, 450.0f, 423.5f)
                curveTo(477.4f, 392.7f, 480.1f, 388.9f, 521.2f, 381.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.2f, 516.5f)
                curveTo(461.4f, 510.2f, 465.4f, 506.5f, 472.2f, 502.0f)
                curveTo(473.3f, 501.2f, 473.1f, 500.6f, 473.1f, 499.4f)
                curveTo(470.3f, 499.7f, 467.5f, 500.0f, 464.7f, 500.2f)
                curveTo(461.0f, 497.4f, 464.8f, 497.7f, 462.0f, 494.4f)
                curveTo(458.7f, 495.4f, 455.4f, 496.4f, 452.1f, 497.3f)
                curveTo(450.0f, 497.9f, 450.8f, 498.0f, 449.3f, 497.1f)
                curveTo(452.4f, 490.3f, 465.0f, 480.3f, 472.1f, 478.7f)
                curveTo(482.9f, 476.3f, 520.0f, 467.5f, 526.7f, 477.3f)
                lineTo(525.7f, 478.7f)
                curveTo(520.6f, 479.9f, 500.3f, 480.9f, 493.0f, 481.5f)
                curveTo(494.4f, 482.6f, 495.4f, 483.6f, 497.0f, 484.3f)
                lineTo(497.5f, 484.5f)
                curveTo(507.0f, 489.2f, 532.8f, 485.6f, 542.3f, 489.3f)
                curveTo(553.7f, 493.7f, 557.7f, 500.9f, 571.6f, 507.1f)
                curveTo(563.1f, 527.3f, 559.9f, 561.5f, 529.6f, 565.1f)
                curveTo(525.0f, 565.7f, 508.4f, 565.6f, 508.2f, 559.6f)
                curveTo(508.8f, 559.0f, 509.4f, 558.3f, 510.1f, 557.5f)
                curveTo(516.0f, 557.5f, 525.7f, 560.4f, 530.8f, 558.0f)
                curveTo(536.5f, 555.2f, 541.9f, 550.4f, 547.0f, 546.2f)
                curveTo(517.8f, 554.4f, 508.3f, 546.5f, 497.4f, 520.6f)
                curveTo(500.2f, 515.9f, 503.7f, 510.5f, 501.4f, 505.2f)
                lineTo(499.5f, 504.9f)
                curveTo(496.2f, 508.4f, 492.6f, 510.2f, 488.3f, 512.7f)
                curveTo(480.0f, 517.5f, 480.3f, 528.1f, 478.0f, 536.5f)
                curveTo(476.6f, 541.8f, 473.8f, 545.2f, 467.4f, 543.5f)
                curveTo(465.7f, 543.1f, 466.0f, 542.8f, 465.2f, 541.1f)
                curveTo(466.3f, 530.5f, 471.7f, 520.9f, 476.2f, 511.1f)
                lineTo(456.2f, 516.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(493.0f, 481.5f)
                curveTo(494.4f, 482.6f, 495.4f, 483.6f, 497.0f, 484.3f)
                curveTo(489.2f, 490.2f, 478.7f, 489.0f, 469.2f, 488.7f)
                curveTo(477.7f, 484.8f, 484.0f, 483.1f, 493.0f, 481.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(385.5f, 579.0f)
                curveTo(388.3f, 579.8f, 388.7f, 580.0f, 390.5f, 582.2f)
                curveTo(394.2f, 593.3f, 386.0f, 626.4f, 382.6f, 638.0f)
                curveTo(396.5f, 647.4f, 402.1f, 645.2f, 417.5f, 647.8f)
                curveTo(419.8f, 648.2f, 419.7f, 648.6f, 420.6f, 650.2f)
                curveTo(420.0f, 653.7f, 417.4f, 655.8f, 415.0f, 658.4f)
                curveTo(409.9f, 664.5f, 374.9f, 645.7f, 376.0f, 640.2f)
                curveTo(380.6f, 617.9f, 385.1f, 602.1f, 385.5f, 579.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.1f, 714.8f)
                curveTo(425.0f, 714.1f, 403.1f, 726.9f, 438.0f, 721.6f)
                curveTo(442.9f, 723.6f, 449.9f, 725.9f, 452.8f, 730.1f)
                curveTo(452.7f, 733.2f, 453.0f, 732.0f, 450.6f, 734.8f)
                curveTo(431.9f, 747.0f, 407.2f, 741.2f, 407.1f, 714.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.8f, 689.0f)
                curveTo(409.3f, 688.8f, 434.2f, 696.5f, 448.1f, 698.9f)
                curveTo(452.8f, 699.7f, 459.7f, 696.4f, 463.4f, 699.1f)
                lineTo(462.7f, 700.3f)
                lineTo(460.5f, 701.0f)
                curveTo(455.2f, 702.6f, 450.5f, 703.7f, 445.8f, 706.9f)
                curveTo(430.2f, 706.2f, 423.5f, 705.8f, 408.3f, 701.9f)
                curveTo(404.6f, 696.2f, 400.9f, 693.5f, 395.8f, 689.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.7f, 439.2f)
                lineTo(481.8f, 439.3f)
                lineTo(481.9f, 440.4f)
                curveTo(474.6f, 445.4f, 464.3f, 450.3f, 456.5f, 454.9f)
                curveTo(446.0f, 460.9f, 435.2f, 468.3f, 424.3f, 473.3f)
                curveTo(422.9f, 472.6f, 422.3f, 471.5f, 421.4f, 470.1f)
                curveTo(421.3f, 468.4f, 420.8f, 466.7f, 421.8f, 465.5f)
                curveTo(431.3f, 453.3f, 466.8f, 443.3f, 480.7f, 439.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.8f, 145.5f)
                curveTo(433.9f, 145.3f, 434.5f, 145.5f, 435.7f, 145.7f)
                curveTo(439.4f, 150.7f, 453.9f, 191.4f, 458.3f, 201.0f)
                curveTo(407.0f, 214.1f, 348.8f, 221.6f, 306.9f, 256.7f)
                curveTo(303.8f, 259.3f, 298.1f, 261.8f, 294.3f, 263.5f)
                curveTo(298.1f, 265.1f, 299.8f, 265.8f, 303.2f, 268.0f)
                curveTo(304.9f, 272.0f, 303.5f, 284.0f, 302.9f, 288.7f)
                curveTo(300.5f, 291.6f, 299.7f, 290.0f, 295.0f, 291.8f)
                curveTo(292.3f, 297.3f, 295.7f, 318.5f, 297.2f, 324.9f)
                curveTo(290.5f, 328.4f, 281.8f, 331.7f, 274.6f, 334.6f)
                curveTo(273.3f, 327.9f, 271.2f, 307.4f, 267.9f, 304.2f)
                curveTo(255.9f, 303.2f, 258.5f, 315.2f, 260.1f, 323.0f)
                curveTo(261.8f, 331.3f, 263.7f, 339.6f, 265.8f, 347.8f)
                curveTo(279.3f, 340.6f, 287.4f, 337.8f, 301.8f, 333.5f)
                curveTo(304.6f, 340.3f, 308.0f, 347.6f, 311.1f, 354.4f)
                curveTo(304.4f, 356.3f, 285.3f, 360.5f, 284.1f, 367.3f)
                curveTo(285.2f, 369.0f, 287.5f, 372.6f, 289.0f, 372.4f)
                curveTo(293.5f, 372.0f, 307.1f, 364.6f, 311.3f, 362.7f)
                curveTo(312.5f, 368.6f, 313.9f, 372.7f, 315.7f, 378.4f)
                curveTo(308.3f, 381.2f, 291.5f, 389.5f, 289.4f, 397.6f)
                curveTo(290.3f, 401.3f, 289.6f, 399.9f, 292.5f, 402.9f)
                curveTo(298.2f, 404.3f, 310.6f, 396.9f, 317.6f, 394.0f)
                curveTo(320.8f, 396.7f, 323.4f, 402.9f, 325.4f, 406.8f)
                curveTo(316.9f, 414.7f, 301.9f, 418.7f, 299.1f, 424.1f)
                curveTo(304.2f, 427.1f, 313.3f, 423.4f, 318.6f, 421.7f)
                curveTo(306.1f, 431.6f, 295.6f, 434.7f, 281.9f, 442.2f)
                curveTo(262.7f, 452.6f, 244.8f, 462.6f, 227.4f, 475.7f)
                curveTo(226.4f, 462.8f, 222.9f, 443.8f, 221.2f, 430.3f)
                curveTo(217.6f, 404.6f, 215.8f, 378.7f, 215.6f, 352.7f)
                curveTo(215.2f, 329.5f, 213.7f, 312.9f, 230.1f, 294.1f)
                curveTo(246.6f, 275.1f, 264.4f, 259.7f, 283.2f, 243.2f)
                curveTo(309.4f, 220.1f, 335.1f, 196.2f, 363.8f, 176.0f)
                curveTo(380.0f, 164.4f, 397.0f, 156.5f, 413.8f, 146.1f)
                lineTo(432.8f, 145.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.3f, 175.9f)
                curveTo(407.8f, 176.3f, 409.1f, 176.3f, 412.1f, 178.1f)
                curveTo(415.5f, 185.7f, 402.9f, 191.4f, 397.3f, 193.9f)
                curveTo(394.5f, 195.2f, 393.3f, 194.9f, 391.2f, 193.2f)
                curveTo(389.1f, 183.6f, 397.0f, 179.1f, 404.3f, 175.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.2f, 387.2f)
                lineTo(457.6f, 388.1f)
                curveTo(457.2f, 396.2f, 384.4f, 461.6f, 373.6f, 470.9f)
                curveTo(342.5f, 497.7f, 302.2f, 536.9f, 262.3f, 550.3f)
                curveTo(234.0f, 559.8f, 192.8f, 560.8f, 163.0f, 567.5f)
                curveTo(140.8f, 571.6f, 125.4f, 582.9f, 107.8f, 583.1f)
                lineTo(107.0f, 583.0f)
                lineTo(106.5f, 582.1f)
                curveTo(110.3f, 578.3f, 126.3f, 570.4f, 132.0f, 567.3f)
                curveTo(162.3f, 550.6f, 185.9f, 529.8f, 210.2f, 505.6f)
                curveTo(220.5f, 495.3f, 235.3f, 484.1f, 246.8f, 474.5f)
                curveTo(272.3f, 453.2f, 304.7f, 437.5f, 334.6f, 423.1f)
                curveTo(340.7f, 420.2f, 362.7f, 414.3f, 370.2f, 412.1f)
                curveTo(398.1f, 403.8f, 428.0f, 394.1f, 456.2f, 387.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(658.7f, 423.4f)
                curveTo(673.1f, 428.5f, 676.8f, 439.5f, 663.6f, 448.9f)
                curveTo(655.1f, 454.9f, 654.8f, 463.1f, 656.8f, 473.0f)
                curveTo(657.7f, 477.4f, 671.3f, 477.6f, 672.5f, 484.4f)
                curveTo(673.6f, 490.5f, 668.1f, 498.7f, 662.3f, 500.5f)
                curveTo(659.4f, 501.4f, 655.9f, 498.8f, 653.5f, 497.4f)
                curveTo(646.0f, 501.3f, 637.9f, 534.9f, 626.8f, 537.8f)
                lineTo(625.3f, 536.2f)
                curveTo(624.3f, 530.1f, 628.1f, 516.9f, 625.5f, 513.6f)
                curveTo(622.6f, 515.0f, 620.0f, 518.9f, 618.0f, 521.5f)
                curveTo(607.9f, 534.7f, 594.2f, 543.7f, 580.8f, 553.4f)
                curveTo(583.4f, 547.4f, 585.6f, 541.8f, 587.9f, 535.7f)
                curveTo(590.4f, 529.6f, 595.3f, 517.8f, 595.4f, 511.4f)
                lineTo(594.1f, 510.4f)
                curveTo(590.6f, 511.9f, 588.2f, 516.4f, 586.0f, 519.7f)
                curveTo(587.9f, 511.7f, 599.1f, 469.7f, 605.4f, 468.3f)
                curveTo(607.1f, 471.3f, 606.2f, 479.6f, 606.1f, 483.5f)
                curveTo(611.2f, 476.0f, 615.3f, 466.5f, 619.8f, 458.4f)
                curveTo(624.2f, 450.4f, 628.3f, 444.9f, 633.8f, 437.5f)
                curveTo(634.6f, 452.4f, 629.6f, 473.8f, 630.1f, 493.3f)
                curveTo(640.9f, 475.7f, 649.4f, 460.1f, 654.4f, 440.0f)
                curveTo(655.0f, 437.6f, 658.0f, 436.8f, 660.2f, 435.8f)
                lineTo(660.7f, 434.1f)
                curveTo(657.1f, 428.7f, 656.9f, 429.4f, 658.7f, 423.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.6f, 327.4f)
                curveTo(382.7f, 320.1f, 394.4f, 361.4f, 356.9f, 396.0f)
                curveTo(322.6f, 425.4f, 317.2f, 351.2f, 312.5f, 329.5f)
                curveTo(317.8f, 328.7f, 323.2f, 328.0f, 328.6f, 327.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.1f, 344.3f)
                curveTo(339.4f, 344.1f, 341.7f, 344.0f, 344.0f, 344.0f)
                curveTo(352.8f, 344.2f, 360.8f, 349.9f, 360.3f, 359.4f)
                curveTo(359.8f, 367.2f, 355.7f, 371.1f, 350.4f, 376.1f)
                curveTo(347.1f, 377.8f, 342.6f, 379.5f, 339.1f, 377.7f)
                curveTo(337.2f, 373.3f, 332.0f, 351.9f, 331.0f, 346.8f)
                curveTo(333.3f, 344.4f, 333.2f, 345.0f, 337.1f, 344.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(690.0f, 474.8f)
                curveTo(710.9f, 484.0f, 704.2f, 492.2f, 690.8f, 502.4f)
                curveTo(685.9f, 501.7f, 677.2f, 495.4f, 678.2f, 489.6f)
                curveTo(679.6f, 481.4f, 683.9f, 479.3f, 690.0f, 474.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(702.5f, 450.7f)
                curveTo(718.9f, 454.3f, 721.8f, 462.5f, 710.9f, 475.2f)
                curveTo(694.7f, 480.9f, 685.2f, 463.0f, 702.5f, 450.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(673.4f, 450.7f)
                curveTo(689.8f, 457.4f, 692.0f, 470.0f, 675.4f, 477.5f)
                lineTo(673.8f, 477.4f)
                curveTo(661.5f, 469.1f, 658.8f, 458.6f, 673.4f, 450.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.7f, 143.9f)
                curveTo(451.7f, 145.7f, 476.3f, 190.9f, 479.4f, 199.6f)
                lineTo(475.0f, 199.9f)
                curveTo(468.0f, 196.5f, 448.0f, 152.5f, 444.7f, 143.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(689.8f, 424.1f)
                curveTo(697.9f, 427.3f, 698.9f, 429.8f, 704.5f, 436.6f)
                curveTo(702.1f, 441.3f, 700.0f, 444.5f, 696.1f, 448.0f)
                curveTo(692.7f, 449.5f, 691.8f, 449.8f, 688.2f, 450.5f)
                curveTo(679.9f, 447.3f, 687.5f, 430.4f, 689.8f, 424.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(718.7f, 476.0f)
                curveTo(730.0f, 476.6f, 733.9f, 483.1f, 731.2f, 493.7f)
                lineTo(729.5f, 494.6f)
                lineTo(727.0f, 493.1f)
                curveTo(721.9f, 490.3f, 711.6f, 485.9f, 710.3f, 480.5f)
                curveTo(712.9f, 477.4f, 714.4f, 477.6f, 718.7f, 476.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(660.0f, 526.0f)
                curveTo(663.6f, 526.8f, 664.0f, 526.2f, 665.9f, 528.6f)
                curveTo(666.1f, 535.6f, 656.3f, 547.2f, 651.8f, 553.4f)
                curveTo(651.4f, 554.0f, 650.0f, 555.4f, 649.4f, 556.0f)
                curveTo(649.3f, 552.3f, 651.1f, 535.6f, 651.3f, 529.7f)
                curveTo(654.3f, 528.7f, 657.2f, 527.3f, 660.0f, 526.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(671.3f, 500.5f)
                curveTo(674.3f, 500.5f, 675.0f, 500.4f, 677.8f, 501.7f)
                curveTo(679.7f, 506.2f, 672.7f, 512.8f, 670.3f, 523.4f)
                curveTo(665.9f, 523.1f, 663.1f, 517.3f, 660.8f, 513.9f)
                curveTo(664.9f, 508.9f, 666.3f, 505.7f, 671.3f, 500.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(701.5f, 501.8f)
                lineTo(703.0f, 502.2f)
                curveTo(705.3f, 506.7f, 703.9f, 518.6f, 700.4f, 522.6f)
                lineTo(696.9f, 522.5f)
                lineTo(696.3f, 521.7f)
                curveTo(687.7f, 512.3f, 694.1f, 508.1f, 701.5f, 501.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.1f, 558.7f)
                curveTo(369.4f, 550.7f, 363.3f, 546.8f, 361.3f, 537.9f)
                lineTo(362.3f, 537.7f)
                curveTo(368.1f, 542.3f, 373.7f, 549.7f, 378.6f, 555.5f)
                curveTo(374.0f, 554.6f, 375.1f, 554.2f, 371.1f, 555.6f)
                curveTo(370.2f, 556.8f, 369.8f, 557.3f, 369.1f, 558.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(690.0f, 524.9f)
                curveTo(693.1f, 526.4f, 693.7f, 526.7f, 696.3f, 529.2f)
                curveTo(698.1f, 532.4f, 697.2f, 535.0f, 696.6f, 538.6f)
                curveTo(691.3f, 534.3f, 688.2f, 531.8f, 690.0f, 524.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.901961f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(299.3f, 709.0f)
                lineTo(302.9f, 709.6f)
                curveTo(307.0f, 715.9f, 321.0f, 737.2f, 326.9f, 739.6f)
                curveTo(329.3f, 738.9f, 332.3f, 732.4f, 333.6f, 729.9f)
                curveTo(334.6f, 735.2f, 335.8f, 751.2f, 334.0f, 756.0f)
                lineTo(332.6f, 756.0f)
                curveTo(327.5f, 752.5f, 302.5f, 715.6f, 299.3f, 709.0f)
                close()
            }
        }
        .build()
        return _standardShinyaOda!!
    }

private var _standardShinyaOda: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardShinyaOda, contentDescription = "")
    }
}
