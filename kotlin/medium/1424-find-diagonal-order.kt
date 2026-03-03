fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
    val map = mutableMapOf<Int, MutableList<Int>>()
    var totalCount = 0
    var maxKey = 0

    for (r in nums.indices) {
        for (c in nums[r].indices) {
            val sum = r + c
            map.getOrPut(sum) { mutableListOf() }.add(nums[r][c])
            maxKey = maxOf(maxKey, sum)
            totalCount++
        }
    }

    // 2. Build the result array
    val result = IntArray(totalCount)
    var index = 0
    
    for (i in 0 until maxKey + 1) {
        val list = map[i] ?: continue
        for (j in list.size downTo 0) {
            result[index++] = list[j]
        }
    }

    return result
}