package com.abc.part_four;

public class ScopeTest3 {
    public static void main(String[] args) {
        //定义一个代码块局部变量作为循环变量
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
