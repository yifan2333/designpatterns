package com.yifan.designpatterns.command.simplecommand;

/**
 * 有一个插槽持有命令，而这个命令控制一个装置。
 * @author wuyifan
 * @since 2018年01月22日
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    /**
     * 这个方法用来设置插槽控制的命令。
     * 如果这段代码的客户想要改变遥控器按钮的行为，
     * 可以多次调用这个方法。
     * @param command command
      * @author wuyifan
     * @since 2018年1月22日
     */
    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * 当按下按钮时，
     * 这个方法就会被调用，
     * 使得当前命令衔接插槽，
     * 并调用它的execute()方法
     * @author wuyifan
     * @since 2018年1月22日
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
