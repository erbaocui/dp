package com.cn.dp.behavior.state.example;

public class RGear extends Gear {
    @Override
    public void shift(Car car,String flag) {
        //当前是倒车档 要改变其他其他状态
        if(flag.equals("up")){
            car.setGear(new NGear());
            System.out.println("转行为N档");
        }
        if(flag.equals("down")) {
            car.setGear(new PGear());
            System.out.println("转行为P档");
        }




    }
}
