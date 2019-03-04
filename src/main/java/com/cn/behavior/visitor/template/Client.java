package com.cn.behavior.visitor.template;

public class Client {
    public static void main(String[] args) {
        ObjectStructure o =new ObjectStructure();
        o.attah(new ConcreteElementA());
        o.attah(new ConcreteElementB());
        ConcreteElementVisitor1 v1=new ConcreteElementVisitor1();
        ConcreteElementVisitor2 v2=new ConcreteElementVisitor2();
        o.accetp(v1);
        o.accetp(v2);
    }
}
