fun largestAltitude(gain: IntArray): Int {
    var largestAltitude = 0
    var sum = 0

    for(i in gain) {
        sum += i
        largestAltitude = maxOf(largestAltitude, sum)
    }

    return largestAltitude
}