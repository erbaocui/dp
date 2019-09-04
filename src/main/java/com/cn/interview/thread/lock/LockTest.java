package com.cn.interview.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    public static void main(String[] args) {
        final Outputer  outputer= new LockTest().new Outputer();
        new Thread(new Runnable() {
            public void run() {
                while(true){
                    try {
                        Thread.sleep(10);
                        outputer.outputer("zhanghuaxin");
                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    } finally {
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                while(true){
                    try {
                        Thread.sleep(10);
                        outputer.outputer("cuijiapeng");
                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    } finally {
                    }
                }

            }
        }).start();
    }

//    private void init(){
//        final Outputer  outputer=new Outputer();
//
//
//
//    }

    class Outputer{
        Lock lock=new ReentrantLock();
        public void outputer(String name){
            lock.lock();
            try {
                int len=name.length();
                for(int i=0;i<len;i++){
                    System.out.print(name.charAt(i));
                }
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }

    }
}
