fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
    val visited = MutableList<Boolean>(rooms.size) { false }

    fun visit(rooms: List<List<Int>>, roomToVisit: Int, visited: MutableList<Boolean>) {
        visited[roomToVisit] = true

        for(i in rooms[roomToVisit]) {
            if(!visited[i]) {
                visit(rooms, i, visited)
            }
        }
    }

    visit(rooms, 0, visited)

    return visited.all { it }
}