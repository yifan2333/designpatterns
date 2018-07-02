package com.yifan.designpatterns.decorator.beverage;

/**
 * @author wuyifan
 * @since 2018年01月11日
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
