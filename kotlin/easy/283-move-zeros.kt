fun moveZeroes(nums: IntArray): Unit {
    var write = 0

    for (x in nums) {
        if (x != 0) {
            nums[write] = x
            write += 1
        }
    }

    for(i in write until nums.size) {
        nums[i] = 0
    }
}