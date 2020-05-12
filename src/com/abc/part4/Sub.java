package com.abc.part4;

import javax.sound.midi.Soundbank;

/**
 * @Auther: ABC
 * @Date: 2020/5/13 00:17
 * @Description:
 */
public class Sub extends Base {
    public char gender;

    public Sub(String name, int age, char gender) {
        /**
         * 父类的构造方法不能继承，但我们可以用super来调用。
         * 如父类的构造方法为：public A(){};那么子类调用为super();
         * 如果为public A(int a);那么子类调用为super(1);
         */
        super(name, age);
        this.gender = gender;
    }

    public static void main(String[] args) {
        Sub sub = new Sub("小花花", 21, '女');
        //输出：我的名字叫小花花, 我今年21岁了, 我的性别是女。
        System.out.println("我的名字叫" + sub.name + ", 我今年" + sub.age + "岁了, 我的性别是" + sub.gender + "。");
    }
}