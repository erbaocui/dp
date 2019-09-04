package com.cn.dp.struct.composite.template.safe;

public class Client {
    public static void main(String[] args) {
        Component comp= new Leaf();
        Component comp2= new Leaf();
        Composite composite =new Composite();
        composite.add(comp);
        composite.add(comp2);
        composite.doSomething();

    }
}
