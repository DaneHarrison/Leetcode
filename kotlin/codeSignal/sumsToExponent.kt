import kotlin.math.pow

fun sumsToExponent(): Int {
    val numbers = listOf<Long>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numFreq = mutableMapOf<Long, Int>()
    val powers = Array<Long>(10) { 2.0.pow(it).toLong() }
    var count = 0

    for (num in numbers) {
        numFreq[num] = (numFreq[num] ?: 0) + 1

        for(pow in powers) {
            val remainder = pow - num
            
            if (remainder > -1 && numFreq.containsKey(remainder)) {
                count += numFreq[num] ?: 0
            }
        }
    }

    return count
}

