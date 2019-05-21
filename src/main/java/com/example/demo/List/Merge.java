package com.example.demo.List;

/**
 * @Author: Jinzhenzhen
 * @Data 19-5-20 下午7:36
 */
public class Merge {
    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode newHead = null;
        if (list1.val <= list2.val) {
            newHead = list1;
            newHead.next = merge(list1.next, list2);
        } else {
            newHead = list2;
            newHead.next = merge(list1, list2.next);
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2= new ListNode(3);

        ListNode node3 = new ListNode(4);

        ListNode node4 = new ListNode(5);

        node.next= node3;
        node3.next = node4;
        node1.next = node2;

        ListNode newHead = new Merge().merge(node, node1);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }






    }
}
