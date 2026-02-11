fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    if(root == null) {
        return null
    } else if (root.`val` == `val`) {
        return root
    }

    return searchBST(root.left, `val`) ?: searchBST(root.right, `val`)
}