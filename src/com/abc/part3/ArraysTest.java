package com.abc.part3;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        /**
         * Java8增强的工具类:Arrays
         * Arrays类处于`java.util`包下，为了在程序中使用`Arrays`类，必须在程序中导入`java.util.Arrays`类
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
         *
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
        /**
         * Java 8增强了Arrays类的功能，为Arrays类增加了一些工具方法，这些工具方法可以充分利用多CPU并行的能力来提高设值、排序的性能。
         * 下面是Java 8为Arrays类增加的工具方法
         *
         * 1.void parallelPrefix(xxx[] array, XxxBinaryOperator op)
         * 该方法使用op参数指定的计算公式计算得到的结果作为新的元素。
         * op计算公式包括left和right两个形参，其中left代表数组中前一个索引处的元素，right代表数组中当前索引处的元素，当计算第一个新数组元素时，left的值默认为1。
         *
         * 2.void parallelPrefix(xxx[] array， int fromIndex, int toIndex, XxxBinaryOperator op)
         * 该方法与上一个方法相似，区别是该方法仅重新计算fromIndex到toIndex索引的元素。
         *
         * 3.void setAll(xxx[] array, IntToXxxFunction generator)
         * 该方法使用指定的生成器(generator)为所有数组元素设置值,该生成器控制数组元素的值的生成算法。
         *
         * 4.void parallelSetAll(xxx[] array, IntToXxxFunction generator)
         * 该方法的功能与上一个方法相同，只是该方法增加了并行能力，可以利用多CPU并行来提高性能。
         *
         * 5.void parallelSort(xxx[] a)
         * 该方法的功能与Arrays类以前就有的sort()方法相似，只是该方法增加了并行能力，可以利用多CPU并行来提高性能。
         *
         * 6.void parallelSort(xxx[] a, int fromIndex,  int toIndex)
         * 该方法与上一个方法相似，区别是该方法仅对fromIndex到toIndex索引的元素进行排序。
         *
         * 7.Spliterator.OfXxx spliterator(xxx[] array)
         * 将该数组的所有元素转换成对应的Spliterator对象。
         *
         * 8.Spliterator.OfXxx spliterator(xxx[] array, int startInclusive, int endExclusive)
         * 该方法与上一个方法相似，区别是该方法仅转换startInclusive到endExclusive索引的元素。
         *
         * 9.XxxStream stream(xxx[] array)
         * 该方法将数组转换为Stream，Stream是Java 8新增的流式编程的API
         *
         * 10.XxxStream stream(xxx[] array, int startInclusive, int endExclusive)
         * 该方法与上一个方法相似，区别是该方法仅将startInclusive到endExclusive索引的元素转换为Stream。
         *
         * 上面方法列表中，所有以parallel开头的方法都表示该方法可利用CPU并行的能力来提高性能。
         * 上面方法中的xxx代表不同的数据类型，比如处理int[]型数组时应将xxx换成int，处理long[]型数组时应xxx换成long。
         */
        int[] arr = {3, -4, 25, 16, 30, 18};
        Arrays.parallelSort(arr);//调用了parallelSort()方法对数组arr执行排序，该方法的功能与传统sort()方法大致相似，只是在多CPU机器上会有更好的性能。
        System.out.println("对数组arr进行并发排序：" + Arrays.toString(arr));//对数组arr进行并发排序：[-4, 3, 16, 18, 25, 30]

        int[] arr2 = new int[10];
        int[] arr5 = {2, 1, 3, 12, -2, 7};
        Arrays.fill(arr2, 1);
        System.out.println("arr2进行运算前:" + Arrays.toString(arr2));//arr2进行运算前:[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
        System.out.println("arr5进行运算前:" + Arrays.toString(arr5));//arr5进行运算前:[2, 1, 3, 12, -2, 7]
        //parallelPrefix方法用用户提供的二进制操作符对给定数组中的每个元素进行累积计算。
        Arrays.parallelPrefix(arr2, (x, y) -> x + y);
        Arrays.parallelPrefix(arr5, (m, n) -> m + n);
        System.out.println("arr2进行运算后:" + Arrays.toString(arr2));//arr2进行运算后:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("arr5进行运算后:" + Arrays.toString(arr5));//arr5进行运算后:[2, 3, 6, 18, 16, 23]
        /**
         * 解析执行了`Arrays.parallelPrefix(arr5, (m, n) -> m + n);`语句后，数组arr5的变化过程：
         * 1.首先，从数组arr5的索引为1的元素开始进行运算，索引为1=1，此时1(索引为1)加上当前索引元素的前一个索引的元素也就是2，计算结果为3。
         * 然后再将计算结果3赋值给数组arr5索引为1的元素，这个过程中数组arr5的值已经被修改了，由[2, 1, 3, 12, -2, 7]——>[2, 3, 3, 12, -2, 7]。
         * 2.然后在从数组arr5索引为2的元素开始往下执行，此时3(索引为2)加上当前索引元素的前一个索引的元素也就是3(被修改后的arr5数组中[2, 3, 3, 12, -2, 7]索引为1的元素)，计算结果为6。
         * 然后再将计算结果6赋值给被修改后的arr5数组中索引为2的元素，这个过程中数组arr5的值已经被修改了，由[2, 3, 3, 12, -2, 7]——>[2, 3, 6, 12, -2, 7]。
         * 3.再往下执行与上边执行过程同理。
         */
        int[] arr3 = new int[10];
        //Arrays.setAll(arr3, i -> i * 10);//setAll方法提供一个 int -> T的函数接口，通过该接口对数组的索引进行操作，然后将指定数组当前索引位置的值赋值为操作后的值
        Arrays.parallelSetAll(arr3, j -> j * 10);//parallelSetAll方法是 setAll的并行操作版本。
        System.out.println("arr3:" + Arrays.toString(arr3));//arr3:[0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
        /**
         *
         */
    }
}
