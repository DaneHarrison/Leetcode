fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
    if (mat.size == 0 || mat[0].size == 0) return IntArray(0)

    val height = mat.size
    val width = mat[0].size
    val stepsRequired = height * width
    val res = IntArray(stepsRequired)

    var y = 0
    var x = 0
    var goingRight = true

    for(i in 0 until stepsRequired) {
        res[i] = mat[y][x]
        
        if (goingRight) {
            if (x == width - 1) {
                y++
                goingRight = false
            } else if (y == 0) {
                x++
                goingRight = false
            } else {
                x += 1
                y -= 1
            }
        } else {
            if (y == height - 1) {
                x += 1
                goingRight = true
            } else if (x == 0) {
                y += 1
                goingRight = true
            } else {
                x -= 1
                y += 1
            }
        }
    }

    return res
}