package com.yifan.designpatterns.command.command;

/**
 * @author wuyifan
 * @since 2018年01月23日
 */
public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Stereo stereo = new Stereo();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffWithCDCommand);

        remoteControl.onButtonWasPushed(0);

        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
    }

}
