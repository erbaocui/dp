package com.cn.build.builder.template.single;

public class Client
{

    private Director director;

	private Builder builder = new ConcreteBuilder();
		
    public void requestBuild()
    {
		director = new Director(builder);

    }

    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director= new Director( builder);
        director.construct();
       // Product product=Product.;


    }
}
