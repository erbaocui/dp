package com.cn.build.builder.template.multi;

import java.util.HashSet;
import java.util.Set;

public class Product2 implements Product {

    Set<String> set = new HashSet<String>();

    public Product2() {
        //Write your code here
    }

    public void add(String str) {
        set.add(str);

    }

    public void show() {
        for (String str : set) {
            System.out.println(str);

        }
    }
}