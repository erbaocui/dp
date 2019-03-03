package com.cn.interview.clazz;

import java.util.Random;

public class PoliTest {

    public  Father get(){
        Random random=new Random();

        int a= random.nextInt(3);
        switch (a){
            case 0:
                 return new Son();
            case 1:
                return new Son2();
            case 2:
                return new Son3();
        }
            return null;
    }
    public static void main(String[] args) {

      PoliTest p=new PoliTest();
      Father f=p.get();
      f.doSomething();
    }
}

class Father {
    public void doSomething(){
        System.out.println("parent");
    }
}
class Son extends  Father{
    @Override
    public void doSomething() {
        System.out.println("son");
    }
}
class Son2 extends  Father{
    @Override
    public void doSomething() {
        System.out.println("son2");
    }
}
class Son3 extends  Father{
    @Override
    public void doSomething() {
        System.out.println("son3");
    }
}

