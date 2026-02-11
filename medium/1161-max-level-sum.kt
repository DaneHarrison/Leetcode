class TreeNode(var `val`: Int) {
    val left: TreeNode? = null
    val right: TreeNode? = null
}

fun maxLevelSum(root: TreeNode?): Int {
    if (root == null) return 0

    var maxLevel = 1
    var maxSum = Int.MIN_VALUE

    var currLevel = 1
    val currLevelQueue = mutableListOf<TreeNode>(root)

    while(currLevelQueue.isNotEmpty()) {
        val currLevelSize = currLevelQueue.size
        var currLevelSum = 0

        for(i in 0 until currLevelSize) {
            val removed = currLevelQueue.removeAt(0)

            if(removed.left != null) currLevelQueue.add(removed.left)
            if(removed.right != null) currLevelQueue.add(removed.right)

            currLevelSum += removed.`val`
        }

        if (currLevelSum > maxSum) {
            maxSum = currLevelSum
            maxLevel = currLevel
        }

        currLevel++
    }

    return maxLevel
}