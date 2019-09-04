package com.cn.dp.build.factory.facotryMethod.template.i;

public class ConcreteCreator1 implements Creator
{
    public Product factory()
    {
        return new ConcreteProduct1();
    }
}
