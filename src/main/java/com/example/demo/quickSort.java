package com.example.demo;

import java.util.Arrays;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-21 上午10:54
 */
public class quickSort {
    public static int partition(int [] arr, int left, int right) {
        int temp = arr[left];
        while (right  > left) {
            while ( right > left && temp <= arr[right]) {
                --right;
            }
            if (right > left) {
                arr[left++] = arr[right];
            }

            while (right > left && temp > arr[left]) {
                ++left;
            }
            if (right > left) {
                arr[right--] = arr[left];
            }
        }
        arr[left] = temp;
        return left;
    }

    public static void quickSort(int [] arr, int start, int end) {
        if (arr == null || arr.length <= 1 || end <= start) {
            return;
        }
        int partition = partition(arr, start, end);
        System.out.println(partition);
        quickSort(arr, start, partition);
        quickSort(arr, partition + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 7, 9, 1, 8, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
