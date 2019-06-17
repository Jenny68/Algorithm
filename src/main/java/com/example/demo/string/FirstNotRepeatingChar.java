package com.example.demo.string;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-6 下午3:17
 */
public class FirstNotRepeatingChar {

    /**
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
     * @param str
     * @return
     */
    public static int firstNotRepeatingChar(String str) {
        char [] cha = str.toCharArray();
        int [] a = new int['z' + 1];
        for (int i = 0; i < cha.length; i++) {
            a[cha[i]] ++;
        }
        for (int i = 0; i < cha.length; i++) {
            if (a[cha[i]] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abbbadef";
        System.out.println(firstNotRepeatingChar(str));
    }
}
