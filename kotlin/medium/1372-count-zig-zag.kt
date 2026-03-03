fun longestZigZag(root: TreeNode?): Int {
    fun dfs(root: TreeNode?, goRightNext: Boolean, count: Int): Int {
        if(root == null) {
            return count - 1
        }

        val nextOnContinue = if(goRightNext) root?.right else root?.left
        val nextOnReset = if(goRightNext) root?.left else root?.right
        val continueCount = dfs(nextOnContinue, !goRightNext, count + 1)
        val resetCount = dfs(nextOnReset, goRightNext, 1)

        return maxOf(continueCount, resetCount)
    }

    return maxOf(
        dfs(root?.left, true, 1),
        dfs(root?.right, false, 1)
    )
}