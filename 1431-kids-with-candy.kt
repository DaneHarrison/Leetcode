    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val mostCandies = candies.maxOrNull() ?: return emptyList()

        return candies.map { it + extraCandies >= mostCandies}
    }