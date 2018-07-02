package com.yifan.designpatterns.strategy;

/**
 * @author wuyifan
 * @since 2018年01月09日
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard duck");
    }

}
