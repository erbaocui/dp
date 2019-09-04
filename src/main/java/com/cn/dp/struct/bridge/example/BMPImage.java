package com.cn.dp.struct.bridge.example;

public class BMPImage extends Image{
    @Override
    public void method(String str) {
        this.imageImp.doPaint(str);
    }
}
