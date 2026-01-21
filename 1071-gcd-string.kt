
fun gcdOfStrings(word1: String, word2: String): String {
    if (word1 + word2 != word2 + word1)  {
        return ""
    }

    val smallerSize = minOf(word1.length, word2.length)
    val largerSize = maxOf(word1.length, word2.length)
    val gcd = calcGcd(largerSize, smallerSize)

    return word1.substring(0, gcd)
}

fun calcGcd(largerSize: Int, smallerSize: Int): Int {
    val remainder = largerSize % smallerSize

    if (remainder > 0){
        return calcGcd(smallerSize, remainder)
    }

    return smallerSize
}