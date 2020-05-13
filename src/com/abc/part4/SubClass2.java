package com.abc.part4;

/**
 * @author mi
 */
public class SubClass2 extends BaseClass2 {
    public int age = 25;

    @Override
    public void test() {
        System.out.println("子类中覆写父类test()的方法。");
    }

    public void info() {
        System.out.println("子类中的普通方法");
    }

    public static void main(String[] args) {
        BaseClass2 baseClass2 = new BaseClass2();
        //输出：baseClass2.age:21
        System.out.println("baseClass2.age:" + baseClass2.age);
        //输出：父类中的普通方法。
        baseClass2.base();
        //输出：父类中的被覆盖的方法。
        baseClass2.test();

        SubClass2 subClass2 = new SubClass2();
        //输出：subClass2.age:25
        System.out.println("subClass2.age:" + subClass2.age);
        //输出：子类中覆写父类test()的方法。
        subClass2.test();
        //输出：子类中的普通方法
        subClass2.info();
        /*
        SubClass2是BaseClass2的子类，属于继承关系，所以可以调用父类中的方法。
         */
        //输出：父类中的普通方法。
        subClass2.base();

        BaseClass2 bs = new SubClass2();
        //输出：子类中覆写父类test()的方法。
        bs.test();
        //输出：父类中的普通方法。
        bs.base();
        //输出：bs.age:21
        System.out.println("bs.age:" + bs.age);
        //bs.info();

        //SubClass2 sc = (SubClass2) new BaseClass2();

    }
}
