package lesson01;
/*
    java定义的数据类型
    1. 变量按照数据类型分类
        1.1 基本数据类型
            整型：byte / short / int / long
            浮点型：float / double
            字符型：char
            布尔型：boolean

        1.2 引用数据类型
            类 class
            接口 interface
            数组 array
 */
public class  VariableTest1 {
    public static void main(String[] args){
        // 整型：byte 1字节 = 8 bit，范围 -128 ~ 127
        //      short 2字节   int 4字节   long 8字节
        byte b1 = 12;
        short s1 = 127;     // -129 ~ 127
        int i1 = 256;       // 常用
        long l1 = 2323321L; // 声明long型变量，必须以 "l"或 “L” 结尾

        // 浮点型：float 4字节 单精度，尾数精确到7位有效数字
        //       double 8字节 双精度，精确到14位有效数字
        double d1 = 123.3;  // 常用
        float f1 = 12.3f;   // 声明float型变量，必须以 "f" 或 “F” 结尾

        // 字符型：char   1字符 = 2字节
        // 表示方式    1.声明一个字符  2.转义符  3.直接使用 Unicode 值表示字符型常量
        char c1 = 'a';      // 定义char型变量，通常使用 ''
        // c1 = 'ab'            error 内部只能写一个字符
        char c2 = '中';     // 中文也行，一个中文汉字为两个字节
        char c3 = '\t';     // 制表
        char c4 = '\u0043'; // unicode

        // 布尔型：boolean True/false
        boolean bb1 = true;

        System.out.println(c4);



    }
}
