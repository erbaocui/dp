package com.cn.behavior.responsibility.template;

public abstract class Handler {
    protected  Handler handler;

    public  void setHandler(Handler handler){
        this.handler=handler;
    }

    public abstract  void handlerRequest(Integer request);

}
