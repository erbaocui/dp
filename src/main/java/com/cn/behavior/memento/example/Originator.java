package com.cn.behavior.memento.example;

public class Originator {

    public  String name;
    public  String mobile;
    public  Double budget;
    //保存
    public  Memento saveMemento(){

        return new Memento(this.name,mobile,budget);
    }


    public  void restoreMemento(Memento memento){
        this.name= memento.getName();
         this.mobile=memento.getMobile();
         this.budget= memento.getBudget();


    }

    public  void show(){
        System.out.println( this.getName());
        System.out.println( this.getMobile());
        System.out.println( this.getBudget());

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

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
