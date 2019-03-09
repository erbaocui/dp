package com.cn.build.factory.facotryMethod.example.farm;
                                                         
public class StrawberryGardener implements FruitGardener 
{
    public Fruit factory()
    {
        return new Apple();
    }
}
