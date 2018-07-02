package com.yifan.designpatterns.compositepattern.iterator;

import java.util.List;

/**
 * @author wuyifan
 * @since 2018年01月25日
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

    private List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
