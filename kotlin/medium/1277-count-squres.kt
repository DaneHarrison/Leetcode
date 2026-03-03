fun countSquares(matrix: Array<IntArray>): Int {
    var count = 0

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[0].size) {
            if (matrix[i][j] == 0) {
                continue
            }

            var isValidSquare = true
            var squareSize = 1

            while (isValidSquare) {
                count += 1
                squareSize += 1

                for (innerI in 0 until squareSize) {
                    for (innerJ in 0 until squareSize) {
                        if (i + innerI >=  matrix.size || j + innerJ >= matrix[0].size || matrix[i + innerI][j + innerJ] == 0) {
                            isValidSquare = false
                            break
                        }
                    }

                    if (!isValidSquare) {
                        break
                    }
                }
            }
        }
    }

    return count
}