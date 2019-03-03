package com.cn.behavior.state.example;

public class NGear extends Gear {
    @Override
    public void shift(Car car,String flag) {
        //当前是空荡 要改变其他其他状态
        if(flag.equals("up")){
            car.setGear(new DGear());
            System.out.println("转行为D档");
        }
        if(flag.equals("down")) {
            car.setGear(new RGear());
            System.out.println("转行为R档");
        }


    }
}
