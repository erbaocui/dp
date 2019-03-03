package com.cn.interview.clazz;

public class Final3Test {
    //这个类能不能编译通过 ？
    // 不能
    //final可以修饰 类 ，方法，属性
    //final修饰属性意思是一次赋值后不能改变
    //final修饰的属性赋值时机
        //1、定义的时候
        //2、在所有的构造方法都给final属性赋值
        //3、final 和static一同使用的时候只能在赋值的在定义的时候赋值 （即使是static final int也没有初始值0）


    private static final int a=10;

    private String name;


    public static void main(String[] args) {
        //Test_8.a=10
    }



}
