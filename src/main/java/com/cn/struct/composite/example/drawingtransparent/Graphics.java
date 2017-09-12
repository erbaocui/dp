package com.cn.struct.composite.example.drawingtransparent;

abstract public class Graphics
{
    public abstract void draw();

    public abstract void add(Graphics g);

    public abstract void remove(Graphics g);

    public abstract Graphics getChild(int i);
}

