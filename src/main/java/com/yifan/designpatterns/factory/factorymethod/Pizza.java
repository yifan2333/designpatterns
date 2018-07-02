package com.yifan.designpatterns.factory.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");

        toppings.forEach(t -> System.out.println("    " + t));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore bos");
    }

    public String getName() {
        return name;
    }
}
