import kotlin.math.pow

fun findMaxAverage(nums: IntArray, k: Int): Double {
    var maxAvg = Double.NEGATIVE_INFINITY

    for (i in 0 until nums.size - k + 1) {
        var currAvg = 0.0

        for (j in 0 until k) {
            currAvg += nums[i + j]
        }

        currAvg = currAvg / k
        maxAvg = maxOf(maxAvg, currAvg)
    }

    return maxAvg
}