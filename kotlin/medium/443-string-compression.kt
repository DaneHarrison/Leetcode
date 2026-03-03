

fun compress(chars: CharArray): Int {
    var prevChar: Char? = null
    var repeats = 1
    var write = 0

    for((idx, currChar) in chars.withIndex()) {
        if(prevChar != currChar) {
            chars[write] = currChar
            write += 1
        } else {
            repeats += 1

            if(idx == chars.size - 1 || currChar != chars[idx + 1]) {
                for (digit in repeats.toString()) {
                    chars[write] = digit
                    write += 1
                } 

                repeats = 1
            }
        }

        prevChar = currChar
    }

    return write
}