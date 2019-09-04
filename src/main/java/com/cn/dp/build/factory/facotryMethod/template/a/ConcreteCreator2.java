package com.cn.dp.build.factory.facotryMethod.template.a;

public class ConcreteCreator2 extends Creator
{
    public Product factory()
    {
        return new ConcreteProduct2();
    }
}
