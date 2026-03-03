fun goodNodes(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }
    
    fun countGoodNodes(root: TreeNode?, max: Int): Int {
        var goodNodeCount = 0
        
        if (root == null) {
            return 0
        } else if (root.`val` >= max) {
            goodNodeCount += 1
        }

        goodNodeCount += countGoodNodes(root?.left, maxOf(max, root.`val`))
        goodNodeCount += countGoodNodes(root?.right, maxOf(max, root.`val`))
        
        return goodNodeCount
    }
    
    
    var goodNodeCount = 1
    goodNodeCount += countGoodNodes(root?.right, root.`val`)
    goodNodeCount += countGoodNodes(root?.left, root.`val`)

    return goodNodeCount
}