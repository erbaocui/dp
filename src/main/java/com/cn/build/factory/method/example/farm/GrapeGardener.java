package com.cn.build.factory.method.example.farm;
                                                         
public class GrapeGardener implements FruitGardener 
{
    public Fruit factory()
    {
        return new Apple();
    }
}
