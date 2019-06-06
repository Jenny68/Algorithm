package com.example.demo;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-6 上午9:35
 */
public class String2Int {

    /**
     * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
     * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
     *
     * 输入描述: 输入一个字符串,包括数字字母符号,可以为空
     *
     * 输出描述: 如果是合法的数值表达则返回该数字，否则返回0
     * @param str
     * @return
     */
    public static int strToInt(String str) {
        if (str.trim().equals("") || str.length() == 0) {
            return 0;
        }
        char[] ch = str.toCharArray();
        int simbol = 0;
        int sum = 0;
        if (ch[0] == '-') {
            simbol = 1;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '+') {
                continue;
            }

            if (ch[i] < '0' || ch[i] > '9') {
                return 0;
            }
            sum = sum * 10 + (ch[i] - '0');
        }
        return simbol == 0 ? sum : -sum;
    }

}
