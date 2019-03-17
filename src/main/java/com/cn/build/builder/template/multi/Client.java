package com.cn.build.builder.template.multi;

public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        Builder builder1=new ConcreteBuilder1();
        Builder builder2=new ConcreteBuilder2();

        director.setBuilder(builder1);
        director.construct();
        Product product1=builder1.retrieveResult();
        product1.show();

        director.setBuilder(builder2);
        director.construct();
        Product product2=builder2.retrieveResult();
        product2.show();
    }
}
