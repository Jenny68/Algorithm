package com.example.demo.tree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: Jinzhenzhen
 * @Data 19-5-22 下午2:10
 */
public class PrintFromTopToBottom {

    /**
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     * linklist   push == addFirst   pop = removeFirst  remove删除第一个元素
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            //poll是从第一位置检查并且删除
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                //addlast是从最后面加上
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }

        }
        return list;
    }
}
