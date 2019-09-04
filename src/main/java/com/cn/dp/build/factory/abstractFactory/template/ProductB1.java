package com.cn.dp.build.factory.abstractFactory.template;

public class ProductB1 implements ProductB
{
    public ProductB1()
    {
    }

    public void interact(ProductA productA) {
        System.out.println(this.getClass().getName()+" interact " +productA.getClass().getName());
    }
}
