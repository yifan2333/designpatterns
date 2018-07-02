package com.yifan.designpatterns.decorator.condiment;

import com.yifan.designpatterns.decorator.beverage.Beverage;

/**
 * 摩卡是一个装饰者，扩展自CondimentDecorator
 * @author wuyifan
 * @since 2018年01月11日
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super.beverage = beverage;
    }

    /**
     * 不止记录饮料，完整的连调料都描述出来
     * @return java.lang.String
     * @author wuyifan
     * @since 2018年1月11日
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 要计算带摩卡饮料的价钱，首先把调用委托给被装饰对象，
     * 以计算价钱，然后再加上Mocha的价钱，得到最终结果
     * @return double
     * @author wuyifan
     * @since 2018年1月11日
     */
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
