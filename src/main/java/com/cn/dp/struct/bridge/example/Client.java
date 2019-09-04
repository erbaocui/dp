package com.cn.dp.struct.bridge.example;

public class Client {


    public static void main(String[] args) {
        Image bmp=new BMPImage();
        ImageImp winImp=new WinImp();
        bmp.setImageImp(winImp);

        bmp.method("bmp");

        Image gif=new GIFImage();
        ImageImp osImp=new OsImp();
        gif.setImageImp(osImp);

        gif.method("gif");

    }
}
