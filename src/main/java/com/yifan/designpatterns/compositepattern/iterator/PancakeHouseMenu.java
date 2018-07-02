package com.yifan.designpatterns.compositepattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyifan
 * @since 2018年01月25日
 */
public class PancakeHouseMenu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {

        menuItems = new ArrayList<>();

        addItem("K&B`s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);

        addItem("Regular pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    @Deprecated
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
