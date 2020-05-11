package com.abc.part4;

public class MethodLocalVariableTest {
    public static void main(String[] args) {
        int b;//定义一个方法局部变量b
        //System.out.println("方法局部变量的值为：" + b);//会报错，因为方法局部变量还为进行初始化。
        b = 7;//为方法局部变量进行赋值，也就是进行初始化。
        System.out.println("方法局部变量的值为：" + b);//方法局部变量的值为：7


    }
}
