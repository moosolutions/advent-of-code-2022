package aoc.day1

class ElfCaloriesFinder(private val caloriesList: List<String>) {
    fun findTotalCalories() : List<Int>
    {
        val caloriesByElf = mutableListOf<Int>()
        var index = 0
        caloriesList.forEach {
            if (it.isEmpty()) {
                index++
            } else {
                if (index in caloriesByElf.indices) {
                    caloriesByElf[index] += it.toInt()
                } else {
                    caloriesByElf.add(index, it.toInt())
                }
            }
        }
        caloriesByElf.sortDescending();
        return caloriesByElf
    }
}