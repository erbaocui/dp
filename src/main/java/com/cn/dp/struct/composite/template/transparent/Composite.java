package com.cn.dp.struct.composite.template.transparent;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> list =new ArrayList<Component>();
    public void doSomething() {
        for(Component component:list){
            component.doSomething();
        }

    }

    public void add(Component component){
        list.add(component);
    }
    public void remove(Component component){
        list.remove( component);
    }
    public List<Component> getALL(){
        return list;
    }

}
