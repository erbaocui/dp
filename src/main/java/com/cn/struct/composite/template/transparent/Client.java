package com.cn.struct.composite.template.transparent;

public class Client {
    public static void main(String[] args) {
        Component comp= new Leaf();
        Component comp2= new Leaf();
        Component composite =new Composite();
        composite.add(comp);
        composite.add(comp2);
        composite.doSomething();

    }
}
