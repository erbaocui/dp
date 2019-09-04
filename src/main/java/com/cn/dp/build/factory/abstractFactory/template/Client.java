package com.cn.dp.build.factory.abstractFactory.template;

public class Client {

    private  ProductA a;
    private  ProductB b;

    public Client(Factory factory) {
        a=factory.createA();
        b=factory.createB();
        b.interact(a);

    }

    public static void main(String[] args) {

        Factory factory1= new ConcreteFactory1();
        Factory factory2= new ConcreteFactory2();

        Client client1=new Client(factory1);
        Client client2=new Client(factory2);


    }
}
