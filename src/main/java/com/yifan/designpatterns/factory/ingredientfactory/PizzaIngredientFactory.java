package com.yifan.designpatterns.factory.ingredientfactory;

import com.yifan.designpatterns.factory.ingredientfactory.ingredient.*;

/**
 * @author wuyifan
 * @since 2018年01月17日
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepproni();

    Clams createClams();

}
