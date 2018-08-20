package com.leetcode.linkedlist;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode listNode = new MergeTwoSortedLists().mergeTwoLists(testNode(), testNode2());
        assertThat(listNode.val, is(1));
        assertThat(listNode.next.next, is(2));
    }


    private ListNode testNode() {
        ListNode start1 = new ListNode(1);
        ListNode start2 = new ListNode(2);
        ListNode start3 = new ListNode(4);
        ListNode end = new ListNode(null);
        start1.next=start2;
        start2.next=start3;
        start3.next = end;
        return start1;
    }

    private ListNode testNode2() {
        ListNode start1 = new ListNode(1);
        ListNode start2 = new ListNode(3);
        ListNode start3 = new ListNode(4);
        ListNode end = new ListNode(null);
        start1.next=start2;
        start2.next=start3;
        start3.next = end;
        return start1;
    }
}