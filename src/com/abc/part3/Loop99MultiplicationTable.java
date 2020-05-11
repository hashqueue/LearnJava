package com.abc.part3;

public class Loop99MultiplicationTable {
    public void loop99MultiplicationTable() {
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

    public static void main(String[] args) {
        new Loop99MultiplicationTable().loop99MultiplicationTable();
    }
}
