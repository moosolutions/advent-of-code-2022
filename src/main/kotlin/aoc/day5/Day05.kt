package aoc.day5

import readInput

fun main()
{
    val part1 = SupplyStacks(readInput("main/kotlin/resources/Day05.input"))
    println("After the rearrangement procedure completes, what crate ends up on top of each stack?")
    println(part1.rearrangeStacksBySingle())

    val part2 = SupplyStacks(readInput("main/kotlin/resources/Day05.input"))
    println("After the rearrangement procedure with CrateMover 9001 completes, what crate ends up on top of each stack?")
    println(part2.useCrateMover9001())
}