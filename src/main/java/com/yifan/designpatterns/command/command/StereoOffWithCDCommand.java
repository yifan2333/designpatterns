package com.yifan.designpatterns.command.command;

/**
 * @author wuyifan
 * @since 2018年01月23日
 */
public class StereoOffWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
