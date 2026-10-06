package com.yuri.im.ui.resource.utils

import com.yuri.im.schema.ImageAsset
import kotlinx.coroutines.runBlocking
import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import javax.imageio.ImageIO
import kotlin.test.*

class ImageProcessingTest {
    private fun image(width: Int, height: Int, transparent: Boolean = false): BufferedImage {
        val bitmap = BufferedImage(width, height, if (transparent) BufferedImage.TYPE_INT_ARGB else BufferedImage.TYPE_INT_RGB)
        for (y in 0 until height) for (x in 0 until width) {
            val color = when {
                x < width / 2 && y < height / 2 -> 0xffff0000.toInt()
                x >= width / 2 && y < height / 2 -> 0xff00ff00.toInt()
                x < width / 2 -> 0xff0000ff.toInt()
                else -> 0xffffff00.toInt()
            }
            bitmap.setRGB(x, y, if (transparent && x < 100) 0 else color)
        }
        return bitmap
    }
    private fun bytes(image: BufferedImage, format: String) = ByteArrayOutputStream().also { ImageIO.write(image, format, it) }.toByteArray()
    private fun orient(jpeg: ByteArray, orientation: Int): ByteArray {
        val payload = byteArrayOf(69,120,105,102,0,0,73,73,42,0,8,0,0,0,1,0,18,1,3,0,1,0,0,0,orientation.toByte(),0,0,0,0,0,0,0)
        return jpeg.copyOfRange(0,2) + byteArrayOf(-1,-31,0,(payload.size+2).toByte()) + payload + jpeg.copyOfRange(2,jpeg.size)
    }
    @Test fun smallFilesRemainUnchangedAndCorruptionIsRejected(): Unit = runBlocking {
        val original = bytes(image(64,48), "png")
        assertContentEquals(original, prepareImage("small", original).bytes)
        assertFailsWith<Exception> { prepareImage("bad", original.copyOf(33)) }
        Unit
    }
    @Test fun largeTransparentPngIsResizedWithoutLosingAlpha() = runBlocking {
        val resource = prepareImage("large", bytes(image(3000,1500,true), "png"))
        assertEquals(2048, resource.width); assertEquals(1024, resource.height)
        assertEquals("image/png", resource.mimeType)
        val result = ImageIO.read(ByteArrayInputStream(resource.bytes))
        assertEquals(0, result.getRGB(0,0) ushr 24)
    }
    @Test fun allExifOrientationsHaveCorrectPixelsAndDimensions() = runBlocking {
        val jpeg = bytes(image(64,48), "jpg")
        // Source corners: red, green, blue, yellow. Mapping for EXIF values 1 through 8.
        val corners = listOf(0xff0000,0x00ff00,0x0000ff,0xffff00)
        val mappings = listOf(listOf(0,1,2,3),listOf(1,0,3,2),listOf(3,2,1,0),listOf(2,3,0,1),listOf(0,2,1,3),listOf(2,0,3,1),listOf(3,1,2,0),listOf(1,3,0,2))
        for (orientation in 1..8) {
            val input = orient(jpeg, orientation)
            assertEquals(orientation, ImageAsset.inspect(input).orientation)
            val resource = prepareImage("orientation_$orientation", input)
            assertEquals(if (orientation >= 5) 48 else 64, resource.width)
            assertEquals(if (orientation >= 5) 64 else 48, resource.height)
            if (orientation > 1) assertEquals(1, ImageAsset.inspect(resource.bytes).orientation)
            val result = ImageIO.read(ByteArrayInputStream(resource.bytes))
            val points = listOf(8 to 8,result.width-9 to 8,8 to result.height-9,result.width-9 to result.height-9)
            points.forEachIndexed { index, (x,y) ->
                val actual = result.getRGB(x,y)
                val expected = corners[mappings[orientation-1][index]]
                for (shift in listOf(0,8,16)) assertTrue(kotlin.math.abs(((actual ushr shift) and 255) - ((expected ushr shift) and 255)) < 25, "Orientation $orientation corner $index")
            }
        }
    }
}
