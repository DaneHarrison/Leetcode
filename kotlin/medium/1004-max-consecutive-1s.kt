fun longestOnes(nums: IntArray, k: Int): Int {
    var longestOnes = 0

    for (i in 0 until nums.size) {
        var remainingK = k
        var currOnes = 0

        for(j in i until nums.size) {
            if(nums[j] == 1) {
                currOnes += 1
            } else if(remainingK > 0) {
                currOnes += 1
                remainingK -= 1
            } else {
                break
            }
        }

        longestOnes = maxOf(longestOnes, currOnes)
    }

    return longestOnes
}