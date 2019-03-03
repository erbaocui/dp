package com.cn.struct.proxy.dynamic;

public class RealSubject implements Subject{

    public void request() {
        System.out.println("from real subject");

    }
}
