package com.abc.part_two;

import java.util.PrimitiveIterator;

public class Operator {
    /**
     * 运算符
     */
    public static void main(String[] args) {
        /**
         * 算术运算符
         */
        //加法运算符 +
//        int num1 = 10;
//        int num2 = 14;
//        int num_sum = num1 + num2;
//        System.out.println(num_sum);//24
        //减法运算符 -
//        int num_subtraction = num1 - num2;
//        System.out.println(num_subtraction);//-4
        //乘法运算符 *
//        int num_multiplication = num1 * num2;
//        System.out.println(num_multiplication);//140
        //除法运算符 /
        //1.如果除法运算符的两个操作数都是整数类型(其中除数不可以为0),计算结果取商
        //2.如果除法运算符的两个操作数有一个是浮点数或者两个都是浮点数，则计算结果也是浮点数。此时允许除数为0或者0.0，得到的结果是正无穷大或负无穷大。
//        double num3 = 18.54;
//        double num4 = 58.54;
//        int division_num1 = num2 / num1;
//        int division_num2 = num2 / 0;//除数不可以为0
//        double division_num3 = num3 / num1;
//        double division_num4 = num4 / num3;
//        double division_num5 = num3 / 0;
//        double division_num6 = num3 / 0.0;
//        System.out.println(num2 / num1);
//        System.out.println(division_num1);//1
//        System.out.println(division_num2);
//        System.out.println(division_num3);//1.8539999999999999
//        System.out.println(division_num4);//3.157497303128371
//        System.out.println(division_num5);//正无穷大  Infinity
//        System.out.println(division_num6);//正无穷大  Infinity
//        System.out.println(-num3 / 0);//负无穷大  -Infinity
//        System.out.println(-num3 / 0.0);//负无穷大  -Infinity
        //取余运算符  %
//        求余运算符.求余运算的结果不1定总是整数,它的计算结果是使用第一个操作数除以第2操作数后得到1个整除的结果后剩下的值就是余数。
//        由于求余运算也 要进行除法运算，因此如果求余运算的两个操作数都是整数类型，则求余运算的第2个操作数不能是0，否则将引发除以零异常.
//        如果求余运算的两个操作数中有1个或者两个都是浮点数，则允许第2个操作数是0或0.0 ，只是求余运算的结果是非数: NaN
//        0或0.0 对零以外的任何数求余都将得到0或0.0
//        System.out.println();
//        System.out.println(num2 % num1);//4
//        System.out.println(num3 % num2);//4.539999999999999
//        System.out.println(num3 % 0);//非数 NaN
//        System.out.println(num3 % 0.0);//非数 NaN
//        System.out.println(-num3 / 0);//负无穷大  -Infinity
//        System.out.println(-num3 / 0.0);//负无穷大  -Infinity
//        System.out.println(0 / 5);//0
//        System.out.println(0.0 / 5);//0.0
        //自加 ++ 将操作数的值加1
        //两个要点
        // 1.自加是单目运算符，只能操作一个操作数
        // 2.自加运算符只能操作单个数值型(整型、浮点型都行)的变量,不能操作常量或表达式.
        // 运算符既可以出现在操作数的左边，也可以出现在操作数的右边
        // 但出现在左边和右边的效果是不1样的,如果把++放在左边，则先把操作数加1，然后才把操作数放入表达式中运算
        // 如果把++放在右边，则先把操作数放入表达式中运算，然后才把操作数加1
//        int a = 3;
//        int a_new1 = a++ + 3;//a先不自增1，直接加3.此时a_new1=3+3=6,然后a在自增1此时a=4
//        System.out.println(a + "\t" + a_new1);//4   6
//        int a_new2 = ++a + 3;//a先自增1，直接加3.此时a_new1=4+3=6,然后a在自增1此时a=4
//        System.out.println(a + "\t" + a_new2);//4   7
        //自减 -- 用法与++自增用法一致 将操作数的值减1
//        int b = 5;
//        int b_new1 = b-- - 1;
//        System.out.println(b + "\t" + b_new1);//4   4
//        int b_new2 = --b - 1;
//        System.out.println(b + "\t" + b_new2);//4   3
        /**
         * 自加和自减只能用于操作变量，不能用于操作数值直接量、常量或表达式
         * Java 并没有提供其他更复杂的运算符，如果需要完成乘方、开方等运算，则可借助于 java.lang.Math类的工具方法完成复杂的数学运算
         * Math 类下包含了丰富的静态方法，用于完成各种复杂的数学运算。
         */

        /**
         * 赋值运算符
         */
//        赋值运算符用于为变量指定变量值，与C类似， Java也使用=作为赋值运算符。通常，使用赋值运算符将一个直接量值赋给变量。
        //为变量赋值
//        String str1 = "Java";
//        String str2 = "Python";
//        int age = 21;
////        将一个变量的值赋值给另一个变量
//        String myFavoriteProgramLanguage = str1;
//        System.out.printf("我最喜欢的编程语言之一是%s\n其次是%s\n我今年%d岁了," +
//                "我相信自己可以学会这两门编程语言~", myFavoriteProgramLanguage, str2, age);
        /*
        赋值运算符是从右向左执行计算的，程序先计算得到=右边的值
        然后将该值"装入"=左边的变量，因此赋值运算符(=)左边只能是变量。
         */
        /**
         * 赋值表达式是有值的，赋值表达式的值就是右边被赋的值
         * 例如 String str2 = str表达式的值就是str
         * 因此，赋值运算符支持连续赋值，通过使用多个赋值运算符，可以一次为多个变量赋值
         */
//        System.out.println();
//        int a;
//        int b;
//        int c;
//        //连续为多个变量进行赋值
//        a = b = c = 666;
//        System.out.printf("a:%d\nb:%d\nc:%d", a, b, c);

        /**
         * 位运算符
         * Java支持的位运算符有如下7个
         * & 按位与。当两位同时为1时才返回1
         * | 按位或。只要有 位为1即可返回1
         * ~ 按位非。单目运算符，将操作数的每个位(包括符号位) 全部取反
         * ^ :按位异或 当两位相同时返回0 不同时返回1
         * <<: 左移运算符
         * >>: 右移运算符
         * >>> 无符号右移运算符
         * 一般来说，位运算符只能操作整数类型的变量或值
         */
        /**
         * 扩展后的赋值运算符
         *赋值运算符可与算术运算符、位移运算符结合，扩展成功能更加强大的运算符,扩展后的赋值运算符如下
         * +=;对于 x+=y ，即对应于 x=x+y
         * -=;对于x-=y ，即对应于 x=x-y
         * *=;对于x*=y，即对应于 x=x*y
         * /=;对于x/=y ，即对应于x=x/y
         * %=;对于x%=y ，即对应于 x=x%y
         * &=;对x&=y ，即对应于 x=x&y
         * |=;对于x|=y ，即对应于 x=x|y
         * ^=;对于x^=y ，即对应于 x=x^y
         * <<=;对于x<<=y ，即对应于x=x<<y
         * >>= ;对于x>>=y ，即对应于x=x>>y
         * >>>= 对于x>>>=y，即对应于x=x>>>y
         */
        // += 示例
//        byte a = 6;
//        a = (byte) (a + 4);//需要强转，否则会报错
//        byte b = 6;
//        b += 4;
//        System.out.printf("a:%d\nb:%d", a, b);
        /*
        程序输出
        a:10
        b:10
         */

        /**
         * 比较运算符
         *比较运算符用于判断两个变量或常量的大小，比较运算的结果是一个布尔值(true false)。Java支持的比较运算符如下
         * >: 大于，只支持左右两边操作数是数值类型。如果前面变量的值大于后面变量的值，则返回 true
         * >=: 大于等于,只支持左右两边操作数是数值类型。如果前面变量的值大于等于后面变量的值，则返回 true
         * <: 小于，只支持左右两边操作数是数值类型。如果前面变量的值小于后面变量的值，则返回 true
         * <=: 小于等于，只支持左右两边操作数是数值类型。如果前面变量的值小于等于后面变量的值，返回 true
         * ==: 等于，如果进行比较的两个操作数都是数值类型，即使它们的数据类型不相同，只要它们的值相等，也都将返回true
         *    例如 97 == 'a'返回true. 5.0 == 也返回 true
         *    如果两个操作数都是引用类型，那么只有当两个引用变量的类型具有父子关系时才可以比较，而且这两个引用必须指向同一个对象才会返回true
         *    Java也支持两个boolean类型的值进行行比较，例如，true == false， 将返回 false
         * !=:不等于，如果进行比较的两个操作数都是数值类型，无论它们的数据类型是否相同，只要它们的值不相等，也都将返回true
         *    如果两个操作数都是引用类型，只有当两个引用变量的类型具有父子关系时才可以比较，只要两个引用指向的不是同一个对象就会返回true。
         */
//        int a = 5;
//        int b = 6;
//        int c = 6;
//        System.out.printf("a < b? %b\nb == c? %b\na != c? %b\n", a < b, b == c, a != c);//a < b? true  b == c? true a != c? tru
//        String name1 = "小明";
//        String name2 = "小明";
//        System.out.printf("name1 != name2? %b\nname1 == name2? %b\n", name1 != name2, name1 == name2);//a < b? true  b == c? true
//        System.out.printf("true != false? %b\ntrue == false? %b\n", true != false, true == false);//true != false? true  true == false? false
//        //创建两个Coercion类的对象，分别赋值给t1和t2两个变量引用
//        Coercion t1 =new Coercion();
//        Coercion t2 = new Coercion();
//        // tl和t2 是同一个类的两个实例的引用，所以可以比较
//        //但t1和t2 引用不同的对象，所以返回 false
//        System.out.println("t1 是否等于 t2: " + (t1 == t2)) ;//t1 是否等于 t2: false
//        //直接将 t1 的值赋给t3， 即让t3 指向 t1 指向的对象
//        Coercion t3 = t1 ;
//        //t1和t3 指向同一个对象，所以返回 true
//        System.out.println("t1 是否等于 3 : " + ( t1 == t3)) ;//t1 是否等于 3 : true

        /**
         *逻辑运算符
         * 逻辑运算符用于操作两个布尔型的变量或常量 逻辑运算符主要有如下6个
         * &&: 与，前后两个操作数必须都是true才返回 true，否则返回 false
         * &:不短路与，作用与&&相同，但不会短路
         * &与&&的区别:&总会计算前后两个操作数，而&&先计算左边的操作数，如果左边的操作数为false，则直接返回false，根本不会计算右边的操作数
         * ||: 或，只要两个操作数中有一个是true，就可以返回 true ，否则返回 false
         * |: 不短路或，作用与||相同，但不会短路
         * |与||的区别:|总会计算前后两个操作数，而||先计算左边的操作数，如果左边的操作数为true，则直接返回true，根本不会计算右边的操作数
         * !: 非，只需要一个操作数，如果操作数为true ，则返回 false 如果操作数为 false ，则返回 rue
         * ^: 异或，当两个操作数不同时才返回 true，如果两个操作数相同则返回 false。
         * 下面代码示范了或、与、非、异或4个逻辑运算符的执行示意
         */
//        String name1 = "潇潇";
//        String name2 = "大大";
//        System.out.println("&&  &");
//        System.out.println(!((name1 == name2) && (name1 != name2)));//true
//        System.out.println(!(name1 == name2) && (name1 != name2));//true
//        System.out.println((name1 == name2) && !(name1 != name2));//false
//        System.out.println(!((name1 == name2) & (name1 != name2)));//true
//        System.out.println(!(name1 == name2) & (name1 != name2));//true
//        System.out.println((name1 == name2) & !(name1 != name2));//false
//        System.out.println("||  |");
//        System.out.println(!((name1 == name2) || (name1 != name2)));//false
//        System.out.println(!(name1 == name2) || (name1 != name2));//true
//        System.out.println((name1 == name2) || !(name1 != name2));//false
//        System.out.println(!((name1 == name2) | (name1 != name2)));//false
//        System.out.println(!(name1 == name2) | (name1 != name2));//true
//        System.out.println((name1 == name2) | !(name1 != name2));//false
        /**
         * 三目运算符
         * 三目运算符只有一个 ? ， 三目运算符的语法格式如下:
         * (expression) ? if-true-statement : if-false-statement;
         * 三目运算符的规则是:先对逻辑表达式 expression 求值，如果逻辑表达式返回 true ，则返回二操作数的值，
         * 如果逻辑表达式返回 false ，则返回第一个操作数的值
         * 大部分时候，三目运算符都是作为 if else 的精简写法
         * 三目运算符和 if else 写法的区别在于: if 后的代码块可以有多个语句,三目运算符是不支持多个语句的。
         * 三目运算符可以嵌套，嵌套后的三目运算符可以处理更复杂的情况
         */
//        String str = 5 > 1 ? "5大于1" : "5小于1";
//        System.out.println(str); //5大于1
////        嵌套的三目运算符
//        boolean result = 6 < 2 ? true : (6 > 3 ? false : true);
//        System.out.println(result);//false

        /**
         * 运算符的结合性和优先级
         * 所有的数学运算都认为是从左向右运算的， Java 语言中大部分运算符也是从左向右结合的，
         * 只有单目运算符、赋值运算符和三目运算符例外，其中，单目运算符、赋值运算符和三目运算符是从右向左结合的 ，也就是从右向左运算
         * 乘法和加法是两个可结合的运算，也就是说，这两个运算符左右两边的操作数可以互换位置而不会影响结果。
         * 运算符有不同的优先级，所谓优先级就是在表达式运算中的运算顺序。下表列出了包括分隔符在内的所有运算符的优先级顺序，
         * 上一行中的运算符总是优先于下一行的。
         *
         * 运算符说明                  Java 运算符
         *   分隔符                    . [] () {} , ;
         * 单目运算符                   ++ -- ~ !
         * 强制类型转换运算                (type)
         * 乘法/除法/求余                 * / %
         * 加法/减法                       + -
         * 移位运算符                    << >> >>>
         * 关系运算符                 < <= >= > instanceof
         * 等价运算符                    == !=
         * 按位与                          &
         * 按位异或                         ^
         * 按位或                          |
         * 条件与                          &&
         * 条件或                          ||
         * 三目运算                         ? :
         * 赋值                   = += -= *= /= &= |= ^= %= <<= >>= >>>=
         */

    }

}
