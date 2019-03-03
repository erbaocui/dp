package com.cn.behavior.command.template;

public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        receiver.action();

    }
}
