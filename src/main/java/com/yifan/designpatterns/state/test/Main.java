package com.yifan.designpatterns.state.test;

import com.yifan.designpatterns.state.GumballMachine;

/**
 * @author yifan
 * @since 2018年04月04日
 */
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

//        Random randomWinner = new Random(System.currentTimeMillis());
//
//        System.out.println(randomWinner.nextInt(10));

    }

}
