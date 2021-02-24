package lesson02;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
    运算符.位运算
    1. 位运算符操作的都是整型的数据
    2. << 在一定范围内，每向左移1位，相当于 * 2
    3. >> 在一定范围内，每向右移1位，相当于 / 2
    小技巧：左移多少位，给原数乘2的多少次方

    面试题：最高效的计算 2*8    2 << 3
 */
public class BitTest {
    public static void main(String[] args){
        int i = 21;
        System.out.println("i << 2: " + (i << 2));

        int m = 12;
        int n = 5;
        System.out.println("m & n: " + (m & n));
        System.out.println("m % n: " + (m % n));
        System.out.println("m | n: " + (m | n));

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;

        // 方式1： 定义临时变量
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + "\t"+ "num2 = "+ num2);

        // 方式2：
        // 优点：不用定义临时变量
        // 缺点：相加操作可能超出存储范围

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + "\t"+ "num2 = "+ num2);

        // 方式3：位运算
        // 有局限性：只能适用于数值类型
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1 = " + num1 + "\t"+ "num2 = "+ num2);
    }
}
