fun minReorder(n: Int, connections: Array<IntArray>): Int {
    val graph = Array(n) { mutableListOf<Pair<Int, Int>>() }
    val visited = MutableList(n) {false}

    for ((start, stop) in connections) {
        graph[start].add(stop to 1)
        graph[stop].add(start to 0)
    }

    fun dfs(start: Int): Int {
        var totalCost = 0
        visited[start] = true

        for ((stop, cost) in graph[start]) {
            if (!visited[stop]) {
                totalCost += cost + dfs(stop) 
            }
        }

        return totalCost
    }
    
    return dfs(0)
}