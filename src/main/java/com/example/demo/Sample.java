//package com.xiaomi.xmpush.server.test;
//
//import org.junit.Test;
//
//import java.util.Arrays;
//
///**
// * @Author: Jinzhenzhen
// * @Data 19-5-14 上午11:52
// */
//public class Simple {
//
//    @Test
//    public void name() {
//        int[][] triangle = new int[][]{{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
////        System.out.println(minimumTotal(triangle));
//        System.out.println(minimumTotal2(triangle));
//    }
//
//    public int minimumTotal(int[][] triangle) {
//        System.out.println(Arrays.deepToString(triangle));
//        // write your code here
//        if (triangle == null || triangle.length == 0)
//            return 0;
//        int len = triangle.length;
//        //用来记录每一步的状态
//        int[][] cost = new int[len][len];
//        cost[0][0] = triangle[0][0];
//        for (int i = 1; i < len; i++) {
//
//            for (int j = 0; j < triangle[i].length; j++) {
//                //计算上一个状态的时候，防止出现越界问题
//                int lower = Math.max(0, j - 1);
//                int upper = Math.min(j, triangle[i - 1].length - 1);
//                //状态转移方程
//                cost[i][j] = Math.min(cost[i - 1][lower], cost[i - 1][upper]) + triangle[i][j];
//                System.out.println(i + "," + j + "-" + ":" + cost[i][j]);
//            }
//            System.out.println(Arrays.deepToString(cost));
//        }
//        int minCost = Integer.MAX_VALUE;
//        for (int k = 0; k < triangle[len - 1].length; k++) {
//            minCost = Math.min(minCost, cost[len - 1][k]);
//        }
//
//        return minCost;
//    }
//
//    public int minimumTotal2(int[][] triangle) {
//        if (triangle == null || triangle.length == 0)
//            return 0;
//        int len = triangle.length;
//        //用来记录每一步的状态
//        int[][] cost = new int[len][len];
//        cost[0][0] = triangle[0][0];
//        for (int i = 1; i < len; i++) {
//            int min = min(cost[i - 1], triangle[i - 1].length);
//            for (int j = 0; j < triangle[i].length; j++) {
//                cost[i][j] = min + triangle[i][j];
//            }
//            System.out.println(Arrays.deepToString(cost));
//        }
//        return min(cost[len - 1], len);
//    }
//
//    public int min(int[] ints, int len) {
//        return Arrays.stream(Arrays.copyOf(ints, len)).min().orElseThrow(RuntimeException::new);
//    }
//}
