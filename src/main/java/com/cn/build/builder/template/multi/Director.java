package com.cn.build.builder.template.multi;

public class Director
{

    private Builder builder;

    public Director()
    {
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct()
    {


        builder.buildPart1();

        builder.buildPart2();



    }
}
