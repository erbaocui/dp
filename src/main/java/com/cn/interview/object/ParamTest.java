package com.cn.interview.object;
//3
public class
ParamTest {
    public  void changeInt(int a){
         a=3;
         //return  a;

    }
    public  void changePoint(Point point){
        point.x=5;
        point.y=6;
        //return  a;

    }
    public  void changeString(String str){
        str="abc";

    }

    public static void main(String[] args) {
         int a =1;
         ParamTest pt =new ParamTest();
         pt.changeInt(a);
        System.out.println(a);
        Point point = new Point(1,2);
        pt.changePoint(point);
        System.out.println(point.x);
        System.out.println(point.y);

        String str="xyz";
        pt.changeString(str);
        System.out.println(str);




    }
}

class Point
{
     int x;
     int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
