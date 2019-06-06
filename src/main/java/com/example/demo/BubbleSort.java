package com.example.demo;

import java.util.Arrays;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-20 下午4:36
 */
public class BubbleSort {
    public  void bubbleSort(int [] a){
        int j , k;
        //flag来记录最后交换的位置，也就是排序的尾边界
        int flag = a.length;
        //排序未结束标志
        while (flag > 0){
            //k 来记录遍历的尾边界
            k = flag;
            flag = 0;

            for(j=1; j<k; j++){
                //前面的数字大于后面的数字就交换
                if(a[j-1] > a[j]){
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;

                    //表示交换过数据;
                    flag = j;
                }
            }
        }
    }


    public static void bubbleSort1(int [] arr) {
        //表示是否有数字交换
        int exchangeFlag = 1;
        for (int i1 = 0; i1 < arr.length && exchangeFlag == 1; i1++) {
            exchangeFlag = 0;
            System.out.println(Arrays.toString(arr));
            for (int i2 = i1 + 1; i2 < arr.length; i2++) {
                if (arr[i2] < arr[i1]) {
                    exchangeFlag = 1;
                    int temp = arr[i2];
                    arr[i2] = arr[i1];
                    arr[i1] = temp;
                }

            }

        }

    }

    public static void main(String[] args) {
        int [] a = {5,4,3,2,1,1,2,3,4,5};
//        new BubbleSort().bubbleSort(a);
        bubbleSort1(a);
        System.out.println(Arrays.toString(a));
    }
}
