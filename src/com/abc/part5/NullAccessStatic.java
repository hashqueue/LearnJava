package com.abc.part5;

/**
 * @author mi
 */
public class NullAccessStatic {
    public static void say() {
        System.out.println("static修饰的类方法~");
    }

    static String name;
    int age = 21;

    public String eat() {
        return "我正在吃饭";
    }

    public static void main(String[] args) {
//        NullAccessStatic nullAccessStatic = new NullAccessStatic();
        NullAccessStatic nullAccessStatic = null;
//        say();
        //以下代码虽然会正常输出。但是在IDEA中会报红，提示：不应该通过类实例访问静态成员，所以类成员必须使用类名来访问。
        nullAccessStatic.say();
        nullAccessStatic.name = "哈哈";
        System.out.println(nullAccessStatic.name);
        System.out.println("************************************************");
        NullAccessStatic.say();
        System.out.println(NullAccessStatic.name);
        System.out.println("************************************************");
        //一个null对象访问实例成员(包括实例变量和实例方法)，将会引发`java.lang.NullPointerException`空指针异常，因为null表明该实例根本不存在，既然实例不存在，那么它的实例变量和实例方法自然也不存在.
        //System.out.println(nullAccessStatic.age);
        //nullAccessStatic.eat();
        /**
         * 以上代码会输出
         * static修饰的类方法~
         * 哈哈
         * ************************************************
         * static修饰的类方法~
         * 哈哈
         * ************************************************
         */
    }
}
