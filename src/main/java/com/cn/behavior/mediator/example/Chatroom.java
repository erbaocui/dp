package com.cn.behavior.mediator.example;

import java.util.HashSet;
import java.util.Hashtable;

//具体中介者
public class Chatroom implements IChatroom {

    private HashSet<Participant> participants = new HashSet<Participant>();

    public void register(Participant participant) {
        if(!participants.contains(participant)){

        }

    }

    public void sentd(String from, String to, String message) {

    }
}
