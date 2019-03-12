package com.example.demo;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-12 上午11:04
 */
public class NumberOf1InBinary {

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     *
     * @param n
     * @return
     */
    public int numberOf1InBinary(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOf1InBinary().numberOf1InBinary(5));
    }
}
