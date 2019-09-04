package com.cn.dp.behavior.template.template;

public abstract  class Parent {
    public  abstract void FirstStep();
    public abstract void  SecondStep();
    public abstract void ThirdStep();
    public abstract  void NStep();

    public  final void templateMethod(){
        this.FirstStep();
        this.SecondStep();
        this.ThirdStep();
        this.NStep();
    }


}
