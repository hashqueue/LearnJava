package com.abc.part4;

/**
 * @author mi
 */
public class Apple {
    private String name;
    private String color;
    private double weight;

    /**
     * 手动定义一个无参构造器
     */
    public Apple() {

    }

    /**
     * 两个形参的构造器
     *
     * @param name  名字
     * @param color 颜色
     */
    public Apple(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * 三个形参的构造器
     *
     * @param name   名字
     * @param color  颜色
     * @param weight 重量
     */
    public Apple(String name, String color, double weight) {
        //通过this关键字来调用另一个重载的构造器的初始化代码
        /**
         * 使用`this`调用另一个重载的构造器只能在构造器中使用，而且必须作为构造器执行体的第一条语句。
         * 使用`this`调用重载的构造器时，系统会根据`this`后括号里的实参来调用形参列表与之对应的构造器。
         */
        this(name, color);
        //下面this关键字引用该构造器正在初始化的Java对象。
        this.weight = weight;
    }

    public static void main(String[] args) {
        Apple apple = new Apple("青苹果", "青绿色", 0.3);
        //我有一个青苹果, 颜色是青绿色, 重量是0.3kg。
        System.out.println("我有一个" + apple.name + ", 颜色是" + apple.color + ", 重量是" + apple.weight + "kg。");
    }

}
