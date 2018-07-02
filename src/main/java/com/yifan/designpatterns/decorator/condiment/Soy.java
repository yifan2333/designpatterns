package com.yifan.designpatterns.decorator.condiment;

import com.yifan.designpatterns.decorator.beverage.Beverage;

/**
 * @author wuyifan
 * @since 2018年01月11日
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .36 + beverage.cost();
    }
}
