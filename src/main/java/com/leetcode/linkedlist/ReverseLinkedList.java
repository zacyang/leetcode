package com.leetcode.linkedlist;


public class ReverseLinkedList {
//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode current = head;
//        while (current.val != null) {
//            ListNode next = current.next;
//            current.next = pre;
//            pre = current;
//            current = next;
//
//        }
//        return pre;
//
//    }

    public ListNode reverseList(ListNode head) {
       return recu(null, head);

    }
    public ListNode recu(ListNode pre, ListNode current) {
        ListNode node = null;
        if(current.val!=null) {
            ListNode temp = current.next;
            node = current;
            node.next = pre;
            return recu(current, temp);

        }
        return pre;

    }

}
