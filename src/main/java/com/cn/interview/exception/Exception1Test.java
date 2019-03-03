package com.cn.interview.exception;
//这个程序能否编译通过？
//将ArithmeticException改为IoException程序能否编译通过？


public class Exception1Test {
    public void doSomething() throws ArithmeticException
    {
        System.out.println("do something");
    }

    public static void main(String[] args) {
        Exception1Test test= new Exception1Test();
        test.doSomething();
    }
}
