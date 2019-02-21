package com.cn.interview.object;

public class EqualsTest {
    public static void main(String[] args) {
        String str= new String("abc");
        String str2 = new String("abc");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));

        Object obj= new Object();
        Object obj2= new Object();
        System.out.println( obj==obj2);
        System.out.println(obj.equals(obj2));


        Person p1= new Person("zhangsan");
        Person p2= new Person("zhangsan");

        System.out.println( p1==p2);
        System.out.println(p1.equals(p2));


    }
}

class Person{
    String name;

    public Person(String name) {
        this.name=name;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Person) {
            Person anotherPerson= (Person)anObject;

            if (this.name.equals(anotherPerson.name)) {

                return true;
            }
        }
        return false;
    }
}
