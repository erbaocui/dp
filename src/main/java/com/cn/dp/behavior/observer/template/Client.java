package com.cn.dp.behavior.observer.template;

public class Client {

    public static void main(String[] args) {
       Subject subject=new ConcreteSubject();
       Observer obj1=new ConcreteObserver();
        subject.attach( obj1);
           //...
        Observer objn=new ConcreteObserver();
        subject.attach( objn);
        ((ConcreteSubject) subject).invoke();
    }
}
