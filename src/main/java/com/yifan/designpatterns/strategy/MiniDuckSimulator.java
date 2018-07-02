package com.yifan.designpatterns.strategy;

/**
 * @author wuyifan
 * @since 2018年01月09日
 */
public class MiniDuckSimulator {

    private String a;

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
