package com.cn.dp.build.factory.abstractFactory.example;

public interface Gardener
{
    public Fruit createFruit(String name);

    public Veggie createVeggie(String name);
}
