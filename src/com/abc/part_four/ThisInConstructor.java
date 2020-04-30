package com.abc.part_four;

public class ThisInConstructor {
    public String name;

    //定义一个构造器
    public ThisInConstructor() {
        //在构造器里定义一个name变量
        String name;
        //使用this代表该构造器正在初始化的对象
        //下面的代码将会把该构造器正在初始化的对象的name成员变量设置成`小花花`
        this.name = "小花花";
    }

    public static void main(String[] args) {
        System.out.println(new ThisInConstructor().name);//小花花
    }
}
