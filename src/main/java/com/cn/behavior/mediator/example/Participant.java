package com.cn.behavior.mediator.example;

public class Participant {
    private Chatroom chatroom;
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void send(String to,String message){
        chatroom.sentd(this.name,to,message);
    }

    public  void receive(String from,String message){
        System.out.println(from +"to " );
    }
}
