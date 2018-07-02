package com.yifan.designpatterns.decorator;

import com.yifan.designpatterns.decorator.beverage.Beverage;
import com.yifan.designpatterns.decorator.beverage.Espresso;
import com.yifan.designpatterns.decorator.beverage.HouseBlend;
import com.yifan.designpatterns.decorator.condiment.Mocha;
import com.yifan.designpatterns.decorator.condiment.Soy;

/**
 * @author wuyifan
 * @since 2018年01月11日
 */
public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 实例化一个HouseBlend（基类）
        Beverage beverage1 = new HouseBlend();
        // 使用摩卡装饰这装饰 HouseBlend 得到一个加摩卡的HouseBlend
        beverage1 = new Mocha(beverage1);
        // 使用摩卡装饰这装饰 HouseBlend 得到一个加双倍摩卡的HouseBlend
        beverage1 = new Mocha(beverage1);
        // 使用豆浆装饰这装饰 HouseBlend 得到一个加豆浆加双倍摩卡的HouseBlend
        beverage1 = new Soy(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }

}
