package com.cn.behavior.command.template;

public class Client {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command  command=new ConcreteCommand(receiver);
        Invoker invoker=new Invoker();
        invoker.SetCommand(command);
        invoker.executeCommand();

    }
}
