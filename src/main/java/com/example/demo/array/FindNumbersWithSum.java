package com.example.demo.array;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-13 下午1:12
 */


import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (array == null || array.length < 2) {
            return arrayList;
        }
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if ((array[i] + array[j]) == sum) {
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                break;
            } else if ((array[i] + array[j]) > sum) {
                j--;
            } else {
                i++;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 9;
        System.out.println("start");
        System.out.println(new FindNumbersWithSum().findNumbersWithSum(array, sum));
        System.out.println("end");
    }
}
