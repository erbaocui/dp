package com.cn.behavior.visitor.template;

import com.cn.behavior.interpreter.template.Variable;

public abstract class Element {
    public abstract  void accept (Visitor visitor);
}
