import java.util.PriorityQueue

fun maxScore(nums1: IntArray, nums2: IntArray, k: Int): Long {
    val pairs = Array(nums1.size) { i -> intArrayOf(nums2[i], nums1[i]) }
    pairs.sortByDescending { it[0] } // nums2 desc

    val heap = PriorityQueue<Int>() // min-heap of chosen nums1
    var sum = 0L
    var best = 0L

    for (p in pairs) {
        val n2 = p[0]
        val n1 = p[1]

        heap.add(n1)
        sum += n1.toLong()

        if (heap.size > k) {
            sum -= heap.poll().toLong()
        }

        if (heap.size == k) {
            best = maxOf(best, sum * n2.toLong())
        }
    }

    return best
}
