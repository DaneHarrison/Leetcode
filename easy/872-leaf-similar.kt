fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    val root1Leaves = mutableListOf<Int>()   
    val root2Leaves = mutableListOf<Int>()   

    fun getLeaves(root: TreeNode?, leaves: MutableList<Int>) {
        if (root == null) {
            return
        } else if(root?.left == null && root?.right == null) {
            leaves.add(root.`val`)
            return
        }

        getLeaves(root?.left, leaves)
        getLeaves(root?.right, leaves)
    }

    getLeaves(root1, root1Leaves)
    getLeaves(root2, root2Leaves)

    return root1Leaves == root2Leaves
}   