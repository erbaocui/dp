package com.cn.dp.struct.adapter.template.objectadapter;

public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){

        this.adaptee = adaptee;
    }

    public void newAction() {
        adaptee.oldAction();
    }
}
