package com.cn.interview.staticfinal;

public class staticTest3 {
    public static void main(String[] args) {
        M m=new N();
        N n=new N();
        M.output();
        N.output();

    }
}
class M{
    public static void output() {
        System.out.println("M");
    }
}

class N extends M{
    public static void output() {
        System.out.println("N");
    }
}

