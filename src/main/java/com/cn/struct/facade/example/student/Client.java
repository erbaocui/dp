package com.cn.struct.facade.example.student;

public class Client {
    public static void main(String[] args) {
        Facade facade =new Facade();
        Student student=new Student();
        student.setAge(19);
        student.setGender("f");
        System.out.println(facade.isValid(student));

    }
}
