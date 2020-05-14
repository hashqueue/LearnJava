package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/15 00:16
 * @Description:
 */
public class Root {
    static {
        System.out.println("Root类的静态初始化块");
    }

    {
        System.out.println("Root类的普通初始化块");
    }

    public Root() {
        System.out.println("Root类的无参构造器");
    }
}
