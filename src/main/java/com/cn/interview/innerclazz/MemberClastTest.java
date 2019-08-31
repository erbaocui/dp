package com.cn.interview.innerclazz;

class MemberInnerOuter{
    private int a=4;
    public class Inner2{
        private int a=5;
        public void test(){
            int a=6;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(MemberInnerOuter.this.a);
        }

    }

    public void method(){
        Inner2 inner2= this.new Inner2();



    }



}

public class MemberClastTest {


    public static void main(String[] args) {
        MemberInnerOuter outer=new MemberInnerOuter();
        MemberInnerOuter.Inner2 inner =outer.new Inner2();
        inner.test();
    }
}
