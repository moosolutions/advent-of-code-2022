package aoc.day4

class CampCleanup(private val input: List<String>) {

    private val sections = input.map {
        it.split(',', '-').map(String::toInt)
            .let { (from1, to1, from2, to2) -> (from1..to1) to (from2..to2) }
    }

    fun countFullContainment(): Int
    {
        return sections.count {
            (first, second) -> first in second || second in first
        }
    }

    fun countOverlaps(): Int
    {
        return sections.count {
            (first, second) -> first overlaps second
        }
    }

    private operator fun IntRange.contains(other: IntRange) =
        first >= other.first && last <= other.last

    private infix fun IntRange.overlaps(other: IntRange) =
        first <= other.last && last >= other.first
}