package com.yifan.designpatterns.singleton;

/**
 * 不会有多线程的问题，但会创建可能没有用一个实例，
 * 会消耗资源
 * @author wuyifan
 * @since 2018年01月18日
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return uniqueInstance;
    }
}
