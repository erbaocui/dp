package com.cn.dp.behavior.visitor.example.computer;

public class VideoCard extends ComputerPart {

    @Override
    protected void link(HardwareInterface hardwareInterface) {

        // 必须先用接口连接上显卡
        hardwareInterface.visitor(this);

        System.out.println("连接上显卡之后，显卡开始工作，提供图像");
    }

}