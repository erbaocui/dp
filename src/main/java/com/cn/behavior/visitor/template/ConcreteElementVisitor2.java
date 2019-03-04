package com.cn.behavior.visitor.template;

public class ConcreteElementVisitor2 extends Visitor{
    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("Visitor2 访问 elementB");
    }

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("Visitor2 访问 elementA");
    }

}
