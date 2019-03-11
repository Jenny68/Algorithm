package com.example.demo;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-8 上午10:57
 */

public class SearchInBinary {
    public static boolean find(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int row = 0;
        int column = array[0].length - 1;
        while (row < array.length && column >= 0) {
            if (array[row][column] == target) {
                return true;
            } else if (array[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array = {{1,4,5},{2,5,6}};
        int target = 7;
        System.out.println("target find " + find(array, target));

    }
}
