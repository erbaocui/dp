package com.cn.dp.build.singleton.template.reg;


/**
 * This class is a subclass of RegSingleton
 */

public class RegSingletonChild extends RegSingleton
{
    public RegSingletonChild() {}

    static public RegSingletonChild getInstance()
    {
        return (RegSingletonChild) RegSingleton.getInstance( "com.javapatterns.singleton.demos.RegSingletonChild" );
    }

    public String about()
    {
        return "Hello, I am RegSingletonChild.";
    }

}
