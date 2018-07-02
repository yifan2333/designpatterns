package com.yifan.designpatterns.adapter;

/**
 * @author wuyifan
 * @since 2018年01月24日
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying a short distance");
    }
}
