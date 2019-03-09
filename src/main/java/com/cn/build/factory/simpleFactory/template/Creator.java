package com.cn.build.factory.simpleFactory.template;

public class Creator
{
    public static Product factory()
    {
        return new ConcreteProduct();
    }

    /** @link dependency 
     * @label Creates*/
    /*# ConcreteProduct lnkConcreteProduct; */
}
