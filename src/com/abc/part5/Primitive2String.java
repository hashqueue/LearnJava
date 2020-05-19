package com.abc.part5;

/**
 * @author mi
 */
public class Primitive2String {
    public static void main(String[] args) {
        //把一个特定字符串转换成 int 变量
        String intStr = "2020";
        int aa = Integer.parseInt(intStr);
        int ab = Integer.valueOf(intStr);
        System.out.println("aa:" + aa);
        System.out.println("ab:" + ab);
        System.out.println("*********************************************************");
        //把一个特定字符串转换成 float 变量
        String floatStr = "21.56";
        float ac = Float.parseFloat(floatStr);
        float ad = Float.valueOf(floatStr);
        System.out.println("ac:" + ac);
        System.out.println("ad:" + ad);
        System.out.println("*********************************************************");
        //把一个 float 变量转换成 String 变量
        String ftStr = String.valueOf(78.9f);
        System.out.println("ftStr:" + ftStr);
        //把一个double 变量转换成 String 变量
        String dbStr = String.valueOf(78.999);
        System.out.println("dbStr:" + dbStr);
        //把一个boolean变量转换成String变量
        String boolStr1 = String.valueOf(false);
        String boolStr2 = String.valueOf(true);
        System.out.println("boolStr1:" + boolStr1);
        System.out.println("boolStr2:" + boolStr2);
        /**
         * 输出
         * aa:2020
         * ab:2020
         * *********************************************************
         * ac:21.56
         * ad:21.56
         * *********************************************************
         * ftStr:78.9
         * dbStr:78.999
         * boolStr1:false
         * boolStr2:true
         */


    }
}
