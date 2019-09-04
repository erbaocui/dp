package com.cn.dp.struct.decorator.template.i;

public class Decorator implements Component


{

    private Component component;

//    public Decorator() {
//    }

    public Decorator(Component component)
    {

        this.component = component;
    }

    public void doSomething() {
        component.doSomething();
    }




}
