package com.cn.dp.build.factory.facotryMethod.template.a;

public class ConcreteCreator1 extends Creator
{
    public Product factory()
    {
        return new ConcreteProduct1();
    }
}
