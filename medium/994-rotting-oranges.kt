fun orangesRotting(grid: Array<IntArray>): Int {
    if (grid.size == 0 || grid[0].size == 0) return -1

    var contagious = mutableListOf<IntArray>()
    var freshOranges = 0
    var minutes = 0

    fun spread(): MutableList<IntArray> {
        val newContagious = mutableListOf<IntArray>()

        for ((y, x) in contagious) {
            if(y - 1 >= 0 && grid[y - 1][x] == 1) {
                newContagious.add(intArrayOf(y - 1, x))
                grid[y - 1][x] = 2
            }
            if(y + 1 < grid.size && grid[y + 1][x] == 1) {
                newContagious.add(intArrayOf(y + 1, x))
                grid[y + 1][x] = 2
            }
            if(x - 1 >= 0 && grid[y][x - 1] == 1)  {
                newContagious.add(intArrayOf(y, x - 1))
                grid[y][x - 1] = 2
            }
            if(x + 1 < grid[0].size && grid[y][x + 1] == 1) {
                newContagious.add(intArrayOf(y, x + 1))
                grid[y][x + 1] = 2
            }
        }

        freshOranges -= newContagious.size

        return newContagious
    }   

    for (y in 0 until grid.size) {
        for (x in 0 until grid[0].size) {
            when(grid[y][x]) {
                1 -> freshOranges += 1
                2 -> contagious.add(intArrayOf(y, x))
            }
        }
    }

    contagious = spread()

    while (contagious.isNotEmpty()) {
        contagious = spread()
        minutes++
    }

    if (freshOranges > 0) {
        return -1
    }

    return minutes
}