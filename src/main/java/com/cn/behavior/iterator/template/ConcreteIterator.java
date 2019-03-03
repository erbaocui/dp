package com.cn.behavior.iterator.template;

public class ConcreteIterator  extends Iterator{

    private  Aggregate aggregate;

    private int current=0;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate=aggregate;
        this.current=aggregate.getCount();
    }

    @Override
    public Object first() {
        return aggregate.get(0);


    }

    @Override
    public Object next() {
       return aggregate.get(current++);
    }

    @Override
    public Boolean hasNext() {
        return  (aggregate.getCount()-1)==current;

    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }


}
