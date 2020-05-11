package com.abc.part4;

public class OverLoad {
    /*
    方法重载,同一个类中，方法名相同，形参列表不同。
     */
    public void test(String name, int age) {
        System.out.println("我的名字是:" + name + ", 我的年龄是:" + age);
    }

    public void test(String name, char gender) {
        System.out.println("我的名字是:" + name + ", 我的性别是:" + gender);
    }

    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();
        overLoad.test("小花花", 21);
        overLoad.test("小花花", '女');
        /**
         * 输出：
         * 我的名字是:小花花, 我的年龄是:21
         * 我的名字是:小花花, 我的性别是:女
         */
    }
}
