package com.cn.behavior.responsibility.template;

public class ConceretHandlerA extends Handler {
    @Override
    public void handlerRequest(Integer request) {
        if(request>=0&&request<=10){
            System.out.println("Handler A0-10");
        }else{
            handler.handlerRequest(request);
        }
    }
}
