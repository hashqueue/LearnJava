package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/12 22:07
 * @Description:
 */
public class Ostrich extends Bird {
    public void fly() {
        System.out.println("我是一只鸵鸟，我不会飞，只能在地上跑!");
    }

    public void callOverrideMethod() {
        //在子类中通过super显示调用父类中被覆盖的实例方法。
        super.fly();
    }

    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        /*
        执行的不再是父类Bird类的fly()方法，而是执行Ostrich类的fly()方法。
        这种子类包含与父类同名方法的现象被称为方法重写(Override),也被称为方法覆盖。可以说子类重写了父类的方法，也可以说子类覆盖了父类的方法。
         */
        //输出：我是一只鸵鸟，我不会飞，只能在地上跑!
        ostrich.fly();
    }
}
