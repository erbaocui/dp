package com.cn.build.factory.method.example.farm;
                                                         
public class StrawberryGardener implements FruitGardener 
{
    public Fruit factory()
    {
        return new Apple();
    }
}
