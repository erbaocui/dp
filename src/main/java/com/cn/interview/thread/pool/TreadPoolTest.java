package com.cn.interview.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TreadPoolTest {
    public static void main(String[] args) {

         //固定的线程池
        ExecutorService threadPool= Executors.newFixedThreadPool(3);
        //缓存线程池 有Runnable就创建新的线程
        //ExecutorService threadPool= Executors.newCachedThreadPool();
        //单个线程 单个线程处理 线程死掉会自动重新键一个
        //ExecutorService threadPool= Executors.newSingleThreadExecutor();
        for(int i=1;i<=10;i++) {
            final int task=i;
            threadPool.execute(new Runnable() {
                public void run() {
                    for (int j = 1; j <= 10; j++) {
                        try {
                            Thread.sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "loop of " + task);
                    }

                }
            });
        }
        System.out.println("all the tasks have committed");
        //关闭所有线程
        //threadPool.shutdownNow();
        /*
        定时器
        Executors.newScheduledThreadPool(3).schedule(new Runnable() {
            public void run() {
                System.out.println();
            }
        },
                10,
                TimeUnit.SECONDS);
                */



    }
}
