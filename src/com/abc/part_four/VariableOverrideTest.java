package com.abc.part_four;

public class VariableOverrideTest {
    //创建两个成员变量
    private String name = "小花花";//实例变量
    private static int age = 21;//；类变量

    public void info(char gender) {
        String name = "大花花";
        System.out.println("我叫" + name + ", 性别是：" + gender);//我叫大花花, 性别是：女
        //使用this来调用实例变量
        System.out.println(this.name);//小花花

    }

    public static void main(String[] args) {
        //创建一个局部变量
        int age = 22;
        System.out.println("我的年龄是" + age);//我的年龄是22
        System.out.println("小花花的年龄是" + VariableOverrideTest.age);//小花花的年龄是21
        new VariableOverrideTest().info('女');
    }
}
