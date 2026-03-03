fun removeStars(s: String): String {
    val builder = StringBuilder(s.length)
    var toRemove = 0

    for(i in s.length - 1 downTo 0) {
        if(s.get(i) == '*') {
            toRemove++
        } else if(toRemove > 0) {
            toRemove--
        } else {
            builder.insert(0, (s.get(i)))
        }
    }

    return builder.toString()
}