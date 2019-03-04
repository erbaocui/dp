package com.cn.behavior.memento.example;

public class Client {
    public static void main(String[] args) {
            Originator originator=new Originator();
            originator.setBudget(new Double(100));
            originator.setMobile("12341234");
             originator.setName("张三");
             originator.show();
             CareTaker careTaker=new CareTaker();
             careTaker.setMemento(originator.saveMemento());


            originator.setBudget(new Double(200));
            originator.setMobile("987654321");
             originator.setName("李四");
            originator.show();
             originator.restoreMemento(careTaker.getMemento());
        originator.show();

    }
}
