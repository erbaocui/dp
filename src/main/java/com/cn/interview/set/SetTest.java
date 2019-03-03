package com.cn.interview.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//当重写equals方法是，必须要重写hashcode方法
//如果一个类的两个对象，使用equals方法比较是，结果为true
//那么该两哥对象必须具有相同的hashcode

public class SetTest {

    public static void main(String[] args) {
        Set<String> set =new HashSet<String>();
        System.out.println(set.add("abc"));
        System.out.println(set.add("xyz"));
        System.out.println(set.add("abc"));
        System.out.println(set.add(null));
        //for(Iterable<String> iter=set.iterator();((Iterator) iter).hasNext())

        Set<People> set2=new HashSet<People>();
        System.out.println(set2.add(new People("zhangsan")));
        System.out.println(set2.add(new People("lisi")));
        System.out.println(set2.add(new People("zhangsan")));

        Object obj =new Object();
        //System.out.println(Integer.toHexString(obj.hashCode()));

    }
}
class People
{
    String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof People) {
            People anotherPerson= (People)anObject;

            if (this.name.equals(anotherPerson.name)) {

                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
