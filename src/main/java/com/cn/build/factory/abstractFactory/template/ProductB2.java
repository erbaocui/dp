package com.cn.build.factory.abstractFactory.template;

public class ProductB2 implements ProductB
{
    public ProductB2()
    {
    }

    public void interact(ProductA productA) {
        System.out.println(this.getClass().getName()+" interact " +productA.getClass().getName());
    }
}
