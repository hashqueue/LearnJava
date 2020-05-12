package com.abc.part4;

import javax.sound.midi.Soundbank;

/**
 * @Auther: ABC
 * @Date: 2020/5/12 23:59
 * @Description:
 */
public class SubClass1Test {
    public static void main(String[] args) {
        /*
        输出：
        SubClass1 a:5
        BaseClass1 a:10
        SubClass1 info:哈哈
        BaseClass1 info:哈哈
         */
        SubClass1.info("哈哈");
    }

}
