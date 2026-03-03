fun uniqueOccurrences(arr: IntArray): Boolean {
    val occurences = mutableMapOf<Int, Int>()
    
    for (num in arr) {
        occurences.set(num, (occurences[num] ?: 0) + 1)
    }

    val occurenceSet = occurences.values.toSet()

    return occurenceSet.size == occurences.values.size
}