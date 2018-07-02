package com.yifan.designpatterns.factory.ingredientfactory;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public abstract class PizzaStore {

    public Pizza orderPizza (String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 创建pizza
     * @param type type
     * @return Pizza
     * @author wuyifan
     * @since 2018年1月17日
     */
    protected abstract Pizza createPizza(String type);
}
