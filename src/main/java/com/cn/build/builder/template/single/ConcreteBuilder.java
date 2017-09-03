package com.cn.build.builder.template.single;

import com.cn.build.builder.template.single.Builder;
import com.cn.build.builder.template.single.Product;

public class ConcreteBuilder extends Builder
{
    /**
     * @label Creates
     */
    private Product product = new Product() ;

    public void buildPart1()
    {
        //build the first part of the product
    }

    public void buildPart2()
    {
        //build the second part of the product
    }

    public Product retrieveResult()
    {
		return product;
    }
}
