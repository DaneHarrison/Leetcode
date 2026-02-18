fun generateMatrix(n: Int): Array<IntArray> {
    val results = Array(n) {IntArray(n) { 0 } }

    var count = 1
    var top = 0
    var bottom = n
    var left = 0
    var right = n

    while (left < right && top < bottom) {
        for(i in left until right) {
            results[top][i] = count
            count += 1
        }

        top += 1

        for(i in top until bottom) {
            results[i][right - 1] = count
            count += 1
        }

        right -= 1

        if (left >= right || top >= bottom) break

        for(i in right - 1 downTo left) {
            results[bottom - 1][i] = count
            count += 1
        }

        bottom -= 1

        for(i in bottom - 1 downTo top) {
            results[i][left] = count
            count += 1
        }

        left += 1
    }

    return results
}