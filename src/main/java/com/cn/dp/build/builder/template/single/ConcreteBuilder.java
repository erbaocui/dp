package com.cn.dp.build.builder.template.single;

public class ConcreteBuilder extends Builder
{
    private Product product = new Product() ;

    public void buildPart1()
    {
        product.add("aaaa");
    }

    public void buildPart2()
    {
        product.add("bbbbbb");
    }

    public Product retrieveResult()
    {
		return product;
    }
}
