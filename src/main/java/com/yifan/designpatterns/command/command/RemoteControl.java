package com.yifan.designpatterns.command.command;

/**
 * 遥控器
 * @author wuyifan
 * @since 2018年01月23日
 */
public class RemoteControl {

    private final int COMMAND_SIZE = 7;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[COMMAND_SIZE];
        offCommands = new Command[COMMAND_SIZE];

        Command noCommand = new NoCommands();
        for (int i = 0; i < COMMAND_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand (int slot, Command onCommand, Command offCommand) {

        if (slot >= COMMAND_SIZE) {
            throw new IllegalArgumentException();
        }

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed (int slot) {
        if (slot >= COMMAND_SIZE) {
            throw new IllegalArgumentException();
        }
        onCommands[slot].execute();

        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed (int slot) {
        if (slot >= COMMAND_SIZE) {
            throw new IllegalArgumentException();
        }
        offCommands[slot].execute();
        undoCommand = offCommands[slot];

    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n-------Remote Control-------");
        for (int i = 0; i < COMMAND_SIZE; i++) {
            sb.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("      ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
