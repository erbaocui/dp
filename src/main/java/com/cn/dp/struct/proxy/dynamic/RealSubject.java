package com.cn.dp.struct.proxy.dynamic;

public class RealSubject implements Subject{

    public void request() {
        System.out.println("from real subject");

    }
}
