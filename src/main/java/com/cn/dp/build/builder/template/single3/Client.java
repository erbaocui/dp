package com.cn.dp.build.builder.template.single3;

public class Client
{
	//省略director
    private static Builder builder;

	static public void main(String[] args)
	{ 
		builder = new Builder();
        builder.construct();

        Product product = builder.retrieveResult();

        //continue here
	}
}
