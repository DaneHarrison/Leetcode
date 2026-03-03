fun longestPalindrome(words: Array<String>): Int {
    val freq = mutableMapOf<String, Int>()
    val sameLetters = mutableSetOf<String>()
    var length = 0

    for (word in words) {
        if (word[0] == word[1]) {
            sameLetters.add(word)
        }

        val reversed = word.reversed()

        if ((freq[reversed] ?: 0) > 0) {
            length += 4
            freq[reversed] = (freq[reversed] ?: 0) - 1
        } else {
            freq[word] = (freq[word] ?: 0) + 1
        }
    }

    for (word in sameLetters) {
        if (freq[word] == 1) {
            length += 2
            break
        }
    }
    
    return length
}