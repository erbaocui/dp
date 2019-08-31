package com.cn.interview.innerclazz;
class LocalInner{
    public void doSomething(){

       final int a=4;
        class Inner3{
            public void test(){
                System.out.println("hello world");
                System.out.println(a);
            }


        }

        Inner3 inner=new Inner3();
        inner.test();
    }
}
//外部无法使用

public class LocalInnerCalzz {
    public static void main(String[] args) {
        LocalInner outer=new LocalInner();
        outer.doSomething();

    }
}
