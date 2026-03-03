fun productExceptSelf(nums: IntArray): IntArray {
    val products = IntArray(nums.size) { 1 }
    
    var leftProduct = 1
    for (i in 0 until nums.size) {
        val prevNum = if (i == 0) 1 else nums[i - 1] 
        products[i] = products[i] * leftProduct * prevNum
        leftProduct = leftProduct * prevNum
    }

    var rightProduct = 1
    for (i in nums.size - 1 downTo 0) {
        val prevNum = if (i == nums.size - 1) 1 else nums[i + 1] 
        products[i] = products[i] * rightProduct * prevNum
        rightProduct = rightProduct * prevNum
    }

    return products
}