package com.cn.build.factory.method.template.abstractorClass;

public class ConcreteCreator1 extends Creator
{
    public Product factory()
    {
        return new ConcreteProduct1();
    }
}
