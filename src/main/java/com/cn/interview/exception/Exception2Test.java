package com.cn.interview.exception;

import java.io.IOException;
//这个程序能否编译通过？
//IOException 放上面是否能通过编译


public class Exception2Test {
    public  void doSomething() throws IOException
    {
        System.out.println("do something");
    }

    public static void main(String[] args) {


       try {
           Exception2Test test=new Exception2Test();
           test.doSomething();

       }//catch (Exception e){

      //
       catch (IOException ie){

       }


    }

}
