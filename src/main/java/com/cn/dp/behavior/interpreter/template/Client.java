package com.cn.dp.behavior.interpreter.template;

public class Client {
    public static void main(String[] args) {
        Context context =new Context();
        Variable x =new Variable("x");
        Variable y =new Variable("Y");
        Constant c=new Constant(true);
        context.assign(x,false);
        context.assign(y,true);
        Expression exp=new Or(new And(c,x),new And(y,new Not(x)));
        System.out.println(x.interprepter(context));
        System.out.println(y.interprepter(context));
        System.out.println(exp.interprepter(context));

    }
}
