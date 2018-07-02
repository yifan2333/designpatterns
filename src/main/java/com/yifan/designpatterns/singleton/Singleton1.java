package com.yifan.designpatterns.singleton;

/**
 * 会有多线程的问题
 * @author wuyifan
 * @since 2018年01月18日
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;

    private Singleton1() {}

    public static Singleton1 getInstance () {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
