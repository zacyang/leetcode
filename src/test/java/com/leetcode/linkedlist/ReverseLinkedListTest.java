package com.leetcode.linkedlist;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
//        1->2->3->4->5->NULL

        ListNode listNode = testNode();
        ListNode result = new ReverseLinkedList().reverseList(listNode);

        assertThat(result.val, is(5));
        assertThat(result.next.val, is(4));
    }

    private ListNode testNode() {
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

    private ListNode anode(Integer val) {
        return new ListNode(val);
    }
}