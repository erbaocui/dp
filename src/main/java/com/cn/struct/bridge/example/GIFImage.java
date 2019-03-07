package com.cn.struct.bridge.example;

public class GIFImage extends Image{
    @Override
    public void method(String str) {
        this.imageImp.doPaint(str);
    }
}
