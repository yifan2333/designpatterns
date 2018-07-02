package com.yifan.designpatterns.singleton;

/**
 * @author wuyifan
 * @since 2018年01月18日
 */
public class Singleton3 {
    private volatile static Singleton3 uniqueInstance;

    private Singleton3 () {}

    /**
     * 检查实例，如果不存在，就进入同步块。
     * 注意，只有第一次才执行实例化的代码
     * 进入区块后，再检查一次。如果仍是null，才创建实例 
     * @return com.yifan.designpatterns.singleton.Singleton3
     * @author wuyifan
     * @since 2018年1月18日
     */
    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
