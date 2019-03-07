package com.cn.struct.bridge.example;

public class OsImp implements ImageImp{
    public void doPaint(String str) {
        System.out.println(str+" os paint " );
    }
}
