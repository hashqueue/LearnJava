package com.abc.part4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: ABC
 * @Date: 2020/5/3 22:29
 * @Description:
 */
public class Recursive {
    /**
     * 计算一个整数的阶乘,如果用字母n来代表一个整数，阶乘代表着所有`小于或等于n`且大于0的整数的乘积。
     * 阶乘通常简写成 n!
     * 例如: 5! = 1 * 2 * 3 * 4 * 5 = 120
     *
     * @param n
     * @return 计算结果
     */
    public static int fn(int n) {
        if (n == 1) {
            return 1;
        } else {
            //方法中调用它自身,就是方法递归
            return n * fn(n - 1);
        }
    }

    /**
     * 递归函数实现斐波那契数列
     * 斐波那契数列：[1,1,2,3,5,8,13,21,34....],第一个数是1，后面的数等于前面两个数相加的结果
     * 打印1-50内的斐波拉切数列
     *
     * @param m
     * @return 计算结果
     */
    public static int fn1(int m) {
        if (m == 1 || m == 2) {
            return 1;
        } else {
            return fn1(m - 1) + fn1(m - 2);
        }
    }


    public static void main(String[] args) {
        int result = fn(5);
        System.out.println("5! = " + result);//5! = 120

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要打印斐波拉契数列中的数字个数：");
        int numCount = scanner.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 1; i <= numCount; i++){
            list.add(fn1(i));
        }
        System.out.print("斐波拉契数列中前" + numCount + "个数字为：" + list);
        /**
         * 输出：
         * 5! = 120
         * 请输入需要打印斐波拉契数列中的数字个数：
         * 10
         * 斐波拉契数列中前10个数字为：[1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
         */
    }
}
