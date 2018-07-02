package com.yifan.designpatterns.decorator.beverage;

/**
 * 浓咖啡
 * 扩展自Beverage，因为Espresso是一种饮料
 * @author wuyifan
 * @since 2018年01月11日
 */
public class Espresso extends Beverage {

    /**
     * 设置饮料的描述，
     * description是继承自Beverage的变量
     * @author wuyifan
     * @since 2018年1月11日
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * 计算Espresso的价钱
     * @return double
     * @author wuyifan
     * @since 2018年1月11日
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
