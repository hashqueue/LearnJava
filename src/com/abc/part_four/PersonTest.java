package com.abc.part_four;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("***************未对Person类的实例属性name，age进行赋值前***************");
        System.out.println(p.name);
        System.out.println(p.age);
        p.name = "小明";
        p.age = 21;
        System.out.println("***************对Person类的实例属性name，age进行赋值后***************");
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println("***************调用Person类的实例方法say***************");
        p.say("人生苦短,Let's Go!");
    }


}
