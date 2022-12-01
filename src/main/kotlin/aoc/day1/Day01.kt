package aoc.day1

import readInput

/*
--- Day 1: Calorie Counting ---
 */
fun main() {
    val input = readInput("resources/Day01.input")
    val caloriesFinder = ElfCaloriesFinder(input)
    val totalCalories = caloriesFinder.findTotalCalories()
    println("How many total Calories is that Elf carrying? "
            + totalCalories.first())

    println("How many Calories are those Elves carrying in total? "
            + totalCalories.take(3).sum())
}
