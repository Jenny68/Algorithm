package com.example.demo.List;

/**
 * @Author: Jinzhenzhen
 * @Data 19-5-21 上午10:19
 */
public class DeleteNode {


    /**
     * O(1)时间删除链表节点
     *
     * @param head
     * @param nodeToBeDeleted
     */
    public void deleteNode(ListNode head, ListNode nodeToBeDeleted) {
        if (head == null || nodeToBeDeleted == null) {
            return;
        }
        //待删除的节点是头结点
        if (head == nodeToBeDeleted) {
            head = null;
        } else {
            //待删除的节点是尾节点
            if (nodeToBeDeleted.next == null) {
                ListNode pointListNode = head;
                while (pointListNode.next.next != null) {
                    pointListNode = pointListNode.next;
                }
                pointListNode.next = null;
            } else {
                nodeToBeDeleted.val = nodeToBeDeleted.next.val;
                nodeToBeDeleted.next = nodeToBeDeleted.next.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(6);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        new DeleteNode().deleteNode(listNode, listNode);
        PrintListUtils.printList(listNode);
    }
}
