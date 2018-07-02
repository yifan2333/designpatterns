package com.yifan.designpatterns.command.command;

/**
 * 遥控器初始化的时候将所有的命令赋值为该类，避免空指针
 * @author wuyifan
 * @since 2018年01月23日
 */
public class NoCommands implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
