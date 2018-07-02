package com.yifan.designpatterns.observer.javaobserver;

import javax.swing.*;
import java.awt.*;

/**
 * @author wuyifan
 * @since 2018年01月11日
 */
public class SwingObserverExample {
    JFrame jFrame;

    public void go() {
        jFrame = new JFrame();

        JButton button = new JButton("Should I do it");
        button.addActionListener(t -> System.out.println("Don`t do it, you might regret it!"));
        button.addActionListener(t -> System.out.println("Come on, do it!"));

        jFrame.getContentPane().add(BorderLayout.CENTER, button);
    }

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
}
