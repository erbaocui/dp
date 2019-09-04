package com.cn.dp.struct.proxy.s;

public class ProxySubject implements Subject{

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject= realSubject;
    }

    public void request() {
        before();
        realSubject.request();
        after();

    }

    private  void before(){
        System.out.println("do before");

    }
    private void after(){
        System.out.println("do after");

    }
}
