package com.cn.build.singleton.example.seven;

/**
 * 饿汉
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3 (){}
    public static Singleton3 getInstance() {
        return instance;
    }
}