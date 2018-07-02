package com.yifan.designpatterns.compositepattern.iterator;

/**
 * @author wuyifan
 * @since 2018年01月25日
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
