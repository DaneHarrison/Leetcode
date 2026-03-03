fun maxDepth(root: TreeNode?): Int {
    if(root == null) {
        return 0
    }
    
    fun getDepth(curr: TreeNode?, depth: Int): Int {
        if(curr == null) return depth

        return maxOf(getDepth(curr?.left, depth + 1), getDepth(curr?.right, depth + 1))
    }

    return maxOf(getDepth(root.left, 1), getDepth(root.right, 1))
}