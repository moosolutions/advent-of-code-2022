package aoc.day2

class RockPaperScissorsCalculator(private val matches: List<String>) {

    fun totalScore(): Int
    {
        val guide = mutableMapOf<String, Int>()
        guide["A Y"] = 8
        guide["A X"] = 4
        guide["A Z"] = 3
        guide["B Y"] = 5
        guide["B X"] = 1
        guide["B Z"] = 9
        guide["C Y"] = 2
        guide["C X"] = 7
        guide["C Z"] = 6

        var totalScore = 0
        matches.forEach{s -> totalScore += guide[s]!!}

        return totalScore
    }

    fun part2(): Int
    {
        val guide = mutableMapOf<String, Int>()
        guide["A Y"] = 4
        guide["A X"] = 3
        guide["A Z"] = 8
        guide["B Y"] = 5
        guide["B X"] = 1
        guide["B Z"] = 9
        guide["C Y"] = 6
        guide["C X"] = 2
        guide["C Z"] = 7

        var totalScore = 0
        matches.forEach{s -> totalScore += guide[s]!!}

        return totalScore
    }

}