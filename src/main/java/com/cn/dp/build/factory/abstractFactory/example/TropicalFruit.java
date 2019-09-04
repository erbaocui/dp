package com.cn.dp.build.factory.abstractFactory.example;

public class TropicalFruit implements Fruit
{
    private String name;

    public TropicalFruit(String name)
    {
    }

    public String getName()
    {
		return name;
	}

    public void setName(String name)
    {
		this.name = name;
	}

}
