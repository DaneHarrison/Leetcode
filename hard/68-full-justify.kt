fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
    val results = mutableListOf<String>()
    var currentLine = mutableListOf<String>()
    var currentLineWidth = 0

    for (word in words) {
        if (currentLineWidth + word.length + currentLine.size > maxWidth) {
            results.add(justifyLine(currentLine, currentLineWidth, maxWidth, false))
            currentLine = mutableListOf()
            currentLineWidth = 0
        }
        currentLine.add(word)
        currentLineWidth += word.length
    }

    results.add(justifyLine(currentLine, currentLineWidth, maxWidth, true))

    return results
}

private fun justifyLine(line: List<String>, wordWidth: Int, maxWidth: Int, isLastLine: Boolean): String {
    val sb = StringBuilder()
    val totalSpaces = maxWidth - wordWidth
    val gapCount = line.size - 1

    if (gapCount == 0 || isLastLine) {
        for (i in line.indices) {
            sb.append(line[i])
            if (i < gapCount) sb.append(" ")
        }

        while (sb.length < maxWidth) sb.append(" ")
        return sb.toString()
    }

    val spacesPerGap = totalSpaces / gapCount
    val extraSpaces = totalSpaces % gapCount

    for (i in 0 until gapCount) {
        sb.append(line[i])
        val padding = spacesPerGap + (if (i < extraSpaces) 1 else 0)
        sb.append(" ".repeat(padding))
    }
    sb.append(line.last())

    return sb.toString()
}