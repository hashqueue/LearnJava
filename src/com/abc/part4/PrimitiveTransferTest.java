package com.abc.part4;

/**
 * @Auther: ABC
 * @Date: 2020/5/3 12:27
 * @Description: 基本类型的值传递代码示例：验证值传递就是将`实际参数值的副本(复制品)`传入方法内，而参数本身不会受到任何影响。
 */
public class PrimitiveTransferTest {
    /*

     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a和b交换后的值为：" + "a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        /**
         * 当程序执行swap()方法时,系统进入swap()方法，并将main()法中的a,b变量作为参数值传入swap()方法,
         * 传入swap()方法的只是a,b的副本，而不是a,b本身。
         */
        int a = 3;
        int b = 4;
        swap(3, 4);
        System.out.println("交换结束后的a, b值为：" + "a = " + a + ", b = " + b);
    }
    /**
     * 输出：
     * a和b交换后的值为：a = 4, b = 3
     * 交换结束后的a, b值为：a = 3, b = 4
     */
}
