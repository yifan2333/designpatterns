package com.yifan.designpatterns.command.command;

/**
 * 音响
 * @author wuyifan
 * @since 2018年01月23日
 */
public class Stereo {

    public void on() {
        System.out.println("Stereo is on!");
    }

    public void off() {
        System.out.println("Stereo is off!");
    }

    public void setCD() {
        System.out.println("CD is ready");
    }

    public void setRadio() {
        System.out.println("Radio is ready");
    }

    public void setVolume(int volume) {
        System.out.println("the volume is " + volume);
    }
}
