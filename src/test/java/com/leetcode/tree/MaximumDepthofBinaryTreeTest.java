package com.leetcode.tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaximumDepthofBinaryTreeTest {

    @Test
    public void maxDepth() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
        int result = new MaximumDepthofBinaryTree().maxDepth(root);
        assertThat(result, is(3));
    }
}