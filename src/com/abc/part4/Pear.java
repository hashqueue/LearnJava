package com.abc.part4;

/**
 * 子类：梨类，父类是水果类
 *
 * @author mi
 */
public class Pear extends Fruit {
    public static void main(String[] args) {
        Pear pear = new Pear();
        pear.weight = 0.3;
        //我是一个水果, 重0.3kg。
        pear.info();
    }
}