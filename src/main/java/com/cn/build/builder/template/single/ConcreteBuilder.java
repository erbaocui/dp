package com.cn.build.builder.template.single;

import com.cn.build.builder.template.single.Builder;
import com.cn.build.builder.template.single.Product;

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
