class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        if (matrix.size == 0 || matrix[0].size == 0) return emptyList()

        val spiral = mutableListOf<Int>()

        var top = 0
        var bottom = matrix.size
        var left = 0
        var right = matrix[0].size

        while (top < bottom && left < right) {
            for (i in left until right) spiral.add(matrix[top][i])
            top += 1

            for (i in top until bottom) spiral.add(matrix[i][right - 1])
            right -= 1

            if (top >= bottom || left >= right) break

            for (i in right - 1 downTo left) spiral.add(matrix[bottom - 1][i])
            bottom -= 1

            for (i in bottom - 1 downTo top) spiral.add(matrix[i][left])
            left += 1
        }

        return spiral
    }
}