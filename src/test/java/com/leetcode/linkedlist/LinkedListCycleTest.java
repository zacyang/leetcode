package com.leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {

    @Test
    public void hasCycle() {
        boolean result = new LinkedListCycle().hasCycle(cyclarNodes());
        assertTrue(result);
    }
    @Test
    public void hasCycleFalse() {
        boolean result = new LinkedListCycle().hasCycle(noneCyclarNodes());
        assertTrue(result);
    }

    @Test
    public void hasCycleFalseEmpty() {
        boolean result = new LinkedListCycle().hasCycle(new ListNode(0));
        assertTrue(result);
    }

    private ListNode cyclarNodes() {
        ListNode start1 = new ListNode(1);
        ListNode start2 = new ListNode(2);
        ListNode start3 = new ListNode(3);
        ListNode start4 = new ListNode(4);
        ListNode start5 = new ListNode(5);
        ListNode end = new ListNode(null);
        start1.next=start2;
        start2.next=start3;
        start3.next=start1;
        return start1;
    }

    private ListNode noneCyclarNodes() {
        ListNode start1 = new ListNode(1);
        ListNode start2 = new ListNode(2);
        ListNode start3 = new ListNode(3);
        ListNode start4 = new ListNode(4);
        ListNode start5 = new ListNode(5);
        ListNode end = new ListNode(null);
        start1.next=start2;
        start2.next=start3;
        start3.next = start4;
        start4.next = start5;
        start5.next = end;
        return start1;
    }
}