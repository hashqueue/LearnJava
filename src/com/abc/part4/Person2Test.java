package com.abc.part4;

import com.abc.part3.Loop99MultiplicationTable;
//import com.abc.part_three.*;
//PI是java.lang.Math类的静态成员变量(类变量使用static修饰)，表示π常量。
import static java.lang.Math.PI;

import static java.lang.Math.sqrt;
import static java.lang.System.*;


/**
 * @author mi
 */
public class Person2Test {

    public static void main(String[] args) {
        /**
         * out是java.lang.System类的静态成员变量，代表标准输出。
         * PI是java.lang.Math类的静态成员变量，代表π常量
         */
        //输出：3.141592653589793
        out.println(PI);
        //直接调用Math类的sqrt静态方法
        //输出：16.0
        out.println(sqrt(256));
        Person2 person2 = new Person2();
        person2.setName("小花花");
        person2.setAge(21);
        //我叫小花花, 今年21岁了!
        System.out.println("我叫" + person2.getName() + ", 今年" + person2.getAge() + "岁了!");
        Loop99MultiplicationTable loop99MultiplicationTable = new Loop99MultiplicationTable();
        loop99MultiplicationTable.loop99MultiplicationTable();
    }

}
