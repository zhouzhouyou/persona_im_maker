package com.yuri.im

import com.yuri.im.json.PimSessionFile
import com.yuri.im.json.StoredZip
import com.yuri.im.schema.*
import kotlin.test.*

class PimSessionFileTest {
    private val png = listOf(137,80,78,71,13,10,26,10,0,0,0,13,73,72,68,82,0,0,0,1,0,0,0,1,8,4,0,0,0,181,28,12,2,0,0,0,11,73,68,65,84,120,218,99,252,255,31,0,3,3,2,0,239,154,218,42,0,0,0,0,73,69,78,68,174,66,96,130).map { it.toByte() }.toByteArray()
    private val image = ImageAsset.fromBytes("photo", png)
    private fun session() = ChatSession("test-session", "My photos", listOf(
        ReceiveMessage(StandardMessageSender.SENDER_ANN, content = "Photo!"),
        ImageMessage(StandardMessageSender.SENDER_ANN, image.id),
        ImageMessage(MessageSenderSelf, image.id),
        PlainText("Next text"),
    ), BackgroundParticle.SAKURA, mapOf(image.id to image))

    @Test fun mixedSessionRoundTripsBinaryResourceOnce() {
        val original = session()
        val bytes = PimSessionFile.encode(original)
        assertEquals(original, PimSessionFile.decode(bytes))
        val entries = StoredZip.decode(bytes)
        assertEquals(setOf("session.json", "images/photo.png"), entries.keys)
        assertContentEquals(png, entries.getValue("images/photo.png"))
        val manifest = entries.getValue("session.json").decodeToString()
        assertTrue(manifest.contains("\"formatVersion\": 1"))
        assertFalse(manifest.contains("base64"))
    }

    @Test fun missingResourceAndInvalidMetadataAreRejected() {
        val entries = StoredZip.decode(PimSessionFile.encode(session()))
        assertFailsWith<IllegalArgumentException> { PimSessionFile.decode(StoredZip.encode(entries - "images/photo.png")) }
        val invalid = entries + ("session.json" to entries.getValue("session.json").decodeToString().replace("\"width\": 1", "\"width\": 999").encodeToByteArray())
        assertFailsWith<IllegalArgumentException> { PimSessionFile.decode(StoredZip.encode(invalid)) }
        assertFailsWith<IllegalArgumentException> { PimSessionFile.encode(session().copy(images = emptyMap())) }
    }

    @Test fun corruptTruncatedAndUnexpectedEntriesAreRejected() {
        val bytes = PimSessionFile.encode(session())
        assertFailsWith<IllegalArgumentException> { PimSessionFile.decode(bytes.copyOf(bytes.size - 5)) }
        val broken = bytes.copyOf().apply { this[50] = (this[50].toInt() xor 1).toByte() }
        assertFailsWith<IllegalArgumentException> { PimSessionFile.decode(broken) }
        assertFailsWith<IllegalArgumentException> { StoredZip.encode(mapOf("../secret" to png)) }
        val entries = StoredZip.decode(bytes) + ("images/undeclared.png" to png)
        assertFailsWith<IllegalArgumentException> { PimSessionFile.decode(StoredZip.encode(entries)) }
    }

    @Test fun resourceIdAndInputLimitsAreValidated() {
        assertFailsWith<IllegalArgumentException> { ImageAsset.fromBytes("../bad", png) }
        assertFailsWith<IllegalArgumentException> { ImageAsset.fromBytes("bad", byteArrayOf(1,2,3)) }
        assertFailsWith<IllegalArgumentException> { ImageAsset.fromBytes("large", ByteArray(ImageAsset.MAX_BYTES + 1)) }
        val wide = png.copyOf().apply { this[16] = 1 }
        assertFailsWith<IllegalArgumentException> { ImageAsset.fromBytes("wide", wide) }
    }

    @Test fun duplicateResourceIdsAndNewerFormatAreRejected() {
        val entries = StoredZip.decode(PimSessionFile.encode(session()))
        val json = entries.getValue("session.json").decodeToString()
        val newer = entries + ("session.json" to json.replace("\"formatVersion\": 1", "\"formatVersion\": 2").encodeToByteArray())
        assertFailsWith<IllegalArgumentException> { PimSessionFile.decode(StoredZip.encode(newer)) }
        val duplicate = json.replace("\"images\": [", "\"images\": [{\"id\":\"photo\",\"mimeType\":\"image/png\",\"width\":1,\"height\":1},")
        assertFailsWith<IllegalArgumentException> { PimSessionFile.decode(StoredZip.encode(entries + ("session.json" to duplicate.encodeToByteArray()))) }
    }
}
