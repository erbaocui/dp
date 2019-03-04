package com.cn.behavior.visitor.template;

import java.util.ArrayList;

public class ObjectStructure {

    private ArrayList<Element> list= new ArrayList<Element>();
    public  void attah(Element element){
        list.add(element);
    }

    public  void detach(Element element){
        list.remove(element);
    }

    public void accetp(Visitor visitor){
        for(Element element:list){
          element.accept(visitor);
        }
    }
}
