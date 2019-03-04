package com.cn.behavior.visitor.template;

public class ConcreteElementVisitor1 extends Visitor{
    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("Visitor1 访问 elementB");
    }

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("Visitor1 访问 elementA");
    }

}
