package com.yifan.designpatterns.compositepattern.iterator;

/**
 * @author wuyifan
 * @since 2018年01月25日
 */
public class DinerMenu {

    private static final int MAX_ITEMS = 6;

    private int numberOfItems = 0;

    private MenuItem[] menuItems;

    public DinerMenu() {

        menuItems = new MenuItem[MAX_ITEMS];

        addItems("Vegetarian BLT", "(Fakin`) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItems("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItems("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItems("Hot dog", "A hot dog with saurkraut, relish, onions topped with cheese", false, 3.05);
    }

    private void addItems(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if(numberOfItems > MAX_ITEMS) {
            System.out.println("Sorry, menu id full! Can`t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Deprecated
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
