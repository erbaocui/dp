package com.cn.dp.behavior.mediator.example;

//中介者接口
public interface IChatroom {


    public  void register(Participant Participant);
    public  void sentd(String from,String to,String message);
}
