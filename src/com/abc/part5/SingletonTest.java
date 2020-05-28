package com.abc.part5;

public class SingletonTest {
    public static void main(String[] args) {
        /**
         * 创建Singleton类的对象不能通过构造器
         * 只能通过getInstance方法来创建类实例
         */
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        /**
         * 输出
         * s1:com.abc.part5.Singleton@60e53b93
         * s2:com.abc.part5.Singleton@60e53b93
         * true
         * true
         */
    }
}
