package aoc.day2

import readInput

/*
--- Day 2: Rock Paper Scissors ---
 */
fun main() {
    val input = readInput("resources/Day02.input")
    val calculator = RockPaperScissorsCalculator(input)
    println("What would your total score be if everything goes exactly according to your strategy guide? "
            + calculator.totalScore())

    println("What would your total score be if everything goes exactly according to your strategy guide? Part2 "
            + calculator.part2())
}