package com.example.demo.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-21 下午4:21
 */
public class PrintMinNumber {
    public static String printMinNumber(int[] numbers) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : numbers) {
            res.add(i);
        }
        Collections.sort(res, (o1, o2) -> {
            String str1 = o1 + "" + o2;
            String str2 = o2 + "" + o1;
            return str1.compareTo(str2);
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i : res) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] a = {3,32,321};
        System.out.println(printMinNumber(a));
    }
}
