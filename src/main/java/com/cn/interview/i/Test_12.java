package com.cn.interview.i;
//是否可以通过编译?
//可以
//考察对数组的理解，i是指针，new I[2] 只是初始化工作，
// 初始化一个包含两个指向I类型的指针的地址空间,并没有实例化接口
// i->[p0]->null
//    [p1]->null
interface I{}

public class Test_12 {
    public static void main(String[] args) {
       I[] i=new I[2];

    }
}
