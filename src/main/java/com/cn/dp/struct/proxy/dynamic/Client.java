package com.cn.dp.struct.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
        InvocationHandler handler = new DynamicSubject(realSubject);
        //下面的代码
        Class<?> classType=handler.getClass();

        Subject subject=(Subject) Proxy.newProxyInstance(classType.getClassLoader(),realSubject.getClass().getInterfaces(),handler);
        subject.request();
        System.out.println(subject.getClass());
    }
}
