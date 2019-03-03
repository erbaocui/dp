package com.cn.behavior.iterator.template;

import com.cn.behavior.observer.template.Observer;

public abstract  class  Iterator {
    public  abstract Object first();
    public  abstract Object next();
    public abstract  Boolean hasNext();
    public abstract Object currentItem();

}
