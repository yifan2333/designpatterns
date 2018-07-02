package com.yifan.designpatterns.factory.ingredientfactory;

import com.yifan.designpatterns.factory.ingredientfactory.ingredient.*;

import java.util.Arrays;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public abstract class Pizza {

    String name;

    Dough dough;

    Sauce sauce;

    Veggies[] veggies;

    Cheese cheese;

    Clams clams;

    abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", clams=" + clams +
                '}';
    }
}
