package aoc.day6

import readInput

fun main()
{
    val tuningTrouble = TuningTrouble(readInput("main/kotlin/resources/Day06.input")[0])
    println("How many characters need to be processed before the first start-of-packet marker is detected?")
    println(tuningTrouble.findStartPositionOfPacket(4))

    println("How many characters need to be processed before the first start-of-message marker is detected?")
    println(tuningTrouble.findStartPositionOfPacket(14))
}