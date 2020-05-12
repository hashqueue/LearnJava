package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/12 23:56
 * @Description:
 */
public class SubClass1 extends BaseClass1 {
    public static int a = 5;

    public static void info(String b) {
        System.out.println("SubClass1 a:" + a);
        System.out.println("BaseClass1 a:" + BaseClass1.a);
        System.out.println("SubClass1 info:" + b);
        BaseClass1.info(b);
    }

}
