package com.abc.part4;

/**
 * 如果一个Java类的每个实例变量都被使用private修饰，并为每个实例变量都提供了public修饰setter和getter方法，那么这个类就是一个符合JavaBean规范的类
 * JavaBean总是一个封装良好的类。
 * @author mi
 */
public class Person2 {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("设置的名字长度过长或过短!");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("设置的age不能小于0岁或大于100岁!");
        }
    }

    public int getAge() {
        //return this.age;
        //this关键字可以省略
        return age;

    }
}
