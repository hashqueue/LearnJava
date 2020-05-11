package com.abc.part4;

/**
 * 构造器初始化demo
 *
 * @author mi
 */
public class ConstructorInitialization {
    private String name;
    private int age;
    private char gender;

    /**
     * 创建一个自定义的构造器
     *
     * @param name   名字
     * @param age    年龄
     * @param gender 性别
     */
    public ConstructorInitialization(String name, int age, char gender) {
        //this代表它进行初始化的对象，分别将构造器形参中的name，age，gender传给ConstructorInitialization类中的实例变量：name，age，gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        //使用自定义的构造器来创建对象，初始化类实例对象时需要传入三个参数name，age，gender分别对应构造器中的name，age，gender。
        ConstructorInitialization ci = new ConstructorInitialization("小花花", 21, '女');
        // 初始化ConstructorInitialization类的实例对象时为ConstructorInitialization类的实例变量显式指定默认值：name="小花花",age=21,gender='女'
        // 我的名字叫小花花, 我今年21岁了, 我的性别是女。
        System.out.println("我的名字叫" + ci.name + ", 我今年" + ci.age + "岁了, 我的性别是" + ci.gender + "。");
    }
}
