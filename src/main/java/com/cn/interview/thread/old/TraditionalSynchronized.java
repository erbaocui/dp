package com.cn.interview.thread.old;

public class TraditionalSynchronized {
    public static void main(String[] args) {
       final Outputer  outputer= new TraditionalSynchronized().new Outputer();
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
        public synchronized void outputer(String name){
            int len=name.length();
            for(int i=0;i<len;i++){
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }

    }


}
