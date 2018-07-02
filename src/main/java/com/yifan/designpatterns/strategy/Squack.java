package com.yifan.designpatterns.strategy;

/**
 * @author wuyifan
 * @since 2018年01月09日
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
