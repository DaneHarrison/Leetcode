fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {
    val pairs = nums1.indices
        .map { Pair<Int, Int>(nums1[it], nums2[it]) }
        .sortedByDescending { it.second }

    val minHeap =  PriorityQueue<Int>()
    var sum = 0L
    var max = Long.MIN_VALUE

    for ((num1, num2) in pairs) {
        minHeap.add(num1)
        sum += num1

        if (minHeap.size > k) {
            sum -= minHeap.poll()
        }  

        if (minHeap.size == k) {
            max = maxOf(max, (num2 * sum).toLong())
        }
    }

    return max
}