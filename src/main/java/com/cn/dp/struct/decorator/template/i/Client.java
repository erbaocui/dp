package com.cn.dp.struct.decorator.template.i;

public class Client {
    public static void main(String[] args) {
        Component component=new ConcreteComponent();
        Component cd1=new ConcreteDecorator1(component);
        Component cd2=new ConcreteDecorator2(cd1);
        cd2.doSomething();
    }
}
