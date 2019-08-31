package com.cn.interview.thread.jdk15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ThreadScopeShareData {
    private static int data=0;

    private  static Map<Thread,Integer> threadMap=new HashMap<Thread, Integer>();

    public static void main(String[] args) {
        for(int i=0;i<2;i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Random ran = new Random();
                    data =ran.nextInt(100);
                    System.out.println(Thread.currentThread().getName() + " has put data " + data);
                    new A().get();
                    new B().get();

                }
            }).start();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class A{
        public int get(){
            System.out.println("A from"+Thread.currentThread().getName()+" has get data"+data);
            return data;
        }
    }
    static class B{
        public int get(){
            System.out.println("B from"+Thread.currentThread().getName()+" has get data"+data);
            return data;
        }
    }
}
