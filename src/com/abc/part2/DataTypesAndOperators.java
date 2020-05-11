package com.abc.part2;

public class DataTypesAndOperators {
    public static void main(String[] args) {
        /**
         *单行注释、多行注释、文档注释
         * Java中8大基本数据类型
         */


        //注释
        /*
        这是多行注释
        */
        /**
         这是文档注释
         这是文档注释
         这是文档注释
         这是文档注释
         */
        //这是单行注释

        //8大基本数据类型之——整型
        //byte类型
        byte my_byte_num = 55;
        byte age = 0;
        //short类型
        short my_short_num = 20000;
        //int类型
        int my_int_num = 200000000;
//        int age = 999999999999999999;//超过int类型的表数范围。编译会报错：Error:(15, 19) java: 过大的整数: 999999999999999999
        //long类型
        long my_long_num = 99999999999999999L;
        System.out.println(my_byte_num); //55
        System.out.println(my_short_num); //20000
        System.out.println(my_int_num); //200000000
        System.out.println(my_long_num); //99999999999999999
        System.out.println("HelloJava");
        /*
        所有数字在计算机底层都是以 二进制形式存在的，原码是直接将 一个数值换算成二进制数。
        但计算机以补码的形式保存所有的整数。补码的计算规则: 正数的补码和原码完全相同，
        负数的补码是其反码加 1;反码是对原码按住取反，只是最高位(符号位)保持不变
        二进制数：整数以Ob或者OB开头
        八进制数：0开头的数
        十六进制数：0X或0x开头的数
         */

        //字符型
        char my_char1 = '中';
        char my_char2 = '国';
        //制表符
        System.out.println("my_char1\tmy_char2：" + my_char1 + my_char2);
        //双引号
        System.out.println("\"my_char1\"\t\"my_char2\"：" + my_char1 + my_char2);
        //单引号
        System.out.println("\'my_char1\'\t\'my_char2\'：" + my_char1 + my_char2);
        //反斜线
        System.out.println("\\my_char1\\\t\\my_char2\\：" + my_char1 + my_char2);
        //退格符
        System.out.println("my_char1\bmy_char2：" + my_char1 + my_char2);//my_charmy_char2：中国  删除了'my_char1'中的'1'
        //换行符
        System.out.println("my_char1：" + my_char1 + "\nmy_char2：" + my_char2);
        //回车符
        System.out.println("my_char1\rmy_char2：" + my_char1 + my_char2);

        //char类型赋值给int类型
        char name = '张';
        int char_to_int = name;
        System.out.println("char_to_int：" + char_to_int);//24352
        //int类型赋值给char类型
        char int_to_char = 10000;
        System.out.println("int_to_char：" + int_to_char);//✐

        System.out.println("******************************");
        //浮点型float和double
        /*
        因为 Java 浮点数使用二进制数据的科学计数法来表示浮点数，因此可能不能精确表
        示一个浮点数。例如把 5.2345556f 值赋给一个 float 类型变量，接着输出这个变量时看到
        这个变量的值已经发生了改变 使用 double 类型的浮点数比 float 类型的浮点数更精确，
        但如果浮点数的精度足够高(小数点后的数字很多 时) ，依然可能发生这种情况。
        如果开发者需要精确保存一个浮点数，则可以考虑使用 BigDecimal类

        double 类型代表双精度浮点数 float 类型代表单精度浮点数 。
        一 double 类型的数值占8字节、64 位， 一个float 类型的数值占4字节、 32 位。
        如果希望 Java把一个浮点类型值当成 float 类型处理，应该在这个浮点类型值后紧跟f或F。
         */
        float my_float_num = 456f;
        System.out.println("my_float_num:" + my_float_num);
        double my_double_num = 456.23541;
        System.out.println("my_double_num:" + my_double_num);
        double zero = 0.0;
        System.out.println(my_float_num/zero);
        System.out.println("******************************");
        //Java 还提供了3个特殊的浮点数值:正无穷大、负无穷大和非数
        /*
        正无穷大通过 Double、float 类的 POSITIVE_INFINITY 表示
        负无穷大通Double、Float 类的 NEGATIVE_INFINITY 表示
        非数通过 Double、Float 类的 NaN 表示
        必须指出的是，所有的正无穷大数值都是相等的，所有的负无穷大数值都是相等的
         NaN 不与任何数值相等,甚至和 NaN 都不相等
         */
        //float和double的负无穷大
        float a_float1 = Float.POSITIVE_INFINITY;
        double double_float1 = Double.POSITIVE_INFINITY;
        System.out.println("Float.NEGATIVE_INFINITY:" + Float.POSITIVE_INFINITY);
        System.out.println("Double.NEGATIVE_INFINITY:" + Double.POSITIVE_INFINITY);
        System.out.println("a_float1:" + a_float1);
        System.out.println("double_float1:" + double_float1);
        System.out.println(a_float1 == double_float1);//true
        System.out.println("******************************");
        //float和double的负无穷大
        float a_float2 = Float.NEGATIVE_INFINITY;
        double double_float2 = Double.NEGATIVE_INFINITY;
        System.out.println("Float.NEGATIVE_INFINITY:" + Float.NEGATIVE_INFINITY);
        System.out.println("Double.NEGATIVE_INFINITY:" + Double.NEGATIVE_INFINITY);
        System.out.println("a_float2:" + a_float2);
        System.out.println("double_float2:" + double_float2);
        System.out.println(a_float2 == double_float2);//true
        System.out.println("******************************");
        //float和double的非数
        float a_float3 = Float.NaN;
        double double_float3 = Double.NaN;
        System.out.println("Float.NEGATIVE_INFINITY:" + Float.NaN);
        System.out.println("Double.NEGATIVE_INFINITY:" + Double.NaN);
        System.out.println("a_float3:" + a_float3);
        System.out.println("double_float3:" + double_float3);
        System.out.println(a_float3 == double_float3);//false

        System.out.println("******************************");
        //布尔型boolean
        /*
        布尔型只有 boolean 类型，用于表示逻辑上的"真"或"假"。
        在 Java 语言中， boolean 类型的数值只能是 true或false ，不能用0或者非0来代表。
        其他基本数据类型的值也不能转换成 boolean 类型。

        字符串 "true" "false" 不会直接转换成 boolean 类型.
        但如果使用一个boolean 类型的值和字符串进行连接运算，则 boolean 类型的值将会自动转换成字符串 看下面代码
         */
        boolean boolean1 = true;
        boolean boolean2 = false;
        String str1 = boolean1 + "";
        String str2 = boolean2 + "";
        System.out.println("str1：" + str1);
        System.out.println("str2：" + str2);


        //String是一个类，使用String定义的变量属于引用数据类型，不属于Java中的8大基本数据类型
        String name1 = "小华";
        String hello = "hello "
                + name1;
//        System.out.println("这行代码被注释了，程序运行时这行代码不会被执行");

    }
}
