package com.abc.part5;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("小花花");
        //com.abc.part5.Person@60e53b93
        System.out.println(p);
        /**
         * 所有的 Java 对象都可以和字符串进行连接运算，当 Java 对象和字符串进行连接运算时，
         * 系统自动调用 Java 对象 toString()方法的返回值和字符串进行连接运算。
         */
        //com.abc.part5.Person@60e53b93
        System.out.println(p + "");
        //com.abc.part5.Person@60e53b93
        System.out.println(p.toString() + "");
    }
}
