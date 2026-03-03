fun findCircleNum(isConnected: Array<IntArray>): Int {
    val visited = BooleanArray(isConnected.size)
    var provinces = 0

    fun visit(curr: Int) {
        for (i in isConnected.indices) {
            if (isConnected[curr][i] == 1 && !visited[i]) {
                visited[i] = true
                visit(i)
            }
        }
    }

    for (i in isConnected.indices) {
        if (!visited[i]) {
            visited[i] = true
            provinces++
            visit(i)
        }
    }

    return provinces
}