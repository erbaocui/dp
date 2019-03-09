package com.cn.build.factory.facotryMethod.example.farm;
                                                         
public class AppleGardener implements FruitGardener 
{
    public Fruit factory()
    {
        return new Apple();
    }
}
