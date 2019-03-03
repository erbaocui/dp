package com.cn.behavior.interpreter.template;

public class Not extends  Expression{
    private Expression expression;

    public Not(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Boolean interprepter(Context context) {
        return !expression.interprepter(context);
    }
}
