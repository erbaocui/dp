package com.cn.dp.build.builder.template.multi;

public class ConcreteBuilder2 extends Builder
{

    private Product product = new Product2() ;

    public void buildPart1()
    {
        product.add("builder2 Product2 part1");
    }

    public void buildPart2()
    {
        product.add("builder2 Product2 part2");
    }

    public Product retrieveResult()
    {
		return product;
    }
}
