package com.example.demo;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-12 上午10:06
 */
public class QuequeByTwoStack {
    Stack<Integer> stackFirst = new Stack<Integer>();
    Stack<Integer> stackSecond = new Stack<Integer>();

    public void push(int node){
        stackFirst.push(node);
    }
    public int pop(){
        while(!stackFirst.isEmpty()){
            stackSecond.push(stackFirst.pop());
        }
        int first = stackSecond.pop();
        while(!stackSecond.isEmpty()){
            stackFirst.push(stackSecond.pop());
        }
        return first;
    }

    public static void main(String[] args) {
        QuequeByTwoStack quequeByTwoStack = new QuequeByTwoStack();
        quequeByTwoStack.push(3);
        quequeByTwoStack.push(4);
        quequeByTwoStack.push(5);
        System.out.println(quequeByTwoStack.pop());
        System.out.println(quequeByTwoStack.pop());
        System.out.println(quequeByTwoStack.pop());
    }
}
