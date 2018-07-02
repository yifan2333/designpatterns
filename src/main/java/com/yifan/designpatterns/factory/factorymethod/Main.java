package com.yifan.designpatterns.factory.factorymethod;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public class Main {


    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.createPizza("cheese");
    }
}
