package aoc.day6

import org.junit.Assert
import org.junit.Test

class Day06Test {

    @Test
    fun `Find first start-of-packet marker`()
    {
        val tuningTrouble = TuningTrouble("mjqjpqmgbljsphdztnvjfqwrcgsmlb")
        Assert.assertEquals(7, tuningTrouble.findStartPositionOfPacket(4))
    }

    @Test
    fun `Find first start-of-message marker`()
    {
        val tuningTrouble = TuningTrouble("bvwbjplbgvbhsrlpgdmjqwftvncz")
        Assert.assertEquals(23, tuningTrouble.findStartPositionOfPacket(14))
    }
}