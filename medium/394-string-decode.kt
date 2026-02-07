fun decodeString(s: String): String {
    val decoding = ArrayDeque<Char>()
    
    for (char in s) {
        if(char == ']') {
            var number = StringBuilder()
            var string = StringBuilder()
            var dequeued = decoding.removeLast()
            
            while(dequeued != '[') {
                string.insert(0, dequeued)
                dequeued = decoding.removeLast()
            }
            
            while(!decoding.isEmpty() && decoding.last().isDigit()) {
                dequeued = decoding.removeLast()
                number.insert(0, dequeued)
            }
            
            val repeated = string.repeat(number.toString().toInt())
            repeated.forEach(decoding::addLast)
        } else {
            decoding.addLast(char)
        }
    }

    val out = StringBuilder(decoding.size)
    
    for (c in decoding) {
        out.append(c)
    }

    return out.toString()
}