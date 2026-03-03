

import java.util.PriorityQueue

class SmallestInfiniteSet {
    private var next = 1
    private val heap = PriorityQueue<Int>()     // min-heap
    private val inHeap = HashSet<Int>()         // prevents duplicates

    fun popSmallest(): Int {
        if (heap.isNotEmpty() && heap.peek() < next) {
            val v = heap.poll()
            inHeap.remove(v)
            return v
        }

        // Otherwise take from the infinite stream
        val v = next
        next += 1
        return v
    }

    fun addBack(num: Int) {
        if (num < next && inHeap.add(num)) {
            heap.add(num)
        }
    }
}