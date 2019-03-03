package com.cn.behavior.observer.template;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers(Object object);


}
