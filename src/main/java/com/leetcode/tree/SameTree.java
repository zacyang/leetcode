package com.leetcode.tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        if (isNodeValueTheSame(p, q) || !bothNodesAreTheSame(p, q)) {
            return false;
        }

        if (isLeaf(p) && isLeaf(q)) {
            return true;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    private boolean isNodeValueTheSame(TreeNode p, TreeNode q) {
        if(p==null ^ q==null) {
            return false;
        }
        if(p==null && q==null) {
            return true;
        }
        return p.val!= q.val;
    }

    private boolean bothNodesAreTheSame(TreeNode p, TreeNode q) {
        if(p ==null && q ==null) {
            return true;
        }
        if( p==null && q!=null) {
            return false;
        }
        if( p !=null && q==null){
            return false;
        }
        return  isLeftLeafTheSame(p, q)
                && isRightLeafTheSame(p, q);

    }

    private boolean isLeftLeafTheSame(TreeNode p, TreeNode q) {
        if(p.left==null ^ q.left==null) {
            return false;
        }

        if(p.left == null && q.left == null ) {
            return true;
        }
        return p.left.val == q.left.val;
    }

    private boolean isRightLeafTheSame(TreeNode p, TreeNode q) {
        if(p.right==null ^ q.right==null) {
            return false;
        }

        if(p.right == null && q.right == null ) {
            return true;
        }
        return p.right.val == q.right.val;
    }

    private boolean isLeaf(TreeNode p) {
        return p.left == null && p.right == null;
    }
}
