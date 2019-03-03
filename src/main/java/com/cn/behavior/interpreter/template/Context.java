package com.cn.behavior.interpreter.template;

import java.util.Hashtable;

public class Context {

    private Hashtable table =new Hashtable();
    public  void assign(Variable var,Boolean value){
        table.put(var,value);

    }
    public Boolean lookup(Variable var){
        return  (Boolean) table.get(var);
    }
}
