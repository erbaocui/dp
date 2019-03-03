package com.cn.interview.clazz;

//为什么对于一个public类型的终态的成员变量，一般都要声明为static的
//为了节省内存  本身是常量常量 赋值后不可改变 一个类一份就可以 没必要每个对象
//static 在方法区中 只有一份copy

public class ConstantTest {

    public static final String  A="abc";
}
