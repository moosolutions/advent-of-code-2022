package aoc.day4

import readInput

/*
--- Day 4: Camp Cleanup ---
 */
fun main()
{
    val campCleanup = CampCleanup(readInput("main/kotlin/resources/Day04.input"))
    println("In how many assignment pairs does one range fully contain the other?")
    println(campCleanup.countFullContainment())

    println("In how many assignment pairs do the ranges overlap?")
    println(campCleanup.countOverlaps())
}