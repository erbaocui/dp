package com.cn.behavior.interpreter.template;

public class Constant extends Expression{

    private Boolean  value;

    public Constant(Boolean value) {
        this.value = value;
    }

    public Boolean interprepter(Context context) {
        return value;
    }
}
