package com.cn.build.factory.facotryMethod.template.i;

public class Client
{

    public static void main(String[] args)
    {
        Creator creator1 = new ConcreteCreator1();
        Product prod1 = creator1.factory();

        Creator creator2 = new ConcreteCreator2();
        Product  prod2 = creator2.factory();

    }
}
