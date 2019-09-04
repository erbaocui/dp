package com.cn.dp.behavior.observer.template;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements  Subject{

    private List<Observer> list =new ArrayList<Observer>();

    public void attach(Observer observer) {
        list.add(observer);

    }

    public void detach(Observer observer) {
        list.remove(observer);

    }

    public void notifyObservers(Object object) {
        for(Observer observer:list){
            observer.update(object);
        }

    }

    public  void invoke(){
        for (int i=0;i<10;i++){
            System.out.println(i);
            notifyObservers(i);
        }
    }
}
