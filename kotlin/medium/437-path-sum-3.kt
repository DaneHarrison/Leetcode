fun pathSum(root: TreeNode?, targetSum: Int): Int {
    if (root == null) {
        return 0
    } 

    val start = countFrom(root, targetSum.toLong())

    return start + pathSum(root?.left, targetSum) + pathSum(root?.right, targetSum)
}

fun countFrom(root: TreeNode?, targetSum: Long): Int {
    if (root == null) {
        return 0
    } 

    val remaining = targetSum - root.`val`
    var count = if(remaining == 0L) 1 else 0

    count += countFrom(root?.left, remaining)
    count += countFrom(root?.right, remaining)

    return count
}
