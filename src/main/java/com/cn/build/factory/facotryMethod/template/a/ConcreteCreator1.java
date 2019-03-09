package com.cn.build.factory.facotryMethod.template.a;

public class ConcreteCreator1 extends Creator
{
    public Product factory()
    {
        return new ConcreteProduct1();
    }
}
