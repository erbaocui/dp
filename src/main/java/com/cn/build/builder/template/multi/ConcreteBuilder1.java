package com.cn.build.builder.template.multi;

public class ConcreteBuilder1 extends Builder
{

    private Product1 product = new Product1() ;

    public void buildPart1()
    {
        product.add("builder1 Product1 part1");
    }

    public void buildPart2()
    {
        product.add("builder1 Product1 part2");
    }

    public Product retrieveResult()
    {
		return product;
    }
}
