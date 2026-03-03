fun closeStrings(word1: String, word2: String): Boolean {
    if(word1.length != word2.length) {
        return false
    } 

    val word1CharFreqMap = word1.groupingBy { it }.eachCount()
    val word2CharFreqMap = word2.groupingBy { it }.eachCount()

    val charsMatch = word1CharFreqMap.keys.containsAll(word2CharFreqMap.keys)
    val freqsMatch = word1CharFreqMap.values.sorted() == word2CharFreqMap.values.sorted()

    return charsMatch && freqsMatch
}