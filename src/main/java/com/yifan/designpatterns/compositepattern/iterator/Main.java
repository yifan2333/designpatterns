package com.yifan.designpatterns.compositepattern.iterator;

/**
 * @author wuyifan
 * @since 2018年01月25日
 */
public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }

}
