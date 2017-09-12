package com.cn.struct.decorator.template.abstractTp;

public class ConcreteSubject extends Subject
{
    private String state;

    public void change(String newState)
    {
        state = newState;

        this.notifyObservers();
    }
}
