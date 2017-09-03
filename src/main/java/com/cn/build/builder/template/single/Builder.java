package com.cn.build.builder.template.single;

import com.cn.build.builder.template.single.Product;

abstract public class Builder
{
    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract Product retrieveResult();
}
