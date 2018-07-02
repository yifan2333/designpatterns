package com.yifan.designpatterns.factory.factorymethod;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
