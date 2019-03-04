package com.cn.behavior.visitor.example.computer;

public interface HardwareInterface {

    public void visitor(CPU cpu);
    public void visitor(VideoCard vCard);
    public void visitor(HardDisk hd);
}
