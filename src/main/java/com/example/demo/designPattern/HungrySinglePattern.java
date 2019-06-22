package com.example.demo.designPattern;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-22 下午2:28
 */


/**
 * 常用
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class HungrySinglePattern {
    private HungrySinglePattern() {
    }

    private static HungrySinglePattern outInstance = new HungrySinglePattern();
    public static HungrySinglePattern getOutInstance() {
        return outInstance;
    }
}
