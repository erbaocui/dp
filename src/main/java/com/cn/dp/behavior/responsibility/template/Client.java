package com.cn.dp.behavior.responsibility.template;

public class Client {
    public static void main(String[] args) {
        Handler handlerA=new ConceretHandlerA();
        Handler handlerB=new ConceretHandlerB();
        Handler handlerN=new ConceretHandlerN();
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerN);

        handlerA.handlerRequest(9);
        handlerA.handlerRequest(15);
        handlerA.handlerRequest(23);


    }
}
