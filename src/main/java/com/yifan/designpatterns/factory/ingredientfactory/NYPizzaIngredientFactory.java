package com.yifan.designpatterns.factory.ingredientfactory;

import com.yifan.designpatterns.factory.ingredientfactory.ingredient.*;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Veggies()};

        return veggies;
    }

    @Override
    public Pepperoni createPepproni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }
}
