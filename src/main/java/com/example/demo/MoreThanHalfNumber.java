package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-14 上午9:38
 */
public class MoreThanHalfNumber {

    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     *
     * @param array
     * @return
     */
    public int moreThanHalfNumber(int[] array) {
        if (array.length < 1) {
            return 0;
        }
        Arrays.sort(array);
        int num = array[array.length / 2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        if (count < array.length / 2) {
            num = 0;
        }
        return num;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,2,2,2,5,4,2};
        int [] array1 = {1,2,3,4,5};
        System.out.println(new MoreThanHalfNumber().moreThanHalfNumber(array));
        System.out.println(new MoreThanHalfNumber().moreThanHalfNumber(array1));
    }
}
