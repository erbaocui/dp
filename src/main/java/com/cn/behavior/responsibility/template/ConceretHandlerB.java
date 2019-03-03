package com.cn.behavior.responsibility.template;

public class ConceretHandlerB extends Handler {
    @Override
    public void handlerRequest(Integer request) {
        if(request>=11&&request<=20){
            System.out.println("Handler b 11-20");
        }else{
            handler.handlerRequest(request);
        }
    }
}
