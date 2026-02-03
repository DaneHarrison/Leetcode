fun maxOperations(nums: IntArray, k: Int): Int {
    val freq = mutableMapOf<Int, Int>()
    var ops = 0

    for (num in nums) {
        val need = k - num
        val needCount = freq[need] ?: 0

        if (needCount > 0) {
            ops += 1
            if (needCount == 1) freq.remove(need) else freq[need] = needCount - 1
        } else {
            freq[num] = (freq[num] ?: 0) + 1
        }
    }

    return ops
}
