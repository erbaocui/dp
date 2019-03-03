package com.cn.behavior.interpreter.template;

public class Or extends  Expression{

    private Expression left;
    private Expression right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Boolean interprepter(Context context) {
        return left.interprepter(context)||right.interprepter(context);
    }
}
