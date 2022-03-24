package u04lab.polyglot.a01a

import org.junit.Assert.assertEquals
import org.junit.Test
import u04lab.code.List.length
import u04lab.polyglot.a01a.Logics.Result

class TestLogics:

    val size: Int = 4
    val boat: Int = 2

    @Test def testWon(): Unit =
        val logics: LogicsImpl = LogicsImpl(size, boat)
        assertEquals(Result.HIT, logics.hit(logics.boatRow, logics.boatLeftCol))
        assertEquals(Result.WON, logics.hit(logics.boatRow, logics.boatLeftCol + 1))

    @Test def testLost(): Unit =
        val logics: LogicsImpl = LogicsImpl(size, boat)
        for (i <- 0 to 3) {
            for (j <- 0 to 3){
                if i != logics.boatRow
                  || (j != logics.boatLeftCol
                  && j != logics.boatLeftCol + 1) then
                    if logics.failures == logics.maxFailures - 1 then
                        assertEquals(Result.LOST, logics.hit(i, j))
                    else
                        assertEquals(Result.MISS, logics.hit(i, j))
            }
        }