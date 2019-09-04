package com.cn.dp.behavior.responsibility.template;

public class ConceretHandlerN extends Handler {
    @Override
    public void handlerRequest(Integer request) {
        if(request>=21&&request<=30){
            System.out.println("Handler N 21-30");
        }else if(handler!=null){
            handler.handlerRequest(request);
        }
    }
}
