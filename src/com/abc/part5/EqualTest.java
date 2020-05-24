package com.abc.part5;

/**
 * @Auther: ABC
 * @Date: 2020/5/24 15:36
 * @Description:
 */
public class EqualTest {

    public static void main(String[] args) {
        int aa = 65;
        float ab = 65.0f;
        //aa是否与ab相等？true
        System.out.println("aa是否与ab相等？" + (aa == ab));
        char ac = 'A';
        //aa是否与ac相等？true
        System.out.println("aa是否与ac相等？" + (aa == ac));
        String s1 = new String("hello");
        String s2 = new String("hello");
        //s1是否与s2相等？false
        System.out.println("s1是否与s2相等？" + (s1 == s2));
        //s1是否equals s2？true
        System.out.println("s1是否equals s2？" + (s1.equals(s2)));
        //由于java.laηg.String与EqualTest类没有继承关系，所以下面语句导致编译错误
        //System.out.println("hello" = new EqualTest());

    }
}
