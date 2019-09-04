package com.cn.dp.build.factory.abstractFactory.template;

public class ConcreteFactory1 extends Factory
{
    public ProductA createA()
    {
        return new ProductA1();
    }

    public ProductB createB()
    {
        return new ProductB1();
    }


}
