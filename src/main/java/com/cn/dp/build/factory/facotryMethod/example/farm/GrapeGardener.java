package com.cn.dp.build.factory.facotryMethod.example.farm;
                                                         
public class GrapeGardener implements FruitGardener 
{
    public Fruit factory()
    {
        return new Apple();
    }
}
