package aoc.day3

import org.junit.Test
import readInput

class Day03Test {


    @Test
    fun `What is the sum of the priorities of those item types`()
    {
        val rucksacksReorganization = RucksackReorganization(readInput("test/kotlin/resources/Day03.input"))
        rucksacksReorganization.findItemsAppearsBoth()
    }

}