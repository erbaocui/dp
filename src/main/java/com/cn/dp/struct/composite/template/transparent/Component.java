package com.cn.dp.struct.composite.template.transparent;

import java.util.List;

public interface Component
{
    public void doSomething();

    public void add(Component component);
    public void remove(Component component);
    public List<Component> getALL();


}
