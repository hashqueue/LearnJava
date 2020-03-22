package com.abc.part_two;

public class AutomaticTypeConversion {
    /**
     * 自动类型转换
     */
    public static void main(String[] args) {
        byte byte_a = 5;//1字节，在内存中占8位
        char char_a = '中';//2字节，在内存中占16位
        short short_a = 56;//2字节，在内存中占16位
        int int_a = 3000;//4字节，在内存中占32位
        float float_a = 65161.25f;//4字节，在内存中占32位
        long long_a = 99999999L;//8字节，在内存中占64位
        double double_a = 9999999.56461346;//8字节，在内存中占64位

        //如果希望把基本类型的值转换为对应的字符串时，可以把基本类型的值和一个空字符串进行连接。
        System.out.println("double_a + \"\"：" + double_a + "");
        // 下面语句输出：7Hello!
        System.out.println(3 + 4 + "Hello!");
        // 下面语句输出：Hello!34，因为Hello! + 3会把3当成字符串处理，而后再把4当做字符串处理
        System.out.println("Hello!" + 3 + 4);

        //byte类型数据向表数范围大的数据类型自动转换
        //byte转short
        short byte_to_short = byte_a;
        System.out.println("byte_to_short：" + byte_to_short);//`+`不仅可作为加法运算符使用，还可作为字符串连接运算符使用。
        //byte转char 会报错，byte类型不能自动类型转换为char类型，需要强制类型转换。
        char byte_to_char = (char) byte_a;
        System.out.println("byte_to_char：" + byte_to_char);
        //byte转int
        int byte_to_int = byte_a;
        System.out.println("byte_to_int：" + byte_to_int);
        //byte转float
        float byte_to_float = byte_a;
        System.out.println("byte_to_float：" + byte_to_float);
        //byte转long
        long byte_to_long = byte_a;
        System.out.println("byte_to_long：" + byte_to_long);
        //byte转double
        double byte_to_double = byte_a;
        System.out.println("byte_to_double：" + byte_to_double);
    }
}
