package niu;

import java.util.ArrayList;

public class T {
    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        ListNode L2 = new ListNode(2);
        ListNode L3 = new ListNode(3);
        ListNode L4 = new ListNode(4);
        L1.next = L2;
        L2.next = L3;
        L3.next = L4;
        reorderList(L1);
    }

    public static void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode head2 = head;
        while (true) {
            if (head2 == null) {
                break;
            }
            list.add(head2);
            head2 = head2.next;
        }
        int end = list.size() - 1;
        int mid = list.size() / 2;
        if (list.size() % 2 == 0) {
            mid--;
        }
        head2 = head;
        head2.next = list.get(end);
        head2 = head2.next;
        for (int i = 1; i < end; i++) {
            head2.next = list.get(i);
            head2 = head2.next;
            head2.next = list.get(end - i);

            if (i == mid) {
                head2.next.next=null;
                break;
            }else{
                head2 = head2.next;
            }
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
