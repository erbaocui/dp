package com.cn.struct.adapter.template.objectadapter;

public class Client {
    public static void main(String[] args) {

        Target target= new Adapter(new ConcreteAdapteeA());
        target.newAction();
        target = new Adapter(new ConcreteAdapteeB());
        target.newAction();



    }
}
