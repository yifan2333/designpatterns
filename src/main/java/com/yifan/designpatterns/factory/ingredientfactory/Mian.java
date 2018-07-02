package com.yifan.designpatterns.factory.ingredientfactory;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public class Mian {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza);
    }
}
