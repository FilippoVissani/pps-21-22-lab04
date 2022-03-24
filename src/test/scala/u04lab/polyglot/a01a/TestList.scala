package u04lab.polyglot.a01a

import org.junit.Assert.assertEquals
import org.junit.Test
import u04lab.code.List
import u04lab.code.List.*

class TestList:

    @Test def testApply(): Unit =
        val list: List[Int] = List(1, 3, 4, 7)
        assertEquals(Cons(1, Cons(3, Cons(4, Cons(7, Nil())))), list)