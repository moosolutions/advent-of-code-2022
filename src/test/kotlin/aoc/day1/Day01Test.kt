package aoc.day1

import org.junit.Assert
import org.junit.Test
import readInput

class Day01Test {

    @Test
    fun `Find the Elf carrying the most Calories`() {
        val caloriesFinder = ElfCaloriesFinder(readInput("resources/Day01.input"))
        Assert.assertEquals(9000, caloriesFinder.findTotalCalories().first())
    }

    @Test
    fun `Find the top three Elves carrying the most Calories`() {
        val caloriesFinder = ElfCaloriesFinder(readInput("resources/Day01.input"))
        Assert.assertEquals(20000, caloriesFinder.findTotalCalories().slice(0..2).sum())
    }

}