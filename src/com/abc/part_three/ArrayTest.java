package com.abc.part_three;

public class ArrayTest {
    public static void main(String[] args) {
        /**
         * 定义数组进行静态初始化
         */
        System.out.println("定义数组类型");
        //定义一个int数组类型的变量，变量名为array1
        int[] array1;
        //静态初始化，初始化数组时只指定数组元素的初始值，不指定数组长度。
        array1 = new int[]{14, 34, 2, 6};
        //打印输出数组的长度
        System.out.println(array1.length);
        Object[] objArr;
        //使用静态初始化 初始化数组时数组元素的类型是定义数组时所指定的数组元素类型的子类.
        //String 类型是 Object 类型的子类，即 符串是 种特殊的 Object 实例
        objArr = new String[]{"哈哈哈", "啦啦啦"};
        System.out.println(objArr.length);

        //数组定义和数组初始化同时完成
        ///数组的定义和初始化同时完成，使用简化的静态初始化写法
        char[] array2 = {'中', '国', '伟', '大'};
        System.out.println(array2.length);
        /**
         * 定义数组进行动态初始化
         */
        //动态初始化只指定数组的长度，由系统为每个数组元素指定初始值。动态初始化的语法格式：arrayName = new type[length];
        //数组的定义和初始化同时完成，使用动态初始化语法
        int[] array3 = new int[3];
        System.out.println(array3[0]);
        System.out.println(array3[1]);
        System.out.println(array3[2]);
        //会抛出数组下标越界异常，因为数组array3的长度为3，array3[3]是取得第四个元素，第四个元素不存在，就会报错并抛出异常。
        //System.out.println(array3[3]);
        //数组的定义和初始化同时完成，初始 数组时元素的类型是定义数组时元素类型的子类
        Object[] array4 = new String[3];
        System.out.println(array4[0]);
        System.out.println(array4[1]);
        System.out.println(array4[2]);
        /*
        输出
        0
        0
        0
        null
        null
        null
         */
        /*
        执行动态初始化时，程序员只需指定数组的长度,即为每一数组元素指定所需的内存空间，系统将负责为这些数组元素分配初始值。
        指定初始值时，系统按如下规则分配初始值：
        数组元素的类型是基本类型中的整数类型(byte、short、int、long)，则数组元素的值是0
        数组元素的类型是基本类型中的浮点类型(float、double)数组元素的值是0.0
        数组元素的类型是基本类型中的字符类型(char)，则数组元素的值是'\\uOOOO'
        数组元素的类型是基本类型中的布尔类型(boolean)数组元素的值是false
        数组元素的类型是引用类型(类、接口和数组) ，则数组元素的值是null

        不要同时使用静态初始化和动态初始化，也就是说，不要在进行数纽初始化时，既指定数组的长度，也为每个数组元素分配初始值。
        数组初始化完成后，就可以使用数组了，包括为数组元素赋值，访问数组元素值和获得数组长度等。
         */
        /**
         * 使用数组
         */
    }
}
