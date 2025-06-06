package algorithms.graph.dfs;

import algorithms.TreeNode;

/**
 * 100. Same Tree
 * Time: O(n)
 * Space: O(n)
 *
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q == null || p == null && q != null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
