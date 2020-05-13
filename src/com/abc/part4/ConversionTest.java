package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/13 22:58
 * @Description:
 */
public class ConversionTest {
    public static void main(String[] args) {
        double a = 14.9;
        long b = (long) a;
        //输出：14 双精度浮点型强转至长整形会变为一个整数。
        System.out.println(b);

        int c = 4;
        // `数值类型`和`布尔类型`之间不能进行类型转换
        //boolean i = (boolean) c;//Inconvertible types; cannot cast 'int' to 'boolean'

        //object变量的编译时类型为Object,Object与String存在继承关系，可以强制类型转换
        //而且object变量的实际类型是String，所以运行时也可通过。
        Object object = "哈哈哈";
        String objStr = (String) object;

        // 定义一个objPri变量，编译时类型为Object，实际类型为Integer
        Object objPri = Integer.valueOf(5);
        // objPri变量的编译时类型为Object,objPri的运行时类型为Integer
        // Object与Integer存在继承关系
        // 可以强制类型转换，而objPri变量的实际类型是Integer
        // 所以下面代码运行时引发ClassCastException异常
        //String str = (String)objPri;//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

        //为了使程序更健壮，可以事先先用instanceof运算符来判断是否可以成功转换。
        //在进行强制类型转换之前，先用instanceof运算符判断是否可以成功转换，从而避免出现ClassCastException异常，这样可以保证程序更加健壮
        //下面程序将会输出:objPri不能被强制转换为String类型!
        if (objPri instanceof String) {
            String str = (String)objPri;
        }else {
            System.out.println("objPri不能被强制转换为String类型!");
        }
        /*
        当把子类对象赋给父类引用变量时，被称为向上转型(upcasting)，这种转型总是可以成功的，这也从另一个侧面证实了子类是一种特殊的父类。
        这种转型只是表明这个引用变量的编译时类型是父类，但实际执行它的方法时，依然表现出子类对象的行为方式。
        但把一个父类对象赋给子类引用交量时，就需要进行强制类型转换，而且还可能在运行时产`ClassCastException`异常，使用instanceof运算符可以让强制类型转换更安全。
         */
    }
}
