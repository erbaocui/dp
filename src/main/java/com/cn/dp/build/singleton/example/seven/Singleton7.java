package com.cn.dp.build.singleton.example.seven;

/**
 * 双重检查
 */
public class Singleton7 {
    private volatile static Singleton7 singleton;
    private Singleton7 (){}
    public static Singleton7 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton7.class) {
                if (singleton == null) {
                    singleton = new Singleton7();
                }
            }
        }
        return singleton;
    }
}
