fun numPairsDivisibleBy60(time: IntArray): Int {
    val remainders = IntArray(60)
    var count = 0

    for (t in time) {
        val remainder = t % 60
        
        // Find the complement remainder that would sum to 60
        // If remainder is 20, we need 40. 
        // If remainder is 0, we need 0 (since 0 + 0 = 0 mod 60).
        val target = if (remainder == 0) 0 else 60 - remainder
        
        count += remainders[target]
        remainders[remainder]++
    }

    return count
}