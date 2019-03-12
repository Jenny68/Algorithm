package com.example.demo;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-12 上午10:36
 */
public class Fibonacci {

    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     * n<=39
     * int的取值范围2的31次方
     * @param index
     * @return
     */
    public int fibonacci(int index) {
        int first = 1;
        int second = 1;
        int sum = 0;
        if (index <= 0) {
            return 0;
        } else if (index == 1 || index == 2) {
            return 1;
        } else {
            for (int i = 3; i <= index; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(40));
    }
}
