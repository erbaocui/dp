package com.cn.dp.behavior.template.template;

public class Child1 extends Parent{

    private String first;

    private String  second;
    private String  third;
    private String  n;


    public void FirstStep() {
        first="Child1 first";
        System.out.println( first);

    }

    public void SecondStep() {
        second="Child1 second";
        System.out.println(  second);

    }

    public void ThirdStep() {
        third="Child1 third";
        System.out.println( third);

    }

    public void NStep() {
         n="Child1 n";
        System.out.println( n);

    }
}
