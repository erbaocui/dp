package com.cn.interview.innerclazz;

class StaticInnerOuter{

    private static int a=4;

    public static class Inner1{
        public void test(){
            System.out.println(a);
        }

    }


}

public class  StaticInnerClastTest {


    public static void main(String[] args) {
        StaticInnerOuter.Inner1 inner =new StaticInnerOuter.Inner1();

        inner.test();
    }
}
