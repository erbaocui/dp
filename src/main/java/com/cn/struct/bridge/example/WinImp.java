package com.cn.struct.bridge.example;

public class WinImp implements ImageImp{
    public void doPaint(String str) {
        System.out.println(str+"win paint" );
    }
}
