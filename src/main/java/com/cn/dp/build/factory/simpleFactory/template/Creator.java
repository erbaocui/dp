package com.cn.dp.build.factory.simpleFactory.template;

public class Creator
{
    public static Product factory()
    {

        return new ConcreteProduct();
    }


}
