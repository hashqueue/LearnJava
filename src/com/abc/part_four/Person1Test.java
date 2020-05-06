package com.abc.part_four;

public class Person1Test {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Person1 person2 = new Person1();
        System.out.println("1)我的名字是：" + person1.name + ", 我有" + Person1.eyeNum + "只眼睛。");
        //通过Person1类访问类变量
        Person1.eyeNum = 1;
        System.out.println("2)我的名字是：" + person1.name + ", 我有" + Person1.eyeNum + "只眼睛。");
        //通过Person1类示例访问类变量
        person1.eyeNum = 2;
        System.out.println("3)我的名字是：" + person1.name + ", 我有" + Person1.eyeNum + "只眼睛。");
        //通过Person1类示例person1访问实例变量
        person1.name = "小花花";
        System.out.println("4)我的名字是：" + person1.name + ", 我有" + Person1.eyeNum + "只眼睛。");
        ////通过Person1类示例person2访问类变量eyeNum，访问到的是修改后的eyeNum
        System.out.println("5)我的名字是：" + person2.name + ", 我有" + Person1.eyeNum + "只眼睛。");
        /**
         * 程序输出：
         * 1)我的名字是：null, 我有0只眼睛。
         * 2)我的名字是：null, 我有1只眼睛。
         * 3)我的名字是：null, 我有2只眼睛。
         * 4)我的名字是：小花花, 我有2只眼睛。
         * 5)我的名字是：null, 我有2只眼睛。
         */
    }
}
