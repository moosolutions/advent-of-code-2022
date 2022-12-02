package aoc.day2

import org.junit.Assert
import org.junit.Test
import readInput

class Day02Test {

    @Test
    fun `What would your total score be if everything goes exactly according to your strategy guide`()
    {
        val calculator = RockPaperScissorsCalculator(readInput("resources/Day02.input"))
        Assert.assertEquals(46, calculator.totalScore())
    }

    @Test
    fun `What would your total score be if everything goes exactly`()
    {
        val calculator = RockPaperScissorsCalculator(readInput("resources/Day02.input"))
        Assert.assertEquals(31, calculator.part2())
    }

}