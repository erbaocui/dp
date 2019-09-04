package com.cn.dp.behavior.iterator.template;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate{

    private ArrayList list=new ArrayList();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return list.size();
    }

    public Object get(int index) {
        return list.get(index);
    }
    public void set(int index,Object value) {
        list.add(index,value);
    }



}
