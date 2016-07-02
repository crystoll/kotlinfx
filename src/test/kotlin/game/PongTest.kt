package game

import org.junit.Test
import kotlin.test.assertNotNull

class PongTest {
    @Test
    fun itShouldExist() {
        var pong = Pong()
        assertNotNull(pong)
    }
}