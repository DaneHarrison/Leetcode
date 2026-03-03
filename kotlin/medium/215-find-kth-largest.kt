import java.util.PriorityQueue    

fun findKthLargest(nums: IntArray, k: Int): Int {
    val pq = PriorityQueue<Int>(compareByDescending { it })
    var result = 0

    for (v in nums) pq.add(v)

    for (i in 0 until k) {
        result = pq.poll()
    }

    return result
}