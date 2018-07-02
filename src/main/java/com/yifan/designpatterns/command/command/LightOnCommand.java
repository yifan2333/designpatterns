package com.yifan.designpatterns.command.command;

/**
 * 开灯
 * @author wuyifan
 * @since 2018年01月23日
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
