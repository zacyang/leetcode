package com.leetcode.linkedlist;

public class ListNode {
    Integer val;
    ListNode next;

    ListNode(Integer x) {
        val = x;
    }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return this.next;
    }

}
