package aoc.day3

import readInput

/*
--- Day 3: Rucksack Reorganization ---
 */
fun main()
{
    val rucksacksReorganization = RucksackReorganization(readInput("main/kotlin/resources/Day03.input"))
    println("Part1: " + rucksacksReorganization.findItemsAppearsBoth())

    println("Part2: " + rucksacksReorganization.findBadges())
}