package com.abc.part_two;

import java.io.PrintStream;

public class Coercion {
    /**
     * 强制类型转换
     * 强制类型转换换的语法格式是 (targetType )value ，强制类型转换的运算符是圆括号 (()) 。当进行强制类型转换时，
     * 类似于把一个大瓶子里的水倒入一个小瓶子，如果大瓶子里的水不多还好，但如果大瓶子里的水很多，
     * 小瓶子将会引起溢出 ，从而造成数据丢失 这种转换也被称为"缩小转换 (Narrow Conversion)"
     *
     * @param args
     */
    public static void main(String[] args) {
        int iValue = 233;
//      强制把一个 int 类型的值转换为 byte 类型 的值
        byte bValue = (byte) iValue;
//      将输出 -23
        System.out.println(bValue);//-23
        double dValue = 3.98;
//      强制把 double 类型的值转换为 int 类型的值
        int tol = (int) dValue;
//      将输出3
        System.out.println(tol);//3
        /**
         * 在上面程序中，把1个浮点数强制类型转换为整数时， Java 将直接截断浮点数的小数部分。
         * 除此之外，上面程序还把 233 强制类型转换为 byte 类型的整数，从而变成了-23,这就是典型的溢出
         */

        //生成一个6位的随机字符串
        //定义一个空字符串
        String result = "";
        //进行6次循环
        for (int i = 0; i < 6; i++) {
            int int_number = (int) (Math.random() * 26 + 97);
            result = result + (char) int_number;
        }
        System.out.println("本次随机生成的6位字符串为：" + result);
        //double强转float
        //39.642默认是一个 double 类型的浮点数
        float double_to_float = (float) 39.642;
        System.out.printf("double 强转为 float：%f", double_to_float);//double 强转为 float：39.641998
        System.out.println();
        //字符串转int
        String name1 = "中";
        String name2 = "1999";
        String name3 = "1999.5678";
//        int string_to_int1 = Integer.parseInt(name1);//会报错：Exception in thread "main" java.lang.NumberFormatException: For input string: "中"
        //只能将数字类型的字符串如："456", "1024"转换成基本数据类型
        int string_to_int2 = Integer.parseInt(name2);
//        System.out.println("string_to_int1：" + string_to_int1);
        System.out.println("string_to_int2：" + string_to_int2);

        //格式化输出
        String str = "sss";
        System.out.printf("字符串str格式化输出：%s", str);//字符串str格式化输出：sss


        //换行
        System.out.println();
        //表达式类型的自动提升
        short short_num1 = 9;
        //表达式右边中的short_num1将自动提升到 int 类型，则右边的表达式类型为int, 将一个 int 类型值直接赋给 short 类型变量将发生错误
//        short_num1 = short_num1 - 3;
        //这时候需要手动强转为short类型数据
        short_num1 = (short) (short_num1 - 3);
        System.out.printf("short类型数据：%s", short_num1);
        //换行
        System.out.println();
        //以下是正确的表达式类型的自动提升
        byte byte_num1 = 12;
        char char_num1 = '阿';
        short short_num2 = 1245;
        double double_num1 = 12.56;
        // 右边表达式中最高等级操作数为double_num1(double类型), 则右边表达式的类型为double类型,故赋给一个double类型变量
        double double_result = byte_num1 + char_num1 + short_num2 + double_num1;
        System.out.println(double_result);
        System.out.println((double) char_num1);//38463.0

        //必须指出,表达式的类型将严格保持和表达式中最高等级操作数相同的类型。下面代码中两个int类型整数进行除法运算，即使无法除尽，也将得到int类型结果
        int int_num1 = 29;
        //表达式右边两个操作数都是int类型，所以右边表达式的类型为int。
        //虽然29/3不能除尽，但依然会得到一个int类型整数
        int int_result = int_num1 / 3;
        System.out.printf("int_num1 / 3 = %s", int_result);//9
        //从上边的结算结果来看，当两个整数进行除法运算时，如果不能整除，得到的结果将是把小数部分截断后取整数部分。
        System.out.println();
        //如果表达式中包含了字符串，则又是另1番情形了 因为当把加号(+)放在字符串和基本类型值之间时 这个加号是1个字符串连接运算符 而不是进行加法运算 看如下代码：
        System.out.println("Java!" + '哈' + 3);//Java!哈3
        System.out.println((int) '哈');//21704
        System.out.println('哈' + 3 + "Java!");//21707Java!
        /**
         * 对于第1个表达式 "Java!" + '哈' + 3,先进行"Java!" + '哈'运算， '哈'转换成字符串,拼接成字符串 Java!哈, 接着进行 "Java!哈" + 3运算，这也是字符串连接运算，结果是 Java!哈3
         * 对于第2个表达式 先进行 '哈' + 3 加法运算，其中'哈'自动提升到int类型，变成'哈'对应的ASCII值：21704， 21704 + 3 = 21707， 然后进行 21707 + "Hello ! 运算 21707会自动转换成字符串，将变成两个字符串的连接运算 从而得到 21707Java!
         */


        /**
         * 直接量
         * 直接量是指在程序中通过源代码直接给出的值，int a=5这行代码中， 为变a所分配的初始值，就是1个直接量。
         * 直接量的类型
         * 并不是所有的数据类型都可以指定直接量，能指定直接量的通常只有3种类型 基本类型、字符串类型和null类型，具体而言，Java支持如下8种类型的直接量。
         * int 类型的直接量：在程序中直接给出的整型数值， 可分为二进制、十进制、八进制和十六进制4种，其中二进制需要 OB/Ob开头，八进制需要以0开头，十六进制需要Ox/OX开头。例如123、012(对应十进制的10)、Ox12 (对应十进制的18)等
         * long 类型的直接量：在整型数值后添加l或L后就变long类型的直接量。例如 3L、Ox12L(对应十进制的18L)
         * float 类型的直接量： 在一个浮点数后添加f/F就变成了 float 类型的直接量，这个浮点数可以是标准小数形式，也可以是科学计数法形式 例如 5.34F、3.14E5f
         * double 类型的直接量:直接给出1个标准小数形式或者科学计数法形式的浮点数就是 double类型的直接量。 例如 5.34、3.14E5
         * boolean 类型的直接量：这个类型的直接量只有 true/false
         * char 类型的直接量： char 类型的直接量有三种形式，分别是用单引号括起来的字符、转义字符和Unicode 值表示的字符。例如'a'、'\n'、'\u0061'。
         * String 类型的直接量：1个用双引号括起来的字符序列就是 String 类型的直接量。
         * null 类型的直接量：这个类型的直接量只有1个值，即 null。
         * 在上面的8种类型的直接量中， null 类型是1种特殊类型，它只有1个值：null，而且这个直接量可以赋给任何引用类型的变量，用以表示这个引用类型变量中保存的地址为空，即还未指向任何有效对象。
         */
        //直接量的赋值，通常总是把1个直接量赋值给对应类型的变量，例如下面代码都是合法的：
        int a = 5;
        char c = 'a';
        boolean b = true;
        float f = 5.12f;
        double d = 4.12;
        String author = "小花花";
        String book = "Go语言学习入门";

        /**
         *String 类型的直接量不能赋给其他类型的变量， null 类型的直接量可以直接赋给任何引用类型的变量，包括 String 类型。
         * boolean 类型的直接量只能赋给 boolean 类型的变 ，不能赋给其他任何类型的变量。
         * 关于字符串直接量有一点需要指出， 当程序第一次使用某个字符串直接量时， Java 会使用常量池(constant pool) 来缓存该字符串直接量 ，如果程序后面的部分需要用到该字符串直接量时 Java 会直接使用常量池 (constant pool) 中的字符串直接量。
         *由于 String 类是一个典型的不可变类，因此 String对象创建出来就不可能被改变，因此无须担心共享 String 对象会导致混乱。
         * 常量池( constant pool )指的是在编译期被确定，并被保存在己编译的 .class 文件中的一些数据，它包括关于类、方法、接口中的 常量， 也包括字符串直接量。
         */
        String s0 = "hello";
        String s1 = "hello";
        String s2 = "he" + "llo";
        System.out.println(s0 == s1);//true
        System.out.println(s0 == s2);//true
        /**
         * Java会确保每个字符串常量只有1个，不会产生多个副本，例子中的 sO和s1中的 "hello" 是字符串常量，它在编译期就被确定了，所 sO == s1返回true;
         * "he'和"ll0" 也都是字符串常量，当一个字符串由多个字符串常量连接而成时，它本身就是字符串常量， s2一样在编译期就被解析为1个字符串常量，所 s2也是常量池中 "hello" 的引用。因此，程序输出 sO == s1返回 true ，s1 == s2 返回 true。
         */
    }
}
