fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
    root ?: return null

    when {
        key < root.`val` -> {
            root.left = deleteNode(root.left, key)
        }
        key > root.`val` -> {
            root.right = deleteNode(root.right, key)
        }
        else -> {
            if (root.left == null) return root.right
            if (root.right == null) return root.left

            var succ = root.right
            while (succ?.left != null) succ = succ.left

            root.`val` = succ!!.`val`
            root.right = deleteNode(root.right, succ.`val`)
        }
    }
    return root
}