package com.cn.dp.build.prototype.template.simple;

public class Client
{
    public void operation(Prototype example)
    {
        Prototype p = (Prototype) example.clone();
    }


    private Prototype prototype;

    public static void main(String[] args) {
        Prototype a=new ConcretePrototype("a");
        Prototype b=(Prototype)a.clone();
    }
}
