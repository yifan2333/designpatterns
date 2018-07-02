package com.yifan.designpatterns.decorator.beverage;

/**
 * 装饰者模式
 * 饮料基类
 * 一个抽象类
 * @author wuyifan
 * @since 2018年01月11日
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
