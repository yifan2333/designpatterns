package com.yifan.designpatterns.command.command;

/**
 * 关灯
 * @author wuyifan
 * @since 2018年01月23日
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
