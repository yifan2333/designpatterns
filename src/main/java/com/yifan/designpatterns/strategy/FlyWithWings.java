package com.yifan.designpatterns.strategy;

/**
 * @author wuyifan
 * @since 2018年01月09日
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!!");
    }
}
