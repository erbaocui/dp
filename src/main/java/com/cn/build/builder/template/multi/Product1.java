package com.cn.build.builder.template.multi;

import java.util.ArrayList;
import java.util.List;

public class Product1 implements Product
{
    private List<String> list=new ArrayList<String>();
    public Product1()
    {
        //Write your code here
    }

    public void add(String str) {
        list.add(str);

    }

    public void show() {
        for(String str:list){
            System.out.println(str);
        }
    }
}
