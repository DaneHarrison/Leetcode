fun pivotIndex(nums: IntArray): Int {
    var pivotIdx = -1
    
    if (nums.isEmpty()) {
        return pivotIdx
    } else if(nums.size == 1) {
        return 0
    }

    var lhSum = 0
    var rhSum = nums.sum() - nums[0]
    
    if(lhSum == rhSum) {
        return 0
    }

    for(i in 1 until nums.size) {
        lhSum += nums[i - 1]
        rhSum -= nums[i]
        
        if(lhSum == rhSum) {
            pivotIdx = i
            break
        }
    } 

    return pivotIdx
}