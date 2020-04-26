package com.abc.part_three;


public class ArrayTest {
    public static void main(String[] args) {
        /**
         * 定义数组进行静态初始化
         */
//        System.out.println("定义数组类型");
//        //定义一个int数组类型的变量，变量名为array1
//        int[] array1;
//        //静态初始化，初始化数组时只指定数组元素的初始值，不指定数组长度。
//        array1 = new int[]{14, 34, 2, 6};
//        //打印输出数组的长度
//        System.out.println(array1.length);
//        Object[] objArr;
//        //使用静态初始化 初始化数组时数组元素的类型是定义数组时所指定的数组元素类型的子类.
//        //String 类型是 Object 类型的子类，即 符串是 种特殊的 Object 实例
//        objArr = new String[]{"哈哈哈", "啦啦啦"};
//        System.out.println(objArr.length);
//
//        //数组定义和数组初始化同时完成
//        ///数组的定义和初始化同时完成，使用简化的静态初始化写法
//        char[] array2 = {'中', '国', '伟', '大'};
//        System.out.println(array2.length);
        /**
         * 定义数组进行动态初始化
         */
        //动态初始化只指定数组的长度，由系统为每个数组元素指定初始值。动态初始化的语法格式：arrayName = new type[length];
        //数组的定义和初始化同时完成，使用动态初始化语法
//        int[] array3 = new int[3];
//        System.out.println(array3[0]);
//        System.out.println(array3[1]);
//        System.out.println(array3[2]);
//        //会抛出数组下标越界异常，因为数组array3的长度为3，array3[3]是取得第四个元素，第四个元素不存在，就会报错并抛出异常。
//        //System.out.println(array3[3]);
//        //数组的定义和初始化同时完成，初始 数组时元素的类型是定义数组时元素类型的子类
//        Object[] array4 = new String[3];
//        System.out.println(array4[0]);
//        System.out.println(array4[1]);
//        System.out.println(array4[2]);
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
         * 数组的索引是从0开始的
         */
//        //数组的声明
//        Object[] array1 = {"阿斯蒂芬", "asdf", "国防部", "dfs45"};
//        //数组的赋值
//        array1[0] = 1.5;
//        //数组的取值
//        System.out.println(array1[0]);//1.5
//        System.out.println(array1[1]);//asdf
//        System.out.println(array1[2]);//国防部
//        System.out.println(array1[3]);//dfs45
//        //数组越界异常：java.lang.ArrayIndexOutOfBoundsException: 4
////        System.out.println(array1[4]);//dfs45
//        System.out.println(array1.length);//4
        //循环遍历数组元素
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
        /*
         输出
         阿斯蒂芬
         asdf
         国防部
         dfs45
         */
//        String[] books = new String[3];
//        books[0] = "疯狂Java讲义";
//        books[1] = "疯狂Python讲义";
//        for (int j = 0; j < books.length; j++) {
//            System.out.println(books[j]);
//        }
        /*
         * 输出
         * 疯狂Java讲义
         * 疯狂Python讲义
         * null
         */
        /**
         * foreach循环
         * 使用foreach循环遍历数组和集合元素时，无须获得数组和集合长度，无须根据索引来访问数组元素和集合元素，foreach循环自动遍历数组和集合的每个元素。
         * 语法
         * for (type variableName : array | collection){
         *      // variableName自动态代访问每个元素...
         * }
         * type是数组元素或集合元素的类型，variableName是一个形参名，foreach循环将自动将数组元素、集合元素依次赋给该变量.
         *
         */
//        for (Object varObj : array1
//        ) {
//            System.out.println(varObj);
//        }
        /*
        输出：
        阿斯蒂芬
        asdf
        国防部
        dfs45
         */
        /**
         * 使用foreach循环来法代输出数组元素或集合元素时，通常不要对循环变量进行赋值，虽然这种赋值在语法上是允许的，但没有太大的实际意义， 且极容易引起错误。
         */
//        for (Object var : array1
//        ) {
//            var = "哈哈";
//            System.out.println(var);
//        }
//        System.out.println(array1[0]);
        /*
        输出：
        哈哈
        哈哈
        哈哈
        哈哈
        阿斯蒂芬
         */
        /**
         * 使用foreach循环迭代数组元素时，并不能改变数组元素的值，因此不要对foreach的循环变量进行赋值。
         *
         * 当使用foreach来迭代数组元素时，foreach中的循环变量相当于一个临时变量。
         * 系统会把数组元素依次赋给这个临时变量，而这个临时变量并不是数组元素。
         * 它只是保存了数组元素的值。因此，如果希望改变数组元素，则不能使用这种foreach循环。
         */

        /**
         * 深入数组
         * 数组是一种引用数据类型，数组引用变量只是一个引用，数组元素和数组变量在内存里是分开存放的。
         *
         */
        /**
         *内存中的数组
         *数组引用变量只是一个引用，这个引用变量可以指向任何有效的内存，只有当该引用指向有效内存后，才可通过该数组变量来访问数组元素。
         *
         * 实际的数组对象被存储在堆(heap)内存中;如果引用该数组对象的数组引用变量是一个局部变量，那么它被存储在栈(stack)内存中。
         * 如果需要访问如图4.2所示堆内存中的数组元素，则程序中只能通过p[index]的形式实现。
         * 也就是说，数组引用变量是访问堆内存中数组元素的根本方式。
         *
         * 如果堆内存中数组不再有任何引用变量指向自己，则这个数组将成为垃圾，该数组所占的内存将会被系统的垃圾回收机制回收
         * 因此，为了让垃圾回收机制回收一个数组所占的内存空间，可以将该数组变量赋为null，也就切断了数组引用变量和实际数组之间的引用关系，实际的数组也就成了垃圾。
         */
        /**
         * 二维数组
         */
        //动态初始化
//        Object[][] arr = new String[3][2];
//        System.out.println("arr.length:" + arr.length);//输出行数 3
//        System.out.println(arr[0].length);//输出列数 2
//        System.out.println(arr[1].length);//输出列数 2
//        System.out.println(arr[2].length);//输出列数 2
////        System.out.println(arr[3].length);//输出列数 java.lang.ArrayIndexOutOfBoundsException: 3
//        //静态初始化
//        int[][] intA = {{1, 2, 5, 2}, {2, 3}, {3, 4, 5}};
//        System.out.println("intA.length:" + intA.length);//输出行数
//        System.out.println(intA[0].length);//输出列数 4
//        System.out.println(intA[1].length);//输出列数 2
//        System.out.println(intA[2].length);//输出列数 3
        /*
        输出：
        arr.length:3
        2
        2
        2
        intA.length:3
        4
        2
        3
         */

    }

}
