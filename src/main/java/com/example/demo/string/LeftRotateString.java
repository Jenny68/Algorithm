package com.example.demo.string;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-17 上午10:43
 */
public class LeftRotateString {

    /**
     * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
     * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
     *
     * @param str
     * @param n
     * @return
     */
    public static String leftRotateString(String str, int n) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int N;  //代表移动的位数
        if (n <= str.length()) {
            N = n;
        } else {
            N = n % str.length();
        }

        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = N; i < str.length(); i++) {
            sb.append(ch[i]);
        }
        for (int i = 0; i < N; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcXYZdef";
        System.out.println(leftRotateString(s, 3));
    }
}
