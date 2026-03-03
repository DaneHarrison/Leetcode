fun increasingTriplet(nums: IntArray): Boolean {
    var bot = Int.MAX_VALUE
    var mid = Int.MAX_VALUE 

    for(num in nums) {
        if(num <= bot) {
            bot = num
        } else if(num <= mid) {
            mid = num
        } else {
            return true
        }
    }

    return false
}