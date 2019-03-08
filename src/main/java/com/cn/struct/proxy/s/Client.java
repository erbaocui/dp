package com.cn.struct.proxy.s;

public class Client {
    public static void main(String[] args) {
        Subject  subject=new ProxySubject(new RealSubject());
        subject.request();
    }
}
