package com.cn.dp.build.builder.template.single2;

abstract public class Director
{

    /**
     * @link aggregation
     * @directed
     * @clientCardinality 1
     * @supplierCardinality 1
     *
     * @clientRole builder
     *  省略Builder接口*/
    private ConcreteBuilder builder;

    public void construct()
    {
		builder.buildPart1();
		builder.buildPart2();

        Product product = builder.getResult();
    }
}
