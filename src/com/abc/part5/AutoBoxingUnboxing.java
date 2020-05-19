package com.abc.part5;

/**
 * @author mi
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        //直接把一个int基本类型变量赋值给integer类型的变量
        Integer intVar1 = 5;
        //直接把一个int基本类型变量赋值给Object类型的变量
        Object intVar2 = 6;
        //直接把一个boolean基本类型变量赋值给Object类型的变量
        Object boolVar3 = true;
        int aa = intVar1;
        System.out.println("intVar2:" + intVar1);
        System.out.println("intVar2:" + intVar2);
        System.out.println("boolVar3:" + boolVar3);
        System.out.println("aa:" + boolVar3);
        if (boolVar3 instanceof Boolean) {
            boolean bb = (Boolean) boolVar3;
            System.out.println("bb:" + bb);
        }
        /**
         * 输出：
         * intVar2:5
         * intVar2:6
         * boolVar3:true
         * aa:true
         * bb:true
         */
    }
}
