package com.cn.behavior.strategy.template;

import java.util.ArrayList;
import java.util.List;

public class Context {

    private List<Integer> list=new ArrayList<Integer>();

    private  Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }



    public  void sort(){
        this.strategy.sort(list);
    }

    public void add(Integer i){
        list.add(i);
    }

    public void display(){
        for (Integer i :list) {
            System.out.println(i);
        }

    }
}
