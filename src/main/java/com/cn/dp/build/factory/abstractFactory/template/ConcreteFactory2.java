package com.cn.dp.build.factory.abstractFactory.template;

public class ConcreteFactory2 extends Factory
{
    public ProductA createA()
    {
        return new ProductA2();
    }

    public ProductB  createB()
    {
        return new ProductB2();
    }


}
