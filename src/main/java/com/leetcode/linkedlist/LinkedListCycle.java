package com.leetcode.linkedlist;

import java.util.HashMap;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Boolean> listNodeBooleanHashMap = new HashMap<ListNode, Boolean>();
        ListNode current = head;
        if(head==null) {
            return false;
        }
        while (current.next != null) {
            Boolean visited = listNodeBooleanHashMap.get(head);
            if (visited != null) {
                return true;
            }

            listNodeBooleanHashMap.put(head, true);

            current = current.next;
        }
        return false;
    }
}
