package com.example.demo.List;

/**
 * @Author: Jinzhenzhen
 * @Data 19-5-20 下午7:51
 */
public class FindKthToTail {

    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     *
     * 扩展题：找中间节点，使用两个指针，一个走一步，一个走两步。找到中间节点
     *
     * 思路：定义一快一慢两个指针，快指针走K步，然后慢指针开始走，快指针到尾时，慢指针就找到了倒数第K个节点。
     * @param head
     * @param k
     * @return
     */
    public ListNode findkthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-- > 1) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);


        ListNode node3 = new ListNode(4);

        ListNode node4 = new ListNode(5);


        node.next = node3;
        node3.next = node4;

        System.out.println(new FindKthToTail().findkthToTail(node, 2).val);
    }
}
