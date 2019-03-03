package com.cn.behavior.state.example;

import java.lang.reflect.GenericArrayType;
import java.sql.SQLOutput;

public class Car {
    public  static final String   UP="up";
    public  static final String   Down="down";

    private Gear gear;

    public Car() {
        this.gear = new PGear();
        System.out.println("新车产生，在停车档");
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public void shift(String flag){
        gear.shift(this,flag);
    }
}
