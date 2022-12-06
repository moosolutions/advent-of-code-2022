package aoc.day6

class TuningTrouble(private val datastream: String) {

    fun findStartPositionOfPacket(packetLength: Int): Int
    {
        val chars = datastream.toMutableList()

        for ((index, char) in datastream.withIndex())
        {
            if (chars.subList(index, index + packetLength).distinct().count() == packetLength)
            {
                return index + packetLength
            }
        }

        return -1
    }
}