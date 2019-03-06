package com.cn.struct.decorator.template.a;

public class ConcreteObserver implements Observer
{
    public void update()
    {
        System.out.println("I am notified");
    }
}
