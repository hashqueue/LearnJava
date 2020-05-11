package com.abc.part4;

/**
 * @author mi
 */
public class ConstructorOverload {
    private String name;
    private int age;

    /**
     * 手动定义一个无参构造器
     */
    public ConstructorOverload() {

    }

    /**
     * 定义一个有参构造器
     *
     * @param name 名字
     * @param age  年龄
     */
    public ConstructorOverload(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorOverload co = new ConstructorOverload();
        //我叫null, 我的年龄是0。
        System.out.println("我叫" + co.name + ", 我的年龄是" + co.age + "。");
        ConstructorOverload co1 = new ConstructorOverload("小花花", 21);
        //我叫小花花, 我的年龄是21。
        System.out.println("我叫" + co1.name + ", 我的年龄是" + co1.age + "。");
        /**
         * 上面的`ConstructorOverload`类提供了两个重载的构造器,两个构造器的名字相同，但形参列表不同。
         * 系统通过`new`调用构造器时，系统将根据传入的实参列表来决定调用哪个构造器。
         */
    }
}
