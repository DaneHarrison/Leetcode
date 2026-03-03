    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || p == null || q == null) return null
        if (p === root || q === root) return root

        val left = lowestCommonAncestor(root?.left, p, q)
        val right = lowestCommonAncestor(root?.right, p, q)

        if (left != null && right != null) {
            return root
        }
        
        return left ?: right
    }