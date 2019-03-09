package com.cn.build.factory.abstractFactory.example.farm;

public interface Gardener
{
    public Fruit createFruit(String name);

    public Veggie createVeggie(String name);
}
