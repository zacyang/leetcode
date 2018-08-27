package com.leetcode.tree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SameTreeTest {

    @Test
    public void notSameTree() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);

        boolean sameTree = new SameTree().isSameTree(root1, root2);
        assertFalse(sameTree);
    }

    @Test
    public void isSameTree() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        boolean sameTree = new SameTree().isSameTree(root1, root2);
        assertTrue(sameTree);
    }

    @Test
    public void notSameTree2() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.left = null;
        root2.right = new TreeNode(3);

        boolean sameTree = new SameTree().isSameTree(root1, root2);
        assertFalse(sameTree);
    }

    @Test
    public void notSameTree3() {
        TreeNode root1 = new TreeNode(1);
        root1.left = null;
        root1.right = null;

        TreeNode root2 = new TreeNode(2);
        root2.left = null;
        root2.right =null;

        boolean sameTree = new SameTree().isSameTree(root1, root2);
        assertFalse(sameTree);
    }
}