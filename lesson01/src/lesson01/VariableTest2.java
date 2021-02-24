package lesson01;

import sun.security.krb5.internal.crypto.EType;

/*
    基本数据类型之间的运算规则
    前期：这里只讨论7种数据类型变量间的运算，不包括boolean类型的
    1. 自动类型转换
       byte / char / short - int - long - float - double
       结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
       说明：此时的容量大小指的是，表示数的范围的大和小  EX- float容量大于long
       特别的：当 byte/char/short 三种类型的变量做运算时，结果为int型

    2. 强制类型转换  自动类型提升运算的逆运算
       2.1 需要使用强转符
       2.2 注意：强制类型转换，可能导致精度损失
 */
public class VariableTest2 {
    public static void main(String[] args){

        byte b1 = 2;
        int i1 = 12;
        short s1 = 10;
        int i2 = b1 + i1;   // byte + int = int
        float f1 = b1 + i1; // byte int = float

        char c1 = 'a';
        int i3 = 10;
        int i4 = c1 + i3;
        int c2 = s1 + c1;   // char + short = int

        System.out.println(i4);
    }
}
class VariableTest3{
    public static void main(String[] args){
        double d1 = 12.3;
        int i1 = (int) d1;  // 强制转换

        System.out.println(d1); // 12.3
        System.out.println(i1); // 12 精度损失

        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b); // -128 精度损失
    }
}
class VariableTest4{
    public static void main(String[] args){
        // 1. 编码情况1
        long l1 = 12321;  // 若尾部未加 'l' ，编译为 int 类型
        System.out.println(l1);  // 编译为 int 类型

        // float f1 = 12.3; // 尾部必须加 ‘f’，否则 报错
        // System.out.println(f1);

        // 2. 编码情况2
        byte b = 12;
        // byte b1 = b + 1;  整型常量默认为 int 型
    }
}
