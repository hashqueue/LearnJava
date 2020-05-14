package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/14 23:32
 * @Description:
 */
public class Person3 {
    //定义一个初始化块
    {
        int a = 6;
        if (a > 4) {
            System.out.println("Person3初始化块：局部变量a的值大于4");
        }
        System.out.println("Person3的初始化块。");
    }

    //定义第二个初始化块
    {
        System.out.println("Person3的第二个初始化块。");
    }

    //定义无参构造器
    public Person3() {
        System.out.println("Person3类的无参构造器。");
    }

    public static void main(String[] args) {
        new Person3();
    }
    /**
     * 输出：
     * Person3初始化块：局部变量a的值大于4
     * Person3的初始化块。
     * Person3的第二个初始化块。
     * Person3类的无参构造器。
     */
}
