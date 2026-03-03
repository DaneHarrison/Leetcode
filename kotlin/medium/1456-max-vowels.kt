fun maxVowels(s: String, k: Int): Int {
    fun isVowel(c: Char): Boolean =
        c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'

    var count = 0
    for (i in 0 until k) {
        if (isVowel(s[i])) count++
    }

    var max = count
    for (i in k until s.length) {
        if (isVowel(s[i])) count++
        if (isVowel(s[i - k])) count--
        if (count > max) max = count
        if (max == k) return k
    }

    return max
}