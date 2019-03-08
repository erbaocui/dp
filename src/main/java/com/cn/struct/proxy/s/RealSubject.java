package com.cn.struct.proxy.s;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("request realSubject");
    }
}
