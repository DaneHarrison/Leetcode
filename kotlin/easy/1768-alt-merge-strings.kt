fun mergeAlternately(word1: String, word2: String): String {
    val builder = StringBuilder(word1.length + word2.length)
    val maxLength = maxOf(word1.length, word2.length)

    for(i in 0 until maxLength) {
        if(i < word1.length) builder.append(word1[i]) 
        if(i < word2.length) builder.append(word2[i]) 
    }

    return builder.toString()
}