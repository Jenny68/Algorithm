package com.example.demo;

/**
 * @Author: Jinzhenzhen
 * @Data 19-5-21 上午10:46
 */

public class Print1ToMaxOfNDigits {

    /**
     * 打印1到最大的n位数
     * <p>
     * 思路：考虑大数问题，使用字符串或数组表示。
     *
     * @param n
     */
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            return;
        }
        int[] array = new int[n];
        printArray(array, 0);

    }

    private void printArray(int[] array, int n) {
        for (int i = 0; i < 10; i++) {
            if (n != array.length) {
                array[n] = i;
                printArray(array, n + 1);
            } else {
                boolean isFirstNo0 = false;
                for (int i1 = 0; i1 < array.length; i1++) {
                    if (array[i1] != 0) {
                        System.out.println(array[i1]);
                        if (!isFirstNo0) {
                            isFirstNo0 = true;
                        }
                    } else {
                        if (isFirstNo0) {
                            System.out.println(array[i1]);
                        }
                    }
                }
                System.out.println();
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Print1ToMaxOfNDigits().print1ToMaxOfNDigits(2);
    }


}
