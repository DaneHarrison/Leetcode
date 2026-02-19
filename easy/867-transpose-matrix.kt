fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val transponsed = Array(matrix[0].size) { IntArray(matrix.size) {0} }

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[0].size) {
            transponsed[j][i] = matrix[i][j]
        }
    }

    return transponsed
}