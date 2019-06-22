package com.example.demo.List;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-21 下午2:43
 */
public class FindFirstCommonNode {

    /**
     * 输入两个链表，找出它们的第一个公共结点。
     * <p>
     * 两个指针走到末尾时从另一个链表开始继续遍历
     *
     * @param node1
     * @param node2
     * @return
     */
    public static ListNode findFirstCommonNode(ListNode node1, ListNode node2) {
//        ListNode p1 = pHead1, p2 = pHead2;
//        while (p1 != p2) {
//            p1 = (p1 != null ? p1.next : pHead2);
//            p2 = (p2 != null ? p2.next : pHead1);
//        }
//        return p1;
        int len1 = PrintListUtils.getLength(node1);
        int len2 = PrintListUtils.getLength(node2);
        System.out.println(len1);
        System.out.println(len2);
        int diff = len1 - len2;
        ListNode longHead = diff > 0 ? node1 : node2;
        ListNode shorHead = diff > 0 ? node2 : node1;
        for (int i = 0; i < Math.abs(diff); i++) {
            longHead = longHead.next;
        }
        while (longHead != null && shorHead != null && !longHead.equals(shorHead)) {
            longHead = longHead.next;
            shorHead = shorHead.next;
        }
        return shorHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(5);

        ListNode node3 = new ListNode(4);

        ListNode node4 = new ListNode(5);

        node.next = node3;
        node3.next = node4;
        node1.next = node4;
        PrintListUtils.printList(node);
        PrintListUtils.printList(node1);
        System.out.println(findFirstCommonNode(node, node1).val);
    }


}
