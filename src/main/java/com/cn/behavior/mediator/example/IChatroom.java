package com.cn.behavior.mediator.example;

import com.cn.behavior.responsibility.template.Handler;

import java.util.Hashtable;

//中介者接口
public interface IChatroom {


    public  void register(Participant Participant);
    public  void sentd(String from,String to,String message);
}
