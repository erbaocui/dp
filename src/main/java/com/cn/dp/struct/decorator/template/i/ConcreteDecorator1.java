package com.cn.dp.struct.decorator.template.i;

public class ConcreteDecorator1 extends Decorator


{
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {

        super.doSomething();
        this.doOtherthing();
    }
    private void doOtherthing(){
        System.out.println("ConcreteDecorator1 do otherthing");
    }
}
