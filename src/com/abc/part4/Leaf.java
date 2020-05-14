package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/15 00:21
 * @Description:
 */
public class Leaf extends Mid {
    static {
        System.out.println("Leaf类的静态初始化块");
    }

    {
        System.out.println("Leaf类的普通初始化块");
    }

    public Leaf() {
        //通过super调用父类中有一个字符串参数的构造器
        super("哈哈哈");
        System.out.println("执行Leaf类中的构造器");
    }
}
