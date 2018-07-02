package com.yifan.designpatterns.decorator.condiment;

import com.yifan.designpatterns.decorator.beverage.Beverage;

/**
 * 配料
 * 必须让CondimentDecorator可以取代Beverage
 * 所以CondimentDecorator扩展自Beverage
 * 配料 = 加了配料的饮料
 * @author wuyifan
 * @since 2018年01月11日
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 要让摩卡能够引入一个Beverage，
     * 1. 用一个实例记录饮料，也就是被装饰者
     * 2.要想让被装饰者（饮料）被记录到实例变量中，把饮料当作构造器的参数，由构造器将饮料记录在实例变量中
     */
    protected Beverage beverage;

    /**
     * 所有的调料装饰者都必须重新实现getDescription()
     * @return java.lang.String
     * @author wuyifan
     * @since 2018年1月11日
     */
    @Override
    public abstract String getDescription();
}
