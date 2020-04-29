package com.abc.part_three;

public class Loop99MultiplicationTable {
    public static void main(String[] args) {
        /**
         * 循环打印99乘法表
         */
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
        }
    }
}
