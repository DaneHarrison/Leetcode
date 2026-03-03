fun equalPairs(grid: Array<IntArray>): Int {
    var hashMap = mutableMapOf<Int, Int>()
    val currCol = IntArray(grid.size)
    var pairs = 0

    for(row in grid) {
        val hash = row.contentHashCode()

        hashMap[hash] = (hashMap[hash] ?: 0) + 1
    }

    for (i in 0 until grid.size) {
        for (j in 0 until grid.size) {
            currCol[j] = grid[j][i]
        }
        
        val hash = currCol.contentHashCode()
        pairs += hashMap[hash] ?: 0
    }

    return pairs
}