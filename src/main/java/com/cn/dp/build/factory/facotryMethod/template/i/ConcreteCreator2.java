package com.cn.dp.build.factory.facotryMethod.template.i;

public class ConcreteCreator2 implements Creator
{
    public Product factory()
    {
        return new ConcreteProduct2();
    }
}
