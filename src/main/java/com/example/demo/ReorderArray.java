package com.example.demo;

import java.util.Arrays;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-13 上午10:39
 */
public class ReorderArray {
    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length - 1 - i; i1++) {
                if (array[i1] % 2 == 0 && array[i1 + 1] % 2 != 0){
                    temp = array[i1 + 1];
                    array[i1 + 1] = array[i1];
                    array[i1] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        new ReorderArray().reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
