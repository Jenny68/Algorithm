package com.example.demo.List;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-20 下午2:59
 */
public class ReverseList {

    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode newHead = null;
        ListNode currentNode = head;
        ListNode preNode = null;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) {
                newHead = currentNode;
            }
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(6);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(new ReverseList().reverseList(listNode).next.next.next.val);
    }
}
