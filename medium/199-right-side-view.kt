fun rightSideView(root: TreeNode?): List<Int> {
    if(root == null) return emptyList()

    val rightSideView = mutableListOf<Int>()
    val queue = mutableListOf<TreeNode>(root)

    while (queue.isNotEmpty()) {
        val queueSize = queue.size

        for (i in 0 until queueSize) {
            val removed = queue.removeAt(0)

            if (removed?.left != null) queue.add(removed.left)
            if (removed?.right != null) queue.add(removed.right)

            if (i == queueSize - 1) {
                rightSideView.add(removed.`val`)
            }
        }
    }

    return rightSideView
}