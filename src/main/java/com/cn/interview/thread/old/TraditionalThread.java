package com.cn.interview.thread.old;

public class TraditionalThread {
    public static void main(String[] args) {
          new Thread(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("1:"+Thread.currentThread().getName());
                    System.out.println("2:"+this.getName());
                }
            }.start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("2:"+"");

            }
        }){

        }.start();
    }



}
