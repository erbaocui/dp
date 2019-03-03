package com.cn.behavior.command.template;

public class Invoker {
    private Command command;


    public void SetCommand(Command command){
        this.command=command;
    }

    public void executeCommand(){
        command.execute();
    }
}
