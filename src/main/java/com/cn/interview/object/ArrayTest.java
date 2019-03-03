package com.cn.interview.object;

import com.sun.tools.javac.code.Attribute;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        char[] ch1=new char[2];
        ch1[0]='a';
        ch1[1]='b';
        char[] ch2=new char[2];
        ch2[0]='a';
        ch2[1]='b';
        System.out.println(ch1.equals(ch2));
        String s1=new String(ch1);
        String s2=new String(ch2);
        System.out.println(s1.equals(s1));
        boolean result= Arrays.equals(ch1,ch2);
        System.out.println(result);
    }
}
