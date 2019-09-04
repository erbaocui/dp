package com.cn.dp.build.prototype.template.simple;

public class ConcretePrototype implements Prototype
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone()
    {
        try
        {
	        return super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            //write your code here
            return null;
        }
    }

    public ConcretePrototype(String name) {
        this.name = name;
    }
}
