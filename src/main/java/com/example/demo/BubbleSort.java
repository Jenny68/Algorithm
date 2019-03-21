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

    public static void main(String[] args) {
        int [] a = {5,4,3,2,1,1,2,3,4,5};
        new BubbleSort().bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
