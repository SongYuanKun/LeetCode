package com.songyuankun;

import java.util.ArrayList;


public class ReverseBetween {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reverseList = new ReverseBetween().reverseBetween(listNode, 1, 5);
        System.out.println(reverseList);
    }


    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<ListNode> listNodes = new ArrayList<>();
        if (head == null || head.next == null) {
            return head;
        }
        do {
            listNodes.add(head);
            head = head.next;
        } while (head != null);
        if (left > 1) {
            listNodes.get(left - 2).next = listNodes.get(right - 1);
        }
        if (right < listNodes.size()) {
            listNodes.get(left - 1).next = listNodes.get(right);
        } else {
            listNodes.get(left - 1).next = null;
        }

        for (int i = right - 1; i > left - 1; i--) {
            ListNode listNode = listNodes.get(i);
            listNode.next = listNodes.get(i - 1);
        }
        if (left > 1) {
            return listNodes.get(0);
        } else {
            return listNodes.get(right - 1);
        }
    }
}
