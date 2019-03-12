package com.example.demo;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-12 上午10:56
 */
public class JumpFloor {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     * @param target
     * @return
     */
    public int jumpFloor(int target) {
        int first = 1;
        int second = 2;
        int sum = 0;
        if (target <= 0) {
            return 0;
        } else if (target == 1){
            return 1;
        }else if (target == 2) {
            return 2;
        } else {
            for (int i = 3; i <= target; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(new JumpFloor().jumpFloor(5));
    }
}
