package com.abc.part4;

import java.util.Arrays;

/**
 * @Auther: ABC
 * @Date: 2020/5/3 21:48
 * @Description:
 */
public class Varargs {
    public static void test(int a, String... books) {
        System.out.println("一共" + a + "本书, " + Arrays.toString(books));
        System.out.println("分别是以下这些书：");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void test1(int a, String[] books) {
        System.out.println("一共" + a + "本书, " + Arrays.toString(books));
        System.out.println("分别是以下这些书：");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        test(3, "疯狂Java讲义", "疯狂Python讲义", "Java核心技术卷");
        /**
         * 输出：
         * 一共3本书, [疯狂Java讲义, 疯狂Python讲义, Java核心技术卷]
         * 分别是以下这些书：
         * 疯狂Java讲义
         * 疯狂Python讲义
         * Java核心技术卷
         */
        test1(3, new String[]{"数据结构与算法", "AI测试", "第一行代码"});
        /**
         * 输出
         * 一共3本书, [数据结构与算法, AI测试, 第一行代码]
         * 分别是以下这些书：
         * 数据结构与算法
         * AI测试
         * 第一行代码
         */
        //对比test()和test1()，test()方法语法更简洁。

    }
}
