package com.cn.interview.innerclazz;

import java.util.Date;

public class AnonymousInnerClazzTest {

    public String get(Date date){
        return date.toLocaleString();

    }

    public static void main(String[] args) {
        AnonymousInnerClazzTest test=new AnonymousInnerClazzTest();
//        String str = test.get(new Date());
//        System.out.println(str);
        String str=test.get(new Date(){

        });
        System.out.println(str);

    }
}
