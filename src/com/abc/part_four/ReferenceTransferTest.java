package com.abc.part_four;

/**
 * @Auther: ABC
 * @Date: 2020/5/3 12:56
 * @Description: 引用类型的值传递代码示例：验证值传递就是将`实际参数值的副本(复制品)`传入方法内，而参数本身不会受到任何影响。
 */
public class ReferenceTransferTest {
    public static void swap(String a, String b) {
        String tmp = a;
        a = b;
        b = tmp;
        System.out.println("a和b交换后的值为：" + "a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        String a = "小花花";
        String b = "小亮亮";
        swap(a, b);
        System.out.println("交换结束后的a, b值为：" + "a = " + a + ", b = " + b);
        /**
         * 输出：
         * a和b交换后的值为：a = 小亮亮, b = 小花花
         * 交换结束后的a, b值为：a = 小花花, b = 小亮亮
         */

    }
}
