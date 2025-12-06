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

public val StandardSenderAvatar.StandardSojiroSakura: ImageVector
    get() {
        if (_standardSojiroSakura != null) {
            return _standardSojiroSakura!!
        }
        _standardSojiroSakura = Builder(name = "StandardSojiroSakura", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.9f, 533.5f)
                curveTo(254.9f, 529.6f, 243.7f, 514.4f, 242.6f, 510.2f)
                curveTo(236.2f, 485.8f, 229.6f, 461.7f, 222.2f, 437.5f)
                curveTo(219.8f, 429.3f, 226.3f, 401.8f, 232.1f, 394.8f)
                curveTo(235.8f, 390.4f, 239.3f, 385.5f, 241.4f, 380.0f)
                lineTo(241.6f, 379.4f)
                curveTo(245.5f, 368.9f, 244.2f, 346.7f, 246.9f, 334.2f)
                curveTo(252.7f, 307.3f, 249.3f, 266.9f, 259.9f, 241.8f)
                curveTo(269.4f, 219.3f, 292.6f, 183.6f, 305.0f, 161.1f)
                curveTo(306.5f, 158.2f, 327.4f, 148.4f, 330.1f, 144.3f)
                curveTo(341.7f, 135.6f, 366.6f, 112.8f, 378.3f, 107.6f)
                curveTo(387.6f, 103.4f, 416.2f, 94.3f, 427.0f, 91.3f)
                curveTo(455.9f, 83.0f, 493.5f, 67.5f, 522.1f, 63.3f)
                curveTo(541.9f, 63.1f, 573.7f, 65.2f, 591.5f, 72.7f)
                curveTo(626.7f, 87.5f, 665.5f, 101.5f, 698.1f, 120.1f)
                curveTo(705.4f, 124.3f, 733.5f, 172.1f, 739.4f, 181.7f)
                lineTo(771.3f, 233.5f)
                curveTo(775.8f, 241.0f, 797.2f, 273.0f, 798.7f, 278.2f)
                curveTo(804.9f, 300.0f, 806.7f, 343.1f, 809.1f, 366.0f)
                lineTo(815.0f, 423.9f)
                curveTo(816.1f, 434.0f, 818.2f, 450.7f, 818.5f, 460.6f)
                curveTo(803.9f, 486.6f, 783.7f, 512.7f, 769.2f, 539.2f)
                curveTo(768.0f, 541.4f, 766.7f, 542.9f, 764.4f, 543.7f)
                curveTo(759.9f, 541.3f, 759.4f, 540.2f, 754.9f, 541.2f)
                curveTo(742.6f, 550.8f, 731.5f, 569.6f, 727.9f, 584.9f)
                curveTo(730.7f, 585.5f, 740.7f, 587.2f, 741.2f, 590.4f)
                curveTo(742.7f, 598.9f, 737.2f, 646.6f, 733.3f, 650.2f)
                curveTo(729.8f, 651.7f, 728.5f, 652.1f, 724.7f, 652.9f)
                curveTo(720.7f, 678.8f, 725.7f, 674.8f, 742.8f, 692.6f)
                curveTo(749.0f, 699.0f, 754.9f, 709.2f, 761.5f, 715.7f)
                curveTo(776.3f, 728.7f, 793.7f, 741.5f, 809.4f, 753.6f)
                lineTo(907.4f, 828.6f)
                curveTo(921.6f, 839.6f, 938.9f, 849.8f, 951.2f, 862.8f)
                curveTo(957.6f, 869.6f, 1000.0f, 953.5f, 1002.2f, 962.9f)
                curveTo(1005.6f, 977.6f, 1004.5f, 996.2f, 1002.8f, 1011.1f)
                curveTo(944.8f, 1012.2f, 881.9f, 1010.9f, 823.5f, 1010.9f)
                lineTo(446.5f, 1010.9f)
                lineTo(318.4f, 1011.0f)
                curveTo(304.4f, 1011.0f, 283.2f, 1009.9f, 270.2f, 1010.3f)
                curveTo(268.4f, 1008.3f, 268.0f, 1008.0f, 268.3f, 1004.7f)
                curveTo(270.8f, 970.7f, 287.0f, 957.5f, 312.1f, 936.8f)
                curveTo(326.3f, 925.1f, 344.2f, 913.3f, 357.7f, 901.4f)
                curveTo(353.5f, 896.4f, 349.8f, 892.0f, 345.2f, 887.3f)
                curveTo(319.5f, 903.7f, 281.2f, 930.3f, 253.0f, 939.2f)
                curveTo(246.5f, 931.4f, 281.6f, 903.1f, 287.1f, 890.7f)
                curveTo(299.2f, 863.3f, 305.1f, 835.7f, 310.7f, 806.4f)
                curveTo(314.9f, 804.7f, 327.2f, 799.6f, 330.5f, 797.6f)
                curveTo(340.6f, 791.4f, 376.2f, 769.7f, 381.2f, 761.3f)
                lineTo(381.1f, 759.2f)
                curveTo(378.7f, 757.0f, 377.5f, 755.8f, 374.0f, 756.2f)
                curveTo(358.5f, 757.9f, 313.9f, 790.8f, 300.5f, 785.5f)
                curveTo(300.7f, 780.2f, 300.0f, 775.3f, 298.7f, 770.2f)
                lineTo(297.0f, 769.5f)
                lineTo(295.3f, 770.6f)
                curveTo(273.8f, 774.5f, 249.6f, 763.2f, 230.8f, 755.3f)
                curveTo(226.6f, 753.6f, 208.5f, 750.3f, 202.6f, 748.9f)
                curveTo(209.2f, 747.9f, 225.5f, 746.6f, 229.3f, 741.8f)
                curveTo(229.2f, 735.0f, 221.7f, 735.5f, 219.0f, 729.6f)
                curveTo(219.5f, 728.9f, 219.5f, 728.2f, 220.6f, 728.2f)
                curveTo(261.7f, 729.9f, 282.3f, 689.2f, 296.3f, 657.2f)
                curveTo(298.8f, 651.6f, 298.2f, 625.4f, 296.4f, 619.2f)
                curveTo(288.4f, 591.8f, 277.2f, 564.5f, 271.1f, 536.6f)
                lineTo(257.9f, 533.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(393.4f, 177.9f)
                lineTo(393.5f, 178.5f)
                curveTo(395.3f, 188.2f, 396.1f, 188.7f, 401.4f, 197.7f)
                curveTo(422.3f, 195.2f, 434.7f, 191.9f, 452.9f, 181.0f)
                curveTo(448.7f, 189.7f, 446.4f, 191.6f, 439.5f, 198.0f)
                curveTo(450.6f, 195.9f, 488.3f, 182.8f, 496.4f, 188.0f)
                curveTo(496.2f, 191.0f, 494.5f, 192.2f, 492.5f, 194.5f)
                curveTo(494.1f, 196.2f, 551.0f, 201.1f, 557.3f, 201.8f)
                curveTo(556.0f, 204.2f, 555.9f, 203.5f, 556.0f, 205.8f)
                curveTo(571.7f, 211.6f, 578.1f, 194.0f, 590.6f, 221.6f)
                curveTo(586.0f, 223.1f, 574.1f, 226.3f, 572.9f, 231.0f)
                curveTo(574.5f, 234.2f, 583.0f, 240.2f, 586.5f, 243.2f)
                curveTo(583.1f, 250.2f, 577.2f, 260.9f, 577.7f, 268.3f)
                curveTo(579.9f, 271.6f, 579.6f, 270.6f, 584.3f, 272.2f)
                curveTo(587.5f, 276.1f, 582.1f, 274.9f, 581.6f, 282.1f)
                curveTo(585.5f, 285.5f, 587.3f, 283.0f, 589.8f, 285.5f)
                curveTo(579.4f, 292.8f, 583.6f, 291.5f, 571.1f, 296.3f)
                curveTo(575.1f, 297.9f, 578.1f, 299.3f, 581.8f, 301.2f)
                curveTo(574.5f, 303.9f, 541.7f, 317.8f, 536.5f, 322.2f)
                curveTo(537.5f, 323.4f, 556.5f, 330.4f, 559.4f, 331.6f)
                curveTo(570.7f, 349.9f, 578.4f, 353.2f, 588.3f, 374.7f)
                curveTo(580.9f, 369.7f, 573.0f, 362.7f, 566.1f, 356.9f)
                curveTo(569.8f, 364.4f, 573.7f, 371.9f, 577.8f, 379.2f)
                curveTo(580.5f, 382.3f, 583.7f, 385.2f, 584.1f, 389.1f)
                lineTo(583.6f, 391.1f)
                curveTo(579.7f, 392.7f, 577.5f, 391.5f, 574.2f, 389.2f)
                curveTo(577.8f, 404.9f, 579.9f, 420.9f, 582.0f, 436.8f)
                curveTo(560.5f, 443.8f, 530.6f, 455.9f, 509.2f, 457.6f)
                curveTo(499.4f, 446.0f, 490.6f, 439.5f, 476.0f, 434.5f)
                curveTo(453.7f, 428.9f, 445.4f, 426.9f, 422.4f, 425.9f)
                curveTo(394.4f, 427.4f, 376.2f, 428.1f, 372.8f, 461.1f)
                curveTo(360.6f, 457.8f, 344.4f, 455.2f, 331.6f, 452.9f)
                curveTo(334.7f, 444.5f, 340.6f, 424.0f, 338.4f, 415.3f)
                curveTo(334.2f, 398.0f, 315.4f, 357.8f, 300.4f, 348.0f)
                curveTo(266.8f, 326.0f, 269.4f, 341.3f, 282.3f, 299.9f)
                curveTo(290.6f, 272.9f, 294.0f, 234.9f, 312.5f, 210.0f)
                curveTo(321.5f, 198.0f, 334.1f, 195.2f, 346.7f, 188.9f)
                curveTo(348.2f, 188.1f, 354.3f, 180.7f, 355.9f, 178.9f)
                lineTo(352.2f, 197.0f)
                curveTo(370.6f, 190.1f, 376.3f, 188.4f, 393.4f, 177.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.9f, 421.7f)
                curveTo(448.7f, 419.3f, 467.7f, 429.5f, 474.8f, 428.4f)
                curveTo(476.6f, 430.8f, 476.0f, 431.0f, 476.0f, 434.5f)
                curveTo(453.7f, 428.9f, 445.4f, 426.9f, 422.4f, 425.9f)
                lineTo(423.0f, 425.4f)
                curveTo(426.9f, 424.9f, 428.5f, 425.1f, 429.9f, 421.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.9f, 421.7f)
                lineTo(429.2f, 419.0f)
                curveTo(436.2f, 412.2f, 468.0f, 422.0f, 474.8f, 428.4f)
                curveTo(467.7f, 429.5f, 448.7f, 419.3f, 429.9f, 421.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.8f, 345.0f)
                curveTo(408.6f, 343.9f, 441.9f, 359.1f, 454.7f, 365.1f)
                curveTo(458.1f, 366.7f, 469.1f, 374.7f, 472.4f, 377.4f)
                curveTo(462.6f, 377.8f, 420.7f, 347.2f, 408.0f, 364.7f)
                curveTo(409.9f, 365.8f, 412.1f, 367.0f, 414.1f, 367.7f)
                curveTo(426.0f, 371.9f, 434.6f, 380.5f, 445.2f, 387.0f)
                curveTo(455.8f, 393.5f, 466.5f, 399.7f, 477.0f, 406.5f)
                curveTo(487.0f, 412.6f, 491.2f, 415.4f, 499.4f, 423.8f)
                curveTo(493.1f, 420.0f, 472.2f, 406.9f, 465.6f, 406.9f)
                curveTo(462.5f, 410.6f, 461.2f, 410.5f, 456.9f, 408.7f)
                curveTo(447.9f, 404.9f, 439.3f, 401.5f, 430.0f, 398.7f)
                curveTo(426.2f, 403.1f, 419.2f, 414.1f, 413.3f, 411.6f)
                curveTo(410.6f, 408.2f, 410.2f, 402.4f, 409.5f, 398.0f)
                curveTo(403.2f, 403.5f, 399.3f, 405.6f, 392.0f, 409.9f)
                lineTo(384.9f, 402.1f)
                lineTo(383.5f, 385.8f)
                curveTo(379.4f, 384.7f, 374.9f, 383.8f, 370.7f, 383.0f)
                curveTo(372.4f, 364.3f, 376.5f, 350.8f, 395.8f, 345.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.2f, 284.0f)
                curveTo(425.5f, 285.6f, 475.0f, 314.4f, 468.9f, 325.3f)
                lineTo(467.3f, 325.2f)
                curveTo(456.2f, 312.1f, 435.0f, 298.6f, 419.6f, 289.9f)
                curveTo(417.3f, 288.6f, 417.0f, 289.2f, 414.6f, 290.2f)
                curveTo(397.2f, 296.1f, 376.0f, 306.8f, 363.3f, 320.2f)
                curveTo(358.6f, 318.5f, 350.7f, 315.8f, 350.1f, 310.4f)
                curveTo(353.9f, 307.6f, 369.1f, 306.9f, 373.6f, 304.8f)
                curveTo(389.2f, 297.4f, 399.4f, 288.6f, 416.2f, 284.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(428.0f, 267.4f)
                curveTo(436.4f, 266.8f, 444.9f, 267.8f, 453.3f, 268.7f)
                curveTo(444.9f, 270.4f, 433.5f, 270.9f, 424.2f, 272.5f)
                curveTo(419.5f, 273.8f, 414.3f, 276.1f, 410.1f, 274.5f)
                lineTo(410.7f, 272.7f)
                curveTo(417.0f, 268.0f, 420.2f, 268.2f, 428.0f, 267.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(584.2f, 448.4f)
                lineTo(584.9f, 449.1f)
                curveTo(586.6f, 455.8f, 584.6f, 461.6f, 587.7f, 468.1f)
                curveTo(591.3f, 474.1f, 585.8f, 474.7f, 585.4f, 475.8f)
                curveTo(577.6f, 502.8f, 567.0f, 511.4f, 587.1f, 537.7f)
                curveTo(583.2f, 537.8f, 571.2f, 538.1f, 568.5f, 540.1f)
                curveTo(570.5f, 545.8f, 578.2f, 554.9f, 578.7f, 558.2f)
                curveTo(576.1f, 556.7f, 574.1f, 554.8f, 571.7f, 555.1f)
                curveTo(572.8f, 562.7f, 583.0f, 575.5f, 582.6f, 580.0f)
                curveTo(577.7f, 583.0f, 578.0f, 577.8f, 571.5f, 577.0f)
                lineTo(570.1f, 578.3f)
                curveTo(571.4f, 589.2f, 581.5f, 589.2f, 576.2f, 605.2f)
                curveTo(574.0f, 606.9f, 570.9f, 605.3f, 566.7f, 604.9f)
                curveTo(564.7f, 605.9f, 564.0f, 606.5f, 561.9f, 606.4f)
                curveTo(560.4f, 604.2f, 559.9f, 602.8f, 557.4f, 601.9f)
                curveTo(548.5f, 604.8f, 552.2f, 612.7f, 546.5f, 616.1f)
                curveTo(544.3f, 614.9f, 544.0f, 614.8f, 541.6f, 614.4f)
                curveTo(538.2f, 617.1f, 531.4f, 630.1f, 528.6f, 634.9f)
                curveTo(525.9f, 632.2f, 522.8f, 628.2f, 520.3f, 625.2f)
                curveTo(503.8f, 654.3f, 441.8f, 684.5f, 411.3f, 697.0f)
                curveTo(404.6f, 699.8f, 383.1f, 698.6f, 375.5f, 697.7f)
                curveTo(373.9f, 694.6f, 369.9f, 689.6f, 369.0f, 687.1f)
                curveTo(367.5f, 683.4f, 366.4f, 678.8f, 364.8f, 674.5f)
                curveTo(361.7f, 674.7f, 363.6f, 679.8f, 360.1f, 681.6f)
                lineTo(358.9f, 679.7f)
                curveTo(358.0f, 666.4f, 361.5f, 660.4f, 366.3f, 648.2f)
                curveTo(363.4f, 642.6f, 339.6f, 638.5f, 342.3f, 625.9f)
                curveTo(345.9f, 624.7f, 355.2f, 627.1f, 359.3f, 626.5f)
                curveTo(390.8f, 621.8f, 418.1f, 636.8f, 448.8f, 641.0f)
                curveTo(453.6f, 641.6f, 472.5f, 640.8f, 475.0f, 642.7f)
                curveTo(474.7f, 645.9f, 469.8f, 650.7f, 467.3f, 653.8f)
                lineTo(468.0f, 654.7f)
                curveTo(475.5f, 654.3f, 477.1f, 646.2f, 483.1f, 642.7f)
                curveTo(486.8f, 644.8f, 484.5f, 647.4f, 487.9f, 650.6f)
                curveTo(489.5f, 649.1f, 494.4f, 636.5f, 494.3f, 634.1f)
                curveTo(494.1f, 627.9f, 490.3f, 615.2f, 482.5f, 615.4f)
                curveTo(485.2f, 618.9f, 486.6f, 622.0f, 483.6f, 625.9f)
                curveTo(481.3f, 625.0f, 475.1f, 615.0f, 471.9f, 611.5f)
                curveTo(466.9f, 606.5f, 444.9f, 583.8f, 440.3f, 583.3f)
                curveTo(440.9f, 588.6f, 459.8f, 613.2f, 457.8f, 629.3f)
                curveTo(451.0f, 640.5f, 401.0f, 624.6f, 388.2f, 622.8f)
                curveTo(378.9f, 621.5f, 365.9f, 615.4f, 357.2f, 611.4f)
                curveTo(376.3f, 601.9f, 388.3f, 590.4f, 401.5f, 573.4f)
                curveTo(413.2f, 558.3f, 407.5f, 551.6f, 396.8f, 538.9f)
                curveTo(398.6f, 547.6f, 399.5f, 554.0f, 400.6f, 562.8f)
                curveTo(394.8f, 564.8f, 385.9f, 567.3f, 380.8f, 569.9f)
                curveTo(363.8f, 578.9f, 349.4f, 588.3f, 332.0f, 597.0f)
                curveTo(328.6f, 594.5f, 325.9f, 592.1f, 322.7f, 589.4f)
                curveTo(317.8f, 562.0f, 326.0f, 493.8f, 331.3f, 464.5f)
                curveTo(347.6f, 467.4f, 357.8f, 471.0f, 373.1f, 474.6f)
                curveTo(375.8f, 513.6f, 389.6f, 521.4f, 426.0f, 527.9f)
                curveTo(474.3f, 536.5f, 494.7f, 519.5f, 502.5f, 472.4f)
                curveTo(518.5f, 471.2f, 563.9f, 454.0f, 584.2f, 448.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(574.1f, 492.9f)
                curveTo(575.5f, 493.9f, 574.8f, 493.3f, 575.5f, 495.3f)
                curveTo(573.3f, 501.8f, 534.0f, 546.6f, 526.9f, 555.5f)
                lineTo(525.8f, 555.7f)
                lineTo(525.3f, 554.6f)
                curveTo(535.2f, 524.5f, 548.9f, 512.7f, 574.1f, 492.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.8f, 437.0f)
                curveTo(410.8f, 435.9f, 413.5f, 434.7f, 416.7f, 434.8f)
                curveTo(425.2f, 443.6f, 420.0f, 442.1f, 434.1f, 443.4f)
                curveTo(420.6f, 460.1f, 427.6f, 465.3f, 443.8f, 475.3f)
                curveTo(451.0f, 479.1f, 457.0f, 482.1f, 465.2f, 483.9f)
                curveTo(477.8f, 487.0f, 481.9f, 482.3f, 491.2f, 474.7f)
                curveTo(485.6f, 497.3f, 481.4f, 521.9f, 452.5f, 521.2f)
                curveTo(433.0f, 520.6f, 389.6f, 520.2f, 383.3f, 496.1f)
                curveTo(383.8f, 491.5f, 389.6f, 487.8f, 390.4f, 484.2f)
                curveTo(394.1f, 468.3f, 397.1f, 450.1f, 407.8f, 437.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.9f, 460.4f)
                curveTo(422.5f, 464.6f, 419.3f, 470.2f, 425.5f, 474.7f)
                curveTo(434.4f, 481.2f, 472.1f, 501.9f, 475.5f, 510.5f)
                curveTo(459.6f, 509.4f, 444.2f, 501.7f, 432.3f, 491.4f)
                curveTo(421.2f, 481.8f, 413.9f, 475.7f, 416.9f, 460.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.2f, 154.1f)
                curveTo(362.9f, 156.0f, 361.5f, 158.5f, 359.6f, 160.9f)
                curveTo(350.3f, 172.5f, 344.5f, 170.1f, 331.6f, 168.7f)
                lineTo(331.0f, 167.8f)
                curveTo(332.7f, 162.8f, 345.2f, 153.5f, 349.8f, 149.8f)
                curveTo(363.3f, 139.7f, 382.7f, 121.6f, 400.0f, 119.0f)
                curveTo(420.4f, 115.8f, 440.2f, 109.5f, 460.2f, 105.1f)
                curveTo(462.7f, 104.5f, 466.5f, 105.4f, 468.7f, 103.7f)
                curveTo(470.1f, 102.6f, 470.9f, 102.5f, 472.5f, 102.2f)
                lineTo(473.7f, 103.4f)
                curveTo(470.8f, 107.0f, 446.9f, 122.0f, 441.6f, 127.4f)
                curveTo(440.3f, 128.8f, 435.9f, 128.0f, 433.5f, 130.0f)
                curveTo(435.6f, 139.4f, 436.4f, 149.2f, 423.5f, 150.1f)
                curveTo(417.5f, 148.4f, 412.4f, 141.7f, 408.3f, 137.0f)
                curveTo(405.7f, 136.5f, 401.2f, 149.9f, 397.0f, 150.0f)
                curveTo(386.8f, 150.3f, 387.8f, 141.7f, 376.7f, 146.1f)
                curveTo(374.6f, 149.0f, 368.7f, 151.5f, 365.2f, 154.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(643.4f, 417.1f)
                curveTo(652.7f, 418.1f, 659.2f, 421.1f, 663.3f, 429.9f)
                curveTo(669.2f, 442.8f, 670.5f, 462.5f, 665.4f, 475.6f)
                curveTo(655.8f, 500.4f, 627.1f, 523.6f, 603.9f, 534.4f)
                curveTo(603.9f, 527.1f, 604.1f, 522.2f, 604.9f, 514.9f)
                curveTo(633.1f, 501.7f, 649.2f, 499.0f, 649.1f, 463.9f)
                curveTo(647.1f, 451.4f, 645.0f, 448.9f, 638.1f, 438.4f)
                curveTo(650.4f, 442.9f, 651.2f, 443.5f, 658.3f, 453.6f)
                curveTo(661.0f, 453.9f, 660.0f, 454.2f, 662.0f, 452.7f)
                curveTo(663.4f, 448.1f, 660.1f, 442.8f, 658.3f, 438.6f)
                curveTo(647.5f, 413.6f, 628.8f, 430.1f, 623.3f, 448.2f)
                curveTo(621.1f, 455.2f, 622.9f, 465.8f, 623.7f, 473.5f)
                curveTo(621.2f, 476.4f, 612.8f, 485.8f, 609.2f, 485.2f)
                lineTo(608.5f, 483.4f)
                curveTo(612.6f, 467.2f, 619.7f, 438.3f, 627.3f, 424.7f)
                curveTo(632.4f, 421.3f, 637.7f, 419.4f, 643.4f, 417.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(278.4f, 427.6f)
                lineTo(280.1f, 428.7f)
                curveTo(281.5f, 437.2f, 286.4f, 445.4f, 289.0f, 452.9f)
                curveTo(293.4f, 465.9f, 304.0f, 460.9f, 309.4f, 466.5f)
                curveTo(308.3f, 468.9f, 307.7f, 469.8f, 306.2f, 471.9f)
                lineTo(307.6f, 472.9f)
                curveTo(312.3f, 471.3f, 316.7f, 469.5f, 321.3f, 467.7f)
                curveTo(320.9f, 477.1f, 319.4f, 490.3f, 317.6f, 499.4f)
                curveTo(300.1f, 500.9f, 277.6f, 495.9f, 261.4f, 489.1f)
                curveTo(260.4f, 488.7f, 258.9f, 487.6f, 258.0f, 487.0f)
                curveTo(252.2f, 477.0f, 253.3f, 449.9f, 254.1f, 438.6f)
                curveTo(259.1f, 437.2f, 261.0f, 436.5f, 265.7f, 434.3f)
                curveTo(268.3f, 455.8f, 261.4f, 472.5f, 280.4f, 486.9f)
                curveTo(279.1f, 479.3f, 279.6f, 466.8f, 279.5f, 458.8f)
                curveTo(279.4f, 448.4f, 279.0f, 438.0f, 278.4f, 427.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.3f, 345.8f)
                curveTo(274.3f, 345.9f, 279.5f, 346.1f, 281.3f, 346.4f)
                curveTo(288.6f, 347.8f, 309.3f, 363.3f, 309.8f, 370.4f)
                curveTo(303.8f, 375.5f, 290.1f, 371.3f, 289.3f, 383.7f)
                curveTo(289.0f, 389.0f, 295.9f, 389.4f, 299.6f, 390.0f)
                curveTo(318.1f, 392.9f, 330.6f, 402.2f, 331.6f, 421.7f)
                curveTo(322.4f, 420.2f, 299.2f, 410.0f, 293.0f, 412.4f)
                lineTo(293.3f, 413.9f)
                curveTo(295.9f, 416.9f, 302.0f, 418.5f, 306.0f, 419.8f)
                curveTo(298.4f, 420.2f, 281.5f, 420.1f, 275.4f, 415.4f)
                curveTo(274.0f, 406.1f, 275.1f, 394.6f, 274.7f, 384.9f)
                curveTo(274.1f, 371.9f, 272.5f, 358.7f, 272.3f, 345.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.7f, 455.9f)
                curveTo(436.4f, 452.7f, 440.3f, 449.3f, 444.1f, 446.3f)
                curveTo(465.0f, 473.3f, 468.0f, 467.1f, 496.6f, 458.2f)
                curveTo(489.0f, 467.0f, 480.2f, 478.4f, 468.6f, 481.4f)
                lineTo(465.2f, 483.9f)
                curveTo(457.0f, 482.1f, 451.0f, 479.1f, 443.8f, 475.3f)
                lineTo(444.8f, 472.7f)
                curveTo(438.5f, 466.7f, 436.6f, 464.1f, 432.7f, 455.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF151419)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.8f, 472.7f)
                curveTo(452.1f, 476.8f, 460.2f, 480.7f, 468.6f, 481.4f)
                lineTo(465.2f, 483.9f)
                curveTo(457.0f, 482.1f, 451.0f, 479.1f, 443.8f, 475.3f)
                lineTo(444.8f, 472.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.0f, 504.1f)
                curveTo(293.2f, 506.1f, 309.2f, 506.5f, 319.0f, 506.8f)
                curveTo(317.9f, 518.1f, 318.6f, 523.8f, 310.7f, 532.0f)
                lineTo(306.4f, 538.5f)
                curveTo(299.6f, 531.8f, 286.1f, 513.0f, 284.0f, 504.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.6f, 711.1f)
                lineTo(318.3f, 712.3f)
                curveTo(319.1f, 714.0f, 319.0f, 713.9f, 318.8f, 715.7f)
                lineTo(317.3f, 717.0f)
                lineTo(317.4f, 718.7f)
                curveTo(319.8f, 718.0f, 321.1f, 717.1f, 323.0f, 717.9f)
                curveTo(320.6f, 724.2f, 305.1f, 740.6f, 297.4f, 738.8f)
                curveTo(297.9f, 736.3f, 298.4f, 735.2f, 297.5f, 732.9f)
                lineTo(295.5f, 732.5f)
                lineTo(292.2f, 735.4f)
                curveTo(288.6f, 736.8f, 284.5f, 735.0f, 280.7f, 733.9f)
                curveTo(294.8f, 727.9f, 302.4f, 721.0f, 313.6f, 711.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(452.1f, 125.0f)
                curveTo(456.8f, 125.9f, 461.4f, 127.5f, 466.0f, 128.9f)
                curveTo(466.1f, 133.3f, 465.7f, 138.3f, 465.4f, 142.7f)
                curveTo(461.7f, 146.0f, 460.0f, 147.1f, 455.8f, 149.7f)
                curveTo(442.0f, 151.0f, 435.6f, 133.3f, 452.1f, 125.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(295.0f, 431.4f)
                curveTo(304.6f, 436.9f, 296.0f, 448.2f, 319.7f, 455.9f)
                curveTo(318.4f, 458.2f, 317.3f, 458.2f, 314.5f, 459.6f)
                curveTo(296.3f, 461.8f, 294.3f, 456.9f, 287.8f, 441.3f)
                curveTo(290.5f, 438.2f, 292.7f, 434.8f, 295.0f, 431.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(484.6f, 127.2f)
                lineTo(490.5f, 126.9f)
                curveTo(507.1f, 134.8f, 485.6f, 159.2f, 479.1f, 145.9f)
                curveTo(482.0f, 144.3f, 484.1f, 143.4f, 484.9f, 140.1f)
                curveTo(480.0f, 141.2f, 475.7f, 144.1f, 472.8f, 139.5f)
                curveTo(473.2f, 130.3f, 476.7f, 129.6f, 484.6f, 127.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(742.8f, 249.7f)
                curveTo(748.3f, 251.2f, 754.1f, 259.0f, 752.3f, 264.7f)
                curveTo(749.4f, 266.5f, 743.2f, 265.4f, 739.4f, 265.2f)
                lineTo(738.3f, 266.5f)
                curveTo(738.9f, 269.5f, 740.7f, 271.0f, 742.9f, 273.4f)
                curveTo(743.2f, 273.5f, 743.5f, 274.4f, 743.7f, 274.8f)
                curveTo(737.0f, 277.6f, 727.3f, 272.2f, 729.8f, 263.8f)
                curveTo(732.4f, 255.0f, 735.7f, 254.0f, 742.8f, 249.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.2f, 154.1f)
                curveTo(368.7f, 151.5f, 374.6f, 149.0f, 376.7f, 146.1f)
                lineTo(379.4f, 149.1f)
                lineTo(390.2f, 156.7f)
                curveTo(389.8f, 160.1f, 389.2f, 164.9f, 389.0f, 168.3f)
                curveTo(383.5f, 169.9f, 378.6f, 171.3f, 373.4f, 173.7f)
                curveTo(375.1f, 169.6f, 377.9f, 164.6f, 376.8f, 160.6f)
                curveTo(372.1f, 159.5f, 369.5f, 161.0f, 366.9f, 156.6f)
                lineTo(365.2f, 154.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF151419)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.2f, 154.1f)
                curveTo(368.7f, 151.5f, 374.6f, 149.0f, 376.7f, 146.1f)
                lineTo(379.4f, 149.1f)
                curveTo(373.8f, 153.9f, 370.6f, 153.3f, 366.9f, 156.6f)
                lineTo(365.2f, 154.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.9f, 91.9f)
                curveTo(511.9f, 101.6f, 478.1f, 126.3f, 468.9f, 125.7f)
                curveTo(464.8f, 122.5f, 463.5f, 122.2f, 458.5f, 120.6f)
                curveTo(460.1f, 118.4f, 461.9f, 117.3f, 464.3f, 116.2f)
                curveTo(467.8f, 117.0f, 469.0f, 119.8f, 471.4f, 123.0f)
                lineTo(472.9f, 122.0f)
                curveTo(473.4f, 120.8f, 475.0f, 117.2f, 475.9f, 116.5f)
                curveTo(488.0f, 108.1f, 499.9f, 101.8f, 510.9f, 91.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.2f, 707.5f)
                curveTo(294.3f, 702.1f, 308.4f, 686.3f, 312.9f, 683.2f)
                curveTo(314.5f, 684.7f, 314.1f, 683.9f, 314.3f, 686.5f)
                curveTo(312.8f, 687.6f, 311.7f, 688.5f, 310.3f, 689.7f)
                curveTo(315.0f, 691.5f, 317.3f, 688.5f, 321.3f, 690.8f)
                curveTo(319.5f, 695.4f, 311.8f, 703.1f, 308.1f, 706.9f)
                curveTo(305.5f, 705.4f, 305.2f, 705.3f, 302.3f, 704.9f)
                curveTo(296.5f, 703.5f, 294.6f, 704.9f, 289.2f, 707.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.1f, 441.3f)
                curveTo(388.3f, 441.7f, 388.2f, 441.6f, 390.0f, 443.0f)
                curveTo(392.2f, 448.4f, 391.3f, 471.1f, 386.8f, 474.2f)
                lineTo(380.0f, 463.8f)
                curveTo(381.3f, 455.9f, 381.8f, 448.1f, 386.1f, 441.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.6f, 136.9f)
                curveTo(508.7f, 139.6f, 520.9f, 139.0f, 528.9f, 139.1f)
                curveTo(526.3f, 141.8f, 524.1f, 144.4f, 521.7f, 147.3f)
                curveTo(521.0f, 148.4f, 519.2f, 149.6f, 518.1f, 150.4f)
                curveTo(510.7f, 151.4f, 503.0f, 143.6f, 501.6f, 136.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(748.3f, 280.3f)
                curveTo(751.4f, 281.5f, 768.6f, 298.1f, 759.7f, 302.1f)
                curveTo(748.2f, 293.6f, 741.5f, 295.0f, 748.3f, 280.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.3f, 704.9f)
                curveTo(305.2f, 705.3f, 305.5f, 705.4f, 308.1f, 706.9f)
                curveTo(301.6f, 713.0f, 290.4f, 724.2f, 281.5f, 726.1f)
                lineTo(279.8f, 723.3f)
                curveTo(286.9f, 716.8f, 294.3f, 710.4f, 302.3f, 704.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(718.1f, 229.8f)
                curveTo(723.1f, 230.1f, 732.5f, 236.0f, 734.9f, 240.6f)
                curveTo(736.8f, 244.4f, 736.0f, 246.4f, 735.1f, 250.2f)
                curveTo(725.3f, 248.2f, 720.5f, 238.6f, 718.1f, 229.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.9f, 641.5f)
                curveTo(350.4f, 652.5f, 337.6f, 657.9f, 328.7f, 661.9f)
                lineTo(328.1f, 662.3f)
                lineTo(326.8f, 661.9f)
                curveTo(327.4f, 657.3f, 335.0f, 645.7f, 337.9f, 641.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(532.9f, 139.2f)
                curveTo(538.3f, 139.1f, 550.5f, 138.0f, 554.5f, 141.3f)
                curveTo(554.1f, 143.9f, 553.5f, 143.6f, 550.9f, 145.5f)
                lineTo(540.5f, 150.1f)
                curveTo(537.8f, 147.0f, 533.7f, 143.0f, 532.9f, 139.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(764.8f, 303.4f)
                curveTo(770.4f, 304.4f, 777.3f, 310.5f, 777.2f, 316.2f)
                lineTo(775.8f, 315.9f)
                curveTo(770.9f, 314.3f, 763.8f, 314.8f, 761.2f, 312.3f)
                curveTo(761.2f, 308.5f, 762.7f, 307.1f, 764.8f, 303.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(438.6f, 148.5f)
                curveTo(441.4f, 149.0f, 442.9f, 149.8f, 444.2f, 152.1f)
                lineTo(443.5f, 154.1f)
                curveTo(439.7f, 157.9f, 436.4f, 159.0f, 431.6f, 161.0f)
                curveTo(429.0f, 162.1f, 429.9f, 162.1f, 427.8f, 161.4f)
                curveTo(428.4f, 156.5f, 434.7f, 151.9f, 438.6f, 148.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(409.6f, 148.8f)
                curveTo(412.4f, 149.3f, 412.9f, 149.3f, 415.2f, 151.0f)
                lineTo(415.1f, 152.6f)
                curveTo(411.8f, 156.0f, 406.0f, 158.7f, 401.7f, 161.0f)
                curveTo(400.4f, 161.9f, 399.0f, 162.6f, 397.6f, 163.4f)
                lineTo(397.0f, 162.5f)
                curveTo(399.9f, 156.2f, 404.0f, 152.4f, 409.6f, 148.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(503.4f, 117.9f)
                curveTo(506.0f, 117.8f, 506.3f, 118.0f, 508.7f, 119.3f)
                curveTo(510.9f, 122.4f, 510.6f, 121.2f, 510.5f, 124.3f)
                lineTo(508.6f, 125.7f)
                lineTo(503.9f, 124.8f)
                curveTo(500.9f, 125.5f, 498.6f, 126.6f, 496.0f, 125.3f)
                lineTo(495.6f, 123.6f)
                curveTo(497.5f, 120.3f, 499.9f, 119.5f, 503.4f, 117.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(712.0f, 257.1f)
                curveTo(712.4f, 257.0f, 712.8f, 257.0f, 713.3f, 257.0f)
                curveTo(721.7f, 256.3f, 724.9f, 260.9f, 724.9f, 268.5f)
                lineTo(722.3f, 268.3f)
                curveTo(717.2f, 265.5f, 714.3f, 262.5f, 712.0f, 257.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(503.9f, 151.1f)
                curveTo(506.1f, 152.9f, 507.7f, 153.8f, 508.5f, 156.4f)
                curveTo(506.3f, 158.6f, 501.7f, 158.9f, 498.4f, 159.4f)
                curveTo(495.2f, 158.8f, 495.5f, 159.4f, 493.8f, 157.5f)
                curveTo(495.4f, 154.8f, 500.8f, 152.7f, 503.9f, 151.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(279.8f, 723.3f)
                lineTo(281.5f, 726.1f)
                curveTo(278.0f, 728.5f, 268.2f, 734.4f, 264.1f, 733.2f)
                curveTo(266.8f, 729.4f, 275.3f, 725.4f, 279.8f, 723.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.6f, 711.1f)
                curveTo(316.5f, 708.3f, 320.3f, 703.9f, 324.0f, 702.8f)
                curveTo(325.1f, 705.7f, 320.4f, 712.6f, 318.8f, 715.7f)
                curveTo(319.0f, 713.9f, 319.1f, 714.0f, 318.3f, 712.3f)
                lineTo(313.6f, 711.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.913725f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(295.3f, 770.6f)
                lineTo(297.0f, 769.5f)
                lineTo(298.7f, 770.2f)
                curveTo(300.0f, 775.3f, 300.7f, 780.2f, 300.5f, 785.5f)
                curveTo(296.4f, 784.1f, 291.9f, 784.8f, 287.5f, 785.1f)
                lineTo(288.4f, 784.1f)
                lineTo(288.5f, 784.5f)
                curveTo(291.0f, 780.7f, 296.8f, 775.4f, 297.8f, 771.1f)
                lineTo(295.3f, 770.6f)
                close()
            }
        }
        .build()
        return _standardSojiroSakura!!
    }

private var _standardSojiroSakura: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardSojiroSakura, contentDescription = "")
    }
}
