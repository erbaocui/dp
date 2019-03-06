package com.cn.struct.facade.example.student;

public class Facade {
    public  Boolean isValid(Student student){

        SubSystem1 sub1=new SubSystem1();
        SubSystem2 sub2=new SubSystem2();
        return  (sub1.isAgeValid(student)&&sub2.isGenderValid(student));
    }
}
