package com.leetcode.tree;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        return getRightDepth(0, root);
    }

    private int getRightDepth(int dep, TreeNode root) {
        if (root == null) {
            return dep;
        }
        dep++;
        int left = 0;
        left = getRightDepth(dep, root.left);

        int right = 0;
        right = getRightDepth(dep, root.right);

        return Math.max(left, right);
    }

}
