package com.cn.dp.behavior.memento.example;

public class Memento {

    private  String name;
    private  String mobile;
    private  Double budget;

    public Memento(String name, String mobile, Double budget) {
        this.name = name;
        this.mobile = mobile;
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
