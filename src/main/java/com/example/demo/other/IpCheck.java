package com.example.demo.other;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-24 上午10:09
 */
public class IpCheck {
    public static boolean ipCheck(String ip) {
        String regx = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\." + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                +"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\." + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
        if (ip.matches(regx)) {
            System.out.println("Legal IP");
            return true;
        } else {
            System.out.println("Illeagle IP");
            return false;
        }
    }

    public static void main(String[] args) {
        String ip1= "0.123.123.1233";
        System.out.println(ipCheck(ip1));
    }
}
