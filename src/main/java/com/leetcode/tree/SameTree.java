package com.leetcode.tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if( !bothNodesAreTheSame(p, q)) {
            return false;
        }

        if(isLeaf(p) && isLeaf(q)){
            return true;
        }
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    private boolean bothNodesAreTheSame(TreeNode p, TreeNode q) {

        return isLeftLeafTheSame(p, q)
                && isRightLeafTheSame(p,q );

    }

    private boolean isLeftLeafTheSame(TreeNode p, TreeNode q) {
        return p.left == null && q.left==null || p.left.val==q.left.val;
    }
    private boolean isRightLeafTheSame(TreeNode p, TreeNode q) {
        return p.right == null && q.right==null || p.right.val==q.right.val;
    }

    private boolean isLeaf(TreeNode p) {
        return p.left == null && p.right ==null;
    }
}
