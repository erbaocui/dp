package com.cn.dp.behavior.command.template;

public abstract class Command {

    protected Receiver receiver;
    public Command(Receiver receiver){
        this.receiver=receiver;
    }

    public abstract  void execute();
}
