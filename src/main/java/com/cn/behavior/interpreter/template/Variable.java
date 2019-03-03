package com.cn.behavior.interpreter.template;

public class Variable extends Expression {

    private  String name;


    @Override
    public Boolean interprepter(Context context) {
        return (Boolean) context.lookup(this);
    }

    public Variable(String name) {
        this.name = name;
    }
}
