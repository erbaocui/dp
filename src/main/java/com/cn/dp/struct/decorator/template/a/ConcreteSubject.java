package com.cn.dp.struct.decorator.template.a;

public class ConcreteSubject extends Subject
{
    private String state;

    public void change(String newState)
    {
        state = newState;

        this.notifyObservers();
    }
}
