package com.cn.behavior.observer.template;

public class ConcreteObserver implements Observer {

    public void update(Object object) {
        System.out.println("receive:"+object);

    }
}
