package com.abc.part_four;

public class StaticAccessNonStatic {
    public void say1(){
        System.out.println("一个简单的非静态方法");
    }
    public static void say2(){
        System.out.println("一个简单的静态方法");
    }
    public static void main(String[] args){
        //执行程序编译时会报错：Error:(11, 9) java: 无法从静态上下文中引用非静态 方法 say1()。
        // 因为say1()是属于示例的方法不是属于类的方法。因此必须需要使用对象来调用该方法。
        //say1();
        /**
         * 在上面的main()方法中直接调用say1()方法时，系统相当于使用this作为该方法的调用者，
         * 而main()方法是static修饰的方法，static修饰的方法属于类，而不属于对象，因此调用static修饰的方法的主调总是类本身.
         */
        //如果确实需要在静态方法里调用非静态方法。可以创建类对象，使用类对象来调用非静态方法。
        new StaticAccessNonStatic().say1();//输出：一个简单的非静态方法
        //执行不会报错
        say2();//输出：一个简单的静态方法
    }
}
