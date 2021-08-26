package com.songyuankun;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reverseList = new ReverseList().reverseList(listNode);
        System.out.println(reverseList);
    }


    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> listNodes = new ArrayList<>();
        if (head == null || head.next == null) {
            return head;
        }
        do {
            listNodes.add(head);
            head = head.next;
        } while (head != null);
        ListNode listNode = listNodes.get(listNodes.size() - 1);
        listNodes.get(0).next = null;
        for (int i = listNodes.size() - 1; i > 0; i--) {
            listNodes.get(i).next = listNodes.get(i - 1);
        }
        return listNode;
    }
}
