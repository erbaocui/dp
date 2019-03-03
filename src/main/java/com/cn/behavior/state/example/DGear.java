package com.cn.behavior.state.example;

public class DGear extends Gear {
    @Override
    public void shift(Car car,String flag) {

            //当前是前几档 要改变其他其他状态
            car.setGear(new NGear());
        System.out.println("转行为N档");

    }
}
