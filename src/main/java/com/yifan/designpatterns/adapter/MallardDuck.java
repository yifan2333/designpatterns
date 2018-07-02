package com.yifan.designpatterns.adapter;

/**
 * @author wuyifan
 * @since 2018年01月24日
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying");
    }
}
