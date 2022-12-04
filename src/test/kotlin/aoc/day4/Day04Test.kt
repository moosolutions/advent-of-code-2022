package aoc.day4

import org.junit.Assert
import org.junit.Test
import readInput

class Day04Test {

    @Test
    fun `In how many assignment pairs does one range fully contain the other?`()
    {
        val campCleanup = CampCleanup(readInput("test/kotlin/resources/Day04.input"))
        Assert.assertEquals(2, campCleanup.countFullContainment())
    }

    @Test
    fun `In how many assignment pairs do the ranges overlap?`()
    {
        val campCleanup = CampCleanup(readInput("test/kotlin/resources/Day04.input"))
        Assert.assertEquals(4, campCleanup.countOverlaps())
    }

}