package com.example.demo;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-11 下午1:29
 */
public class replaceSpace {
    public  static String trim(String str) {
        if (str == null) {
            return null;
        }
        int beginIndex = 0;
        int endIndex = str.length() - 1;
        while (str.charAt(beginIndex) == ' ') {
            beginIndex++;
        }
        while (str.charAt(endIndex) == ' ') {
            endIndex--;
        }
        return str.substring(beginIndex, endIndex + 1);
    }

    public static String replaceSpace(String  str) {
        if (str == null) {
            return null;
        }
        str = trim(str);
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            } else if(str.charAt(i) == ' ' && str.charAt(i + 1) == ' '){
                continue;
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "  We  are  happy     ";
        System.out.println(replaceSpace(str));
    }
}
