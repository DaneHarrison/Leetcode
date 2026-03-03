fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    if(mat.size == 0 || mat[0].size == 0) return mat
    if(mat.size * mat[0].size != r * c) return mat

    val res = Array(r) { IntArray(c) { 0 } }
    
    var y = 0
    var x = 0

    for(i in 0 until mat.size) {
        for(j in 0 until mat[i].size) {
            res[y][x] = mat[i][j]
            x += 1

            if (x == c) {
                x = 0
                y += 1
            }
        }
    }

    return res
}