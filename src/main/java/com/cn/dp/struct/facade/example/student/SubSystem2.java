package com.cn.dp.struct.facade.example.student;

public class SubSystem2 {

    public Boolean isGenderValid(Student student){
        if(student.getGender().equals("f")){
            return true;
        }else {
            return false;
        }

    }
}
