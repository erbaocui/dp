package com.cn.interview.object;
//1
public class StringTest {

    public static void main(String[] args) {
        //字符串常量池
        String s= new String("abc");
        String s1="abc";
        String s2= new String("abc");
        System.out.println(s==s1); //false
        System.out.println(s==s2); //false
        System.out.println(s1==s2);//false

        System.out.println(s == s.intern()); //false
        System.out.println(s1 == s.intern());//true
        System.out.println(s.intern()== s2.intern());//true


        String hello = "hello";
        String hel = "hel";
        String lo = "lo";
        //两个常量拼接 新的字符串也进入常量池
        System.out.println(hello == "hel"+"lo");//true
        //常量+变量  回在堆里创建一个新的字符串对象
        System.out.println(hello == "hel"+lo);//false

    }
}
