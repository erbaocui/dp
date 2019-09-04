package com.cn.dp.struct.decorator.template.a;

public class Client
{
    private static ConcreteSubject subject;
    private static Observer observer;

    public static void main(String[] args)
    {
		subject = new ConcreteSubject();

        observer = new ConcreteObserver();

        subject.attach(observer);

        subject.change("new state");

    }
}

