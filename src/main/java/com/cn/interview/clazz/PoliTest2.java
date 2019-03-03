package com.cn.interview.clazz;

public class PoliTest2 {
    public static void main(String[] args) {
        Parent p=new Child();
        p.doSomething();
        Parent2 p2=new Child2();
        p2.doSomething();

    }
}

class Parent {
    public void doSomething(){
        System.out.println("parent");
    }
}

class Child extends  Parent{
    @Override
    public void doSomething() {
        System.out.println("child");
    }
}

interface  Parent2 {
   public void  doSomething();
}

class Child2 implements Parent2{
    public void doSomething() {
        System.out.println("child2");
    }
}
