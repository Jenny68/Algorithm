package com.example.demo.designPattern;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-22 下午2:16
 */

/**
 * 懒汉模式
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 *
 */
public class SinglePattern {

    //创建SingleObject的一个对象
    private static SinglePattern ourInstance;
    //获取唯一可用的的对象
    public static synchronized SinglePattern getInstance() {
        if (ourInstance == null){
            ourInstance = new SinglePattern();
        }
        return ourInstance;
    }
    //让构造函数为private, 这样类就不会被实例化
    private SinglePattern() {
    }
}
