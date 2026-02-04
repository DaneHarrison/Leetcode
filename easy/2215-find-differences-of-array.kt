fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    var num1Set = nums1.toMutableSet()
    var num2Set = nums2.toMutableSet()

    for (num in (num1Set intersect num2Set)) {
        num1Set.remove(num)
        num2Set.remove(num)
    }

    return listOf(num1Set.toList(), num2Set.toList())
}