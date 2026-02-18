fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
    for (i in 0 until matrix[0].size) {
        var shouldBe = matrix[0][i]
        var y = 0
        var x = i

        while(y < matrix.size && x < matrix[0].size) {
            if (matrix[y][x] != shouldBe) {
                return false
            }

            y += 1
            x += 1
        }
    }

    for (i in 1 until matrix.size) {
        var shouldBe = matrix[i][0]
        var y = i
        var x = 0

        while(y < matrix.size && x < matrix[0].size) {
            if (matrix[y][x] != shouldBe) {
                return false
            }

            y += 1
            x += 1
        }
    }
    
    return true
}