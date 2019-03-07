package com.cn.struct.bridge.example;

public abstract class Image {
   protected   ImageImp imageImp;
    public  abstract void method(String str);

    public ImageImp getImageImp() {
        return imageImp;
    }

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }
}
