package com.cn.struct.composite.template.transparent;


import java.util.List;

public class Leaf implements Component
{
    public void doSomething() {
        System.out.println("执行");

    }


    public void add(Component component){
        //1抛异常
        //2什么都不做

    }
    public void remove(Component component){

    }
    public List<Component> getALL(){
        return null;

    }



}
