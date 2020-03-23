package com.abc.part_two.数据类型和运算符.assets;

public class Operator {
    /**
     * 运算符
     */
    public static void main(String[] args) {
        /**
         * 算术运算符
         */
        //加法运算符 +
        int num1 = 10;
        int num2 = 14;
        int num_sum = num1 + num2;
        System.out.println(num_sum);//24
        //减法运算符 -
        int num_subtraction = num1 - num2;
        System.out.println(num_subtraction);//-4
        //乘法运算符 *
        int num_multiplication = num1 * num2;
        System.out.println(num_multiplication);//140
        //除法运算符 /
        //1.如果除法运算符的两个操作数都是整数类型(其中除数不可以为0),计算结果取商
        //2.如果除法运算符的两个操作数有一个是浮点数或者两个都是浮点数，则计算结果也是浮点数。此时允许除数为0或者0.0，得到的结果是正无穷大或负无穷大。
        double num3 = 18.54;
        double num4 = 58.54;
        int division_num1 = num2 / num1;
//        int division_num2 = num2 / 0;//除数不可以为0
        double division_num3 = num3 / num1;
        double division_num4 = num4 / num3;
        double division_num5 = num3 / 0;
        double division_num6 = num3 / 0.0;
//        System.out.println(num2 / num1);
        System.out.println(division_num1);//1
//        System.out.println(division_num2);
        System.out.println(division_num3);//1.8539999999999999
        System.out.println(division_num4);//3.157497303128371
        System.out.println(division_num5);//正无穷大  Infinity
        System.out.println(division_num6);//正无穷大  Infinity
        System.out.println(-num3 / 0);//负无穷大  -Infinity
        System.out.println(-num3 / 0.0);//负无穷大  -Infinity
        //取余运算符  %
//        求余运算符.求余运算的结果不1定总是整数,它的计算结果是使用第一个操作数除以第2操作数后得到1个整除的结果后剩下的值就是余数。
//        由于求余运算也 要进行除法运算，因此如果求余运算的两个操作数都是整数类型，则求余运算的第2个操作数不能是0，否则将引发除以零异常.
//        如果求余运算的两个操作数中有1个或者两个都是浮点数，则允许第2个操作数是0或0.0 ，只是求余运算的结果是非数: NaN
//        0或0.0 对零以外的任何数求余都将得到0或0.0
        System.out.println();
        System.out.println(num2 % num1);//4
        System.out.println(num3 % num2);//4.539999999999999
        System.out.println(num3 % 0);//非数 NaN
        System.out.println(num3 % 0.0);//非数 NaN
        System.out.println(-num3 / 0);//负无穷大  -Infinity
        System.out.println(-num3 / 0.0);//负无穷大  -Infinity
        System.out.println(0 / 5);//0
        System.out.println(0.0 / 5);//0.0
        //自加 ++ 将操作数的值加1
        //两个要点
        // 1.自加是单目运算符，只能操作一个操作数
        // 2.自加运算符只能操作单个数值型(整型、浮点型都行)的变量,不能操作常量或表达式.
        // 运算符既可以出现在操作数的左边，也可以出现在操作数的右边
        // 但出现在左边和右边的效果是不1样的,如果把++放在左边，则先把操作数加1，然后才把操作数放入表达式中运算
        // 如果把++放在右边，则先把操作数放入表达式中运算，然后才把操作数加1
        int a = 3;
//        int a_new1 = a++ + 3;//a先不自增1，直接加3.此时a_new1=3+3=6,然后a在自增1此时a=4
//        System.out.println(a + "\t" + a_new1);//4   6
        int a_new2 = ++a + 3;//a先自增1，直接加3.此时a_new1=4+3=6,然后a在自增1此时a=4
        System.out.println(a + "\t" + a_new2);//4   7
        //自减 -- 用法与++自增用法一致 将操作数的值减1
        int b = 5;
        int b_new1 = b-- - 1;
        System.out.println(b + "\t" + b_new1);//4   4
//        int b_new2 = --b - 1;
//        System.out.println(b + "\t" + b_new2);//4   3
        /**
         * 自加和自减只能用于操作变量，不能用于操作数值直接量、常量或表达式
         * Java 并没有提供其他更复杂的运算符，如果需要完成乘方、开方等运算，则可借助于 java.lang.Math类的工具方法完成复杂的数学运算
         * Math 类下包含了丰富的静态方法，用于完成各种复杂的数学运算。
         */


    }

}
