package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/15 00:17
 * @Description:
 */
public class Mid extends Root {
    static {
        System.out.println("Mid类的静态初始化块");
    }

    {
        System.out.println("Mid类的普通初始化块");
    }

    public Mid() {
        System.out.println("Mid类的无参构造器");
    }

    public Mid(String msg) {
        //通过this调用本类中重载的构造器
        this();
        System.out.println("Mid类的带参构造器，参数值为" + msg);
    }
}
