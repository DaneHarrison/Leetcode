fun longestSubarray(nums: IntArray): Int {
    var longestSubarray = 0

    for(i in 0 until nums.size) {
        var currLongestSubarray = 0
        var buffer = 1

        for(j in i until nums.size) {
            if(nums[j] == 1) {
                currLongestSubarray += 1
            } else if(buffer > 0) {
                buffer -= 1
            } else {
                break
            }
        }

        longestSubarray = maxOf(longestSubarray, currLongestSubarray)
    }

    if(longestSubarray == nums.size) {
        longestSubarray -= 1
    }

    return longestSubarray
}