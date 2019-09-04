package com.cn.dp.behavior.state.example;

public class PGear extends Gear {
    @Override
    public void shift(Car car,String flag) {
        //当前停车档 要改变其他其他状态
        car.setGear(new RGear());
        System.out.println("转行为R档");

    }
}
