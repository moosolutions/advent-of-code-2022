package aoc.day5

class SupplyStacks(private val input: List<String>) {

    val stacks = mutableListOf<Stack>()

    init {
        val rawStacks = input.slice(0..input.indexOf(""))
            .filter { line -> line.isNotEmpty() }
            .map {
                it.split(",")
            }
            .flatten()
            .map {
                it.chunked(4).map {
                        s -> s.trim().removePrefix("[").removeSuffix("]")
                }
            }
        val s = rawStacks.toMutableList()
        s.removeLast()

        for (i in 0 until rawStacks.last().count())
        {
            stacks.add(i, Stack())
            s.forEach {
                if (i in it.indices && it[i]!!.isNotEmpty()) {
                    stacks[i].addCrate(Crate(it[i]))
                }
            }
        }
        stacks.map { it.crates.reverse() }
    }

    fun rearrangeStacksBySingle(): String
    {
        val moves = input.slice(input.indexOf("") + 1 until input.count()).map {
            val move = it.split(" ")
            val quantity = move[1].toInt()
            val from = move[3].toInt() - 1
            val to = move[5].toInt() - 1

            stacks[to].crates.addAll(stacks[from].crates.takeLast(quantity).reversed())
            stacks[from].crates = stacks[from].crates.dropLast(quantity).toMutableList()

        }

        return stacks.map {
            it.crates.last().toString()
        }.joinToString("")
    }

    fun useCrateMover9001(): String
    {
        val moves = input.slice(input.indexOf("") + 1 until input.count()).map {
            val move = it.split(" ")
            val quantity = move[1].toInt()
            val from = move[3].toInt() - 1
            val to = move[5].toInt() - 1

            stacks[to].crates.addAll(stacks[from].crates.takeLast(quantity))
            stacks[from].crates = stacks[from].crates.dropLast(quantity).toMutableList()
            stacks.forEach { println(it.crates.toString()) }
        }

        return stacks.map {
            it.crates.last().toString()
        }.joinToString("")
    }
}

class Stack
{
    public var crates = mutableListOf<Crate>()

    fun addCrate(crate: Crate)
    {
        crates.add(crate)
    }
}

class Crate(public val crateCode: String) {
    override fun toString(): String {
        return crateCode
    }
}
