package com.cn.struct.facade.example.student;

public class SubSystem1 {

    public Boolean isAgeValid(Student student){
        if(student.getAge()>18){
            return true;
        }else {
            return false;
        }

    }
}
