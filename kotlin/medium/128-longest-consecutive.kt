fun longestConsecutive(nums: IntArray): Int {
    if(nums.size == 0) return 0

    val set = nums.toSet()
    var longest = 1

    for (num in set) {
        if (set.contains(num - 1)) {
            continue
        }

        var next = num + 1 
        var currCount = 1

        while (set.contains(next)) {
            currCount += 1
            next += 1 
        }

        longest = maxOf(longest, currCount)
    }

    return longest
}