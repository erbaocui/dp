package com.cn.behavior.visitor.example.computer;

public class USBInterface  implements HardwareInterface{




    public void visitor(CPU cpu) {
        System.out.println("usb连接cpu");
    }


    public void visitor(VideoCard vCard) {
        System.out.println("用usb连接显卡");
    }

    public void visitor(HardDisk hd) {
        System.out.println("用usb连接硬盘");
    }

}
