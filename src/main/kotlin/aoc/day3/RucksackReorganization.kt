package aoc.day3

class RucksackReorganization(private val rucksacks: List<String>) {

    fun findItemsAppearsBoth(): Int
    {
        return rucksacks.sumOf {
            val compartments = it.chunked(it.length / 2)
            val item = (compartments[0].toSet() intersect compartments[1].toSet()).single()
            item.prioritySum
        }
    }

    fun findBadges(): Int
    {
        return rucksacks
            .chunked(3)
            .sumOf { rucksack ->
                val badge = rucksack.map { it.toSet() }
                    .reduce { items, content -> items intersect content}
                    .single()
                badge.prioritySum
        }
    }

    private val Char.prioritySum
        get() = when (this) {
            in 'a'..'z' -> this - 'a' + 1
            in 'A'..'Z' -> this - 'A' + 27
            else -> error("Not found")
        }
}