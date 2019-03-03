package com.cn.interview.sys;

public class Test_11 {
    //是否可以编译通过？
    //可以
    //显示为null
    // System.exit(0);当前线程正常退出，finally里的内容不输出
    public static void main(String[] args) {
        try {
            String s=null;
            System.exit(0);
        } catch (Exception e) {
            System.out.println("excepit");
           // e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
    }
}
