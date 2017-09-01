package com.cn.build.factory.method.template.packAge;

public class ConcreteCreator1 implements Creator
{
    public Product factory()
    {
        return new ConcreteProduct1();
    }
}
