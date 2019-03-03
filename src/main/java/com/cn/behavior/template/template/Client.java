package com.cn.behavior.template.template;

public class Client {
    public static void main(String[] args) {
        Parent ch1=new Child1();
        ch1.templateMethod();
        Parent chN=new ChildN();
        chN.templateMethod();

    }
}
