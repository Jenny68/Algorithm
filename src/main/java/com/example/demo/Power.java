package com.example.demo;

import com.sun.xml.internal.ws.api.policy.PolicyResolver;

import static java.lang.Math.abs;

/**
 * @Author: Jinzhenzhen
 * @Data 19-3-13 上午9:42
 */
public class Power {

    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     * 快速幂算法
     * @param base
     * @param exponent
     * @return
     */
    public double power(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        double res = 1.0;
        int temp = abs(exponent);
        while (temp != 0) {
            if ((temp & 1) != 0) {
                res *= base;
            }
            base *= base;
            temp >>= 1;
        }
        return exponent > 0 ? res : 1 / res;
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = -3;
        double d = 1.2;
        double e = 2;
        System.out.println(new Power().power(b, (int)a));
        System.out.println(new Power().power(a, (int)b));
        System.out.println(new Power().power(d, (int)c));
        System.out.println(new Power().power(e, (int)c));
    }
}
