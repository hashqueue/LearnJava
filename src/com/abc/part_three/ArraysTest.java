package com.abc.part_three;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        /**
         * Java8增强的工具类:Arrays
         *
         * Java提供的Arrays类里包含的一些static修饰的方法可以直接操作数组。方法如下
         *
         * 1.int binarySearch(type[] a, type key)
         * 使用二分法查询key元素值在a数组中出现的索引。
         * 如果a数组不包含key元素值，则返回负数。
         * 调用该方法时要求数组中元素己经按升序排列,这样才能得到正确结果。
         *
         * 2.int binarySearch(type[] a, int fromIndex, int toIndex, type key)
         * 这个方法与前一个方法类似，但它只搜索a数组中fromIndex到toIndex索引的元素。
         * 调用该方法时要求数组中元素己经按升序排列，这样才能得到正确结果。
         *
         * 3.type[] copyOf(type[] original, int length)
         * 这个方法将会把original数组复制成一个新数组，其中length是新数组的长度。
         * 如果length小于original数组的长度，则新数组就是原数组的前面length个元素。
         * 如果length大于original数组的长度，则新数组的前面元素就是原数组的所有元素，后面补充0(数值类型)、false(布尔类型)或者null(引用类型)
         *
         * 4.type[] copyOfRange(type[] original, int fromIndex, int toIndex)
         * 这个方法与前面方法相似，但这个方法只复制original数组的from索引到to索引的元素。
         *
         * 5.boolean equals(type[] a, type[] a2): 如果a数组和a2数组的长度相等，而且a数组和a2数组的数组元素也一一相同，该方法将返回true
         *
         * 6.void fill(type[] a, type val)
         * 该方法将会把a数组的所有元素都赋值为val
         *
         * 7.void fill(type[] a, int fromIndex, int toIndex, type val)
         * 该方法与前一个方法的作用相同，区别只是该方法仅仅将a数组的fromIndex到toIndex索引的数组元素赋值为val。
         *
         * 8.void sort(type[] a)
         * 该方法对a数组的数组元素进行排序。
         *
         * 9.void sort(type[] a, int fromIndex, int toIndex)
         * 该方法与前一个方法相似,区别是该方法仅仅对fromIndex到toIndex索引的元素进行排序。
         *
         * 10.String toString(type[] a)
         * 该方法将一个数组转换成一个字符串。该方法按顺序将多个数组元素连缀在一起，多个数组元素使用英文逗号`,`和空格隔开。
         */
        int[] a = new int[]{4, 5, 6, 7};
        int[] a1 = new int[]{4, 5, 6, 7};
        int[] c = {43, 5, 6, 567, 68, 456, 9609, 34, 2, 4};
        int[] d = {43, 5, 6, 567, 68, 456, 9609, 34, 2, 4};
        /**
         * 返回值为boolean类型
         * Arrays.equals(type[] a, type[] a2)
         */
        System.out.println("a数组和a1数组是否相等：" + Arrays.equals(a, a1));//a数组和a1数组是否相等：true
        /**
         * 都有返回值，返回一个新数组
         * Arrays.copyOf(type[] original, int length)
         * Arrays.copyOfRange(type[] original, int fromIndex, int toIndex)
         */
        System.out.println("******************************************************");
        int[] b = Arrays.copyOf(a, 7);//7大于数组a的长度,因为数组b是int类型数组,所以从数组b第5个元素开始往后都为0，补充3个0，此时数组b的长度为7
        //Arrays.toString(b)：该方法将数组转b换成一个字符串。
        System.out.println("数组b：" + Arrays.toString(b));//数组b：[4, 5, 6, 7, 0, 0, 0]
        int[] b1 = Arrays.copyOfRange(b, 1, 5);//左开右闭，包含数组b中的索引为1的元素，不包含数组b中的索引为5的元素
        System.out.println("数组b1：" + Arrays.toString(b1));//数组b1：[5, 6, 7, 0]
        /**
         * 没有返回值，直接在原数组上进行修改。
         * Arrays.fill(type[] a, type val)
         * Arrays.fill(type[] a, int fromIndex, int toIndex, type val)
         */
        System.out.println("******************************************************");
        Arrays.fill(a1, 6);
        System.out.println("数组a1：" + Arrays.toString(a1));//数组a1：[6, 6, 6, 6]
        Arrays.fill(a1, 's');//将char类型自动转换为int类型的115,然后把a1数组的所有元素都赋值为val
        System.out.println("(char) 115 = " + (char) 115);//int类型的115强制转换为char类型：(char) 115 = s
        System.out.println("数组a1：" + Arrays.toString(a1));//数组a1：[115, 115, 115, 115]
        Arrays.fill(a, 1, 3, 6);//左开右闭，包含数组b中的索引为1的元素，不包含数组b中的索引为3的元素
        /**
         * 没有返回值，直接在原数组上进行排序。
         * Arrays.sort(type[] a)
         * Arrays.sort(type[] a, int fromIndex, int toIndex)
         */
        System.out.println("******************************************************");
        System.out.println("数组a：" + Arrays.toString(a));//数组a：[4, 6, 6, 7]
        Arrays.sort(c);
        System.out.println("数组c从小到大排序后为：" + Arrays.toString(c));//数组c从小到大排序后为：[2, 4, 5, 6, 34, 43, 68, 456, 567, 9609]
        Arrays.sort(d, 4, 8);//实际上是对68, 456, 9609, 34这四个数字从小到大排序后再放回数组d中对应索引位置
        System.out.println("把数组d中索引4(包含索引4)-8(不包含索引8)的元素从小到大排序后为：" + Arrays.toString(d));//把数组d中索引4(包含索引4)-8(不包含索引8)的元素从小到大排序后为：[43, 5, 6, 567, 34, 68, 456, 9609, 2, 4]
        /**
         *
         * Arrays.binarySearch(type[] a, type key)
         * Arrays.binarySearch(type[] a, int fromIndex, int toIndex, type key)
         */
        System.out.println("******************************************************");
        System.out.println("数组c：" + Arrays.toString(c));//数组c：[2, 4, 5, 6, 34, 43, 68, 456, 567, 9609]
        //返回34在数组c中的索引
        int index34 = Arrays.binarySearch(c, 34);
        System.out.println("34在数组c中的索引位置为：" + index34);//34在数组c中的索引位置为：4
        //数组c不包含99999，返回负数。
        int indexElementNotFound = Arrays.binarySearch(c, 99999);
        System.out.println("99999在数组c中不存在，返回负数：" + indexElementNotFound);//99999在数组c中不存在，返回负数：-11
        //返回数组c中索引2(包含)——索引8(不包含)，也就是(5, 6, 34, 43, 68, 456)中的68在数组c中的索引
        int indexIndexInterval = Arrays.binarySearch(c, 2, 8, 68);
        System.out.println("数组c中索引2(包含)——索引8(不包含)，也就是(5, 6, 34, 43, 68, 456)中的68在数组c中的索引位置为：" + indexIndexInterval);//数组c中索引2(包含)——索引8(不包含)，也就是(5, 6, 34, 43, 68, 456)中的68在数组c中的索引位置为：6
        //567不在数组c中索引2(包含)——索引8(不包含)，也就是说567不在(5, 6, 34, 43, 68, 456)中，返回负数
        int indexElementNotFoundNotInIndexInterval = Arrays.binarySearch(c, 2, 8, 567);
        System.out.println("567不在数组c中索引2(包含)——索引8(不包含)，也就是说567不在(5, 6, 34, 43, 68, 456)中，返回负数：" + indexElementNotFoundNotInIndexInterval);//567不在数组c中索引2(包含)——索引8(不包含)，也就是说567不在(5, 6, 34, 43, 68, 456)中，返回负数：-9
    }
}
