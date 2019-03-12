package com.example.demo.List;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-11 下午2:18
 */
public class printListFromTailToHead {
    public static ArrayList<Integer> printListFromTailtoHead(ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(6);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(printListFromTailtoHead(listNode));


    }

}
