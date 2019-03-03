package com.cn.behavior.iterator.template;

public abstract class Aggregate {
    public abstract Iterator createIterator();
    public abstract Object get(int index);
    public abstract int getCount();
    public abstract void set(int index,Object value);


}
