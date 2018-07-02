package com.yifan.designpatterns.command.simplecommand;

/**
 * 这是一个命令，所以要实现Command接口
 * @author wuyifan
 * @since 2018年01月22日
 */
public class LightOnCommand implements Command {
    Light light;

    /**
     * 构造器被传入了某个电灯（比方说客厅的电灯），
     * 以便让这个命令控制，然后记录在实例变量中。
     * 一旦调用execute()，就由这个电灯对象成为接收者，负责接收请求
     * @param light light
     * @author wuyifan
     * @since 2018年1月22日
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
