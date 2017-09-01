package com.cn.build.factory.method.template.abstractorClass;

public class ConcreteCreator2 extends Creator
{
    public Product factory()
    {
        return new ConcreteProduct2();
    }
}
