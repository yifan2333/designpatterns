package com.yifan.designpatterns.command.command;

/**
 * 命令接口
 * @author wuyifan
 * @since 2018年01月23日
 */
public interface Command {
    /**
     * 执行命令
     * @author wuyifan
     * @since 2018年1月23日
     */
    void execute();
    /**
     * 撤销操作
     * @author wuyifan
     * @since 2018年1月23日
     */
    void undo();
}
