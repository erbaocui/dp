package com.cn.interview.sys;

public class Test_10 {
    //是否可以编译通过？
    //可以
    public static void main(String[] args) {
        try {
            String s=null;
            return;
        } catch (Exception e) {
            System.out.println("excepit");
           // e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
    }
}
