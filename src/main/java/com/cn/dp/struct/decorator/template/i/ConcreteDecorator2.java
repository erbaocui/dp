package com.cn.dp.struct.decorator.template.i;

public class ConcreteDecorator2 extends Decorator


{
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {

        super.doSomething();
        this.doOtherthing();
    }
    private void doOtherthing(){
        System.out.println("ConcreteDecorator2 do otherthing");
    }
}
