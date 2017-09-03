package com.cn.build.builder.template.single;

public class Client
{
    /**
     * @link aggregation
     * @directed 
     */
    private Director director;

	private Builder builder = new ConcreteBuilder();
		
    public void requestBuild()
    {
		director = new Director(builder);
    }
}
