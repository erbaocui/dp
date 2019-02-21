package com.cn.interview.reflect;

import com.cn.interview.reflect.PrivateTest;

import java.lang.reflect.Field;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        PrivateTest pt=new PrivateTest();
        Class<?> clazz=PrivateTest.class;
        Field field =clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(pt,"wocao");
        System.out.println(pt.getName());


    }
}
