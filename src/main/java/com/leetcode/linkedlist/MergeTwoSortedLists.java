package com.leetcode.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return getNextNode(l1, l2);
    }

    private ListNode getNextNode(ListNode left, ListNode right) {
        Integer currentVal = null;
        if (left.val == null && right.val == null) {
            ListNode node = new ListNode(currentVal);
            node.setNext(null);
            return node;
        }

        if (left.val == null) {
            currentVal = right.val;

            left = left;
            right = right.next;
        } else if (right.val == null) {
            currentVal = left.val;

            left = left.next;
            right = right;
        } else if (left.val <= right.val) {
            currentVal = left.val;

            left = left.next;
            right = right;
        } else {
            currentVal = right.val;
            left = left;
            right = right.next;
        }
        ListNode node = new ListNode(currentVal);
        node.setNext(getNextNode(left, right));
        return node;
    }
}
