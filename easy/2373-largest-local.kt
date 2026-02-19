fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
    val results = Array(grid.size - 2) { IntArray(grid[0].size - 2) { 0 } }

    for (i in 1 until grid.size - 1) {
        for(j in 1 until grid.size - 1) {
            results[i - 1][j - 1] = maxOf(
                grid[i - 1][j - 1],
                grid[i - 1][j],
                grid[i][j - 1],
                grid[i][j],
                grid[i + 1][j + 1],
                grid[i + 1][j],
                grid[i][j + 1],
                grid[i + 1][j - 1],
                grid[i - 1][j + 1]
            )
        }
    }

    return results
}