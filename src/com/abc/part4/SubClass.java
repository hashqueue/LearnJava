package com.abc.part4;

import sun.java2d.Surface;

/**
 * @Auther: ABC
 * @Date: 2020/5/12 22:50
 * @Description:
 */
public class SubClass extends BaseClass {
    public String name = "小花花";
    public int age = 18;

    public void accessOwner() {
        //输出：我叫小花花, 我的年龄是：18
        System.out.println("我叫" + name + ", 我的年龄是：" + age);
    }

    public void accessBase() {
        /*
        通过super调用父类BaseClass的实例属性：name和age
         */
        //输出：我姐姐叫大花花, 我姐姐的年龄是21
        System.out.println("我姐姐叫" + super.name + ", 我姐姐的年龄是" + super.age);
    }

    @Override
    public void info(String sportName) {
        System.out.println("我叫小花花, 我喜欢" + sportName);
    }

    public void testInfo(String sportName) {
        //通过super调用父类BaseClass的实例方法：info
        super.info(sportName);
        //调用子类SubClass的实例方法：info
        info(sportName);
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        //输出：我叫小花花, 我的年龄是：18
        subClass.accessOwner();
        //输出：我姐姐叫大花花, 我姐姐的年龄是21
        subClass.accessBase();
        /*
        输出：
        我叫大花花, 我喜欢踢足球
        我叫小花花, 我喜欢踢足球
         */
        subClass.testInfo("踢足球");
    }
}
