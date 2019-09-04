package com.cn.dp.build.builder.template.single;

import java.util.ArrayList;
import java.util.List;

public class Product
{
    private List list=new ArrayList();
    public Product()
    {

    }
    public void  add(String str){
        list.add(str);
    }
    public void show(){
        for(Object str:list){
            System.out.println((String) str);
        }
    }
}
