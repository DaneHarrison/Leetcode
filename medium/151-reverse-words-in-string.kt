    fun reverseWords(s: String): String {
        val normalized = s.trim().replace(Regex("\\s+"), " ")
        val words = normalized.split(" ")

        return words.reversed().joinToString(" ")
    }