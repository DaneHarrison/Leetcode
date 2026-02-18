    fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
    val n = img1.size
    val inImg1 = mutableListOf<IntArray>()
    val inImg2 = mutableListOf<IntArray>()
    var maxCount = 0

    for (i in 0 until n) {
        for(j in 0 until n) {
            if(img1[i][j] == 1) {
                inImg1.add(intArrayOf(i , j))
            }
            if(img2[i][j] == 1) {
                inImg2.add(intArrayOf(i , j))
            }
        }
    }

    for ((y, x) in inImg1) {
        for((y2, x2) in inImg2) {
            var count = 0
            val offsetY = y - y2
            val offsetX = x - x2

            for (i in 0 until n) {
                for(j in 0 until n) {
                    val inBounds = offsetY + i >= 0 && offsetY + i < n && offsetX + j >= 0 && offsetX + j < n

                    if (inBounds && img1[offsetY + i][offsetX + j] == 1 && img2[i][j] == 1) {
                        count += 1
                    }
                }
            }

            maxCount = maxOf(maxCount, count)
        }
    }

    return maxCount
}