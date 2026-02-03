fun maxArea(height: IntArray): Int {
    var leftPosi = 0
    var rightPosi = height.size - 1
    var maxSize = 0

    while(leftPosi < rightPosi) {
        val w = rightPosi - leftPosi
        val h = minOf(height[leftPosi], height[rightPosi])
        val size = w * h

        if(size > maxSize) {
            maxSize = size
        }

        if(height[leftPosi] < height[rightPosi]) {
            leftPosi += 1
        } else {
            rightPosi -= 1
        }
    }

    return maxSize
}