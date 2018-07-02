package com.yifan.designpatterns.templatemethod;

/**
 * @author wuyifan
 * @since 2018年01月24日
 */
public class Tea {

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
