package com.example.demo;

import java.util.Stack;

/**
 * @Author: Jinzhenzhen
 * @Data 19-5-22 下午2:35
 */


/**
 * 包含最小函数的栈结构
 */
public class StackIml {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public StackIml() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }
    //stack的peek只是查询栈顶元素并不删除   pop删除栈顶元素
    public void push(int node) {
        this.stack1.push(node);
        if (this.stack2.isEmpty()) {
            this.stack2.push(node);
        } else {
            if (this.stack2.peek() > node) {
                this.stack2.push(node);
            }
        }

    }

    public void pop() {
        if (stack1.pop().equals(stack2.peek()) ) {
            stack2.pop();
        }
    }

    public int top () {
        return stack1.peek();
    }

    public int min () {
        return stack2.peek();
    }

    public static void main(String[] args) {
        StackIml stackIml = new StackIml();
        stackIml.push(1);
        stackIml.push(3);

        stackIml.push(2);

        stackIml.push(4);

        System.out.println(stackIml.min());

        stackIml.pop();
        System.out.println(stackIml.top());


    }
}
