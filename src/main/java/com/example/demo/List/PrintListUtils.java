package com.example.demo.List;

/**
 * @Author: Jinzhenzhen
 * @Data 19-5-21 上午10:38
 */
public class PrintListUtils {
    public static void printList(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }

    }

    public static int getLength(ListNode node) {
        ListNode tmp = node;
        int len = 0;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }
}
