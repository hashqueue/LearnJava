package com.abc.part_four;

public class BlockTest {
    public static void main(String[] args) {
        {
            int a;//定义一个代码块局部变量a
            //System.out.println("代码块局部变量a的值为：" + a);//会报错，因为未对代码块局部变量a做初始化，
            a = 5;
            System.out.println("代码块局部变量a的值为：" + a);//初始化局部变量a后才可以正常进行编译和输出：代码块局部变量a的值为：5
        }
        //System.out.println(a);//会报错，代码块外是访问不到局部变量a的。
    }

}
