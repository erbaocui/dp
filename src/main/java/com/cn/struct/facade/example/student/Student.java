package com.cn.struct.facade.example.student;

import com.cn.behavior.mediator.example.IChatroom;

public class Student {
    private Integer age;
    private String gender;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
