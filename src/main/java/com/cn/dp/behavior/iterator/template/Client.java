package com.cn.dp.behavior.iterator.template;

public class Client {
    public static void main(String[] args) {

        Aggregate aggregate=new ConcreteAggregate();

        aggregate.set(0,"item A");
        aggregate.set(1,"item B");
        aggregate.set(2,"item C");

        Iterator iterator =aggregate.createIterator();
        Object first =iterator.first();
        System.out.println("first item"+first);
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }



    }
}
