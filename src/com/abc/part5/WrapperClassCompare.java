package com.abc.part5;

/**
 * @author mi
 */
public class WrapperClassCompare {
    public static void main(String[] args) {
        //一个包装类实例与数值进行比较
        Integer aa = Integer.valueOf("6");
        Integer ab = Integer.valueOf("6");
        //false
        System.out.println(aa > 7);
        //两个包装类实例进行比较
        //true
        System.out.println(Integer.valueOf("5").equals(Integer.valueOf("5")));
        //true
        System.out.println(aa.equals(ab));
        System.out.println("******************************");
        System.out.println(Integer.compare(10, 11));
        System.out.println(Integer.compare(10, 10));
        System.out.println(Integer.compare(11, 10));
        System.out.println("******************************");
        System.out.println(Float.compare(10.12f, 11.34f));
        System.out.println(Float.compare(10.12f, 10.12f));
        System.out.println(Float.compare(11.34f, 10.12f));
        System.out.println("******************************");
        System.out.println(Double.compare(10.79, 11.54));
        System.out.println(Double.compare(10.79, 10.79));
        System.out.println(Double.compare(11.54, 10.79));
        System.out.println("******************************");
        System.out.println(Character.compare('中', '国'));
        System.out.println(Character.compare('中', '中'));
        System.out.println(Character.compare('国', '中'));
        System.out.println("..............................");
        System.out.println(Character.compare('华', '夏'));
        System.out.println(Character.compare('华', '华'));
        System.out.println(Character.compare('夏', '华'));
        System.out.println("******************************");
        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.compare(true, true));
        System.out.println(Boolean.compare(false, true));
        /**
         * 输出：
         * false
         * true
         * true
         * ******************************
         * -1
         * 0
         * 1
         * ******************************
         * -1
         * 0
         * 1
         * ******************************
         * -1
         * 0
         * 1
         * ******************************
         * -2256
         * 0
         * 2256
         * ******************************
         * 1
         * 0
         * -1
         */

    }
}
