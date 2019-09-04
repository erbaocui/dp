package com.cn.dp.behavior.command.template;

public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        receiver.action();

    }
}
