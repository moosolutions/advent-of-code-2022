package aoc.day5

import org.junit.Assert
import org.junit.Test
import readInput

class Day05Test {

    @Test
    fun `what crate ends up on top of each stack`()
    {
        val supplyStacks = SupplyStacks(readInput("test/kotlin/resources/Day05.input"))
        Assert.assertEquals("CMZ", supplyStacks.rearrangeStacksBySingle())
    }

    @Test
    fun `Ues CrateMover 9001`()
    {
        val supplyStacks = SupplyStacks(readInput("test/kotlin/resources/Day05.input"))
        Assert.assertEquals("MCD", supplyStacks.useCrateMover9001())
    }

}