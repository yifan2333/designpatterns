package com.yifan.designpatterns.factory.factorymethod;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public abstract class PizzaStore {

    /**
     * 创建pizza
     * @param type type
     * @return Pizza
     * @author wuyifan
     * @since 2018年1月17日
     */
    protected abstract Pizza createPizza(String type);
}
