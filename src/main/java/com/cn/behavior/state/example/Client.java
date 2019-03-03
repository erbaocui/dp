package com.cn.behavior.state.example;

public class Client {
    public static void main(String[] args) {
        Car car=new Car();
        car.shift(Car.UP);
        car.shift(Car.UP);
        car.shift(Car.UP);
        car.shift(Car.Down);
        car.shift(Car.Down);
    }
}
