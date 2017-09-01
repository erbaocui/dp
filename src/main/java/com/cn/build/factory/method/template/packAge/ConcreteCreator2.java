package com.cn.build.factory.method.template.packAge;

public class ConcreteCreator2 implements Creator
{
    public Product factory()
    {
        return new ConcreteProduct2();
    }
}
