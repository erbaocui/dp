package com.cn.interview.clazz;

public class FinalTest {
    //这个类能不能编译通过 ？
    // 不能
    //final可以修饰 类 ，方法，属性
    //final修饰属性意思是一次赋值后不能改变
    //final修饰的属性赋值时机
        //1、定义的时候
        //2、在所有的构造方法都给final属性赋值


    private final int a;

    private String name;
    public FinalTest(){
        a=3;

    }

    public FinalTest(String name){
        a=5;
        this.name=name;

    }

    public static void main(String[] args) {
        FinalTest test_7=new FinalTest();
    }



}
