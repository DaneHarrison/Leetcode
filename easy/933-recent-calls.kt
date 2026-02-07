class RecentCounter() {
    var pings = mutableMapOf<Int, Int>()

    fun ping(t: Int): Int {
        pings[t] = (pings[t] ?: 0) + 1

        return pings.keys
            .filter { it >=  t - 3000 }
            .map { pings[it] }
            .count()
    }
}