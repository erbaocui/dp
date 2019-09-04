package com.cn.dp.build.prototype.template.manager;


public class Client

{
    private Prototype prototype;
    private PrototypeManager mgr;
    public void registerPrototype()
    {
        prototype=new ConcretePrototype();
        Prototype copytype=(Prototype)prototype.clone();
        mgr.add(copytype);
    }
}
