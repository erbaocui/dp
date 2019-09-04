package com.cn.dp.behavior.template.template;

public class ChildN extends Parent{

    private String first;

    private String  second;
    private String  third;
    private String  n;


    public void FirstStep() {
        first="ChildN first";
        System.out.println( first);

    }

    public void SecondStep() {
        second="ChildN second";
        System.out.println(  second);

    }

    public void ThirdStep() {
        third="ChildN third";
        System.out.println( third);

    }

    public void NStep() {
         n="ChildN n";
        System.out.println( n);

    }
}
