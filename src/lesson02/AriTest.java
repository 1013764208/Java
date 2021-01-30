package lesson02;
/*
    运算符.算数运算符
 */
public class AriTest {
    public static void main(String[] args){
        // /：除号
        int num1 = 12;
        int num2 = 5;
        int result = num1 / num2;    // int/int = int

        double result3 = num1 / num2; // 先得2，再赋值给double 2.0
        double result4 = num1 / (num2 + 0.0); // 2.4

        // %：去余运算
        // 总结：结果的符号与被模数的符号相同
        // 开发中，经常使用%来判断能否被除尽的情况
        int m1 = 12;
        int m2 = 5;
        System.out.println(m1 + "%" + m2 + "=" + m1 % m2); // 12%5=2

        int m3 = -12;
        int m4 = 5;
        System.out.println(m3 + "%" + m4 + "=" + m3 % m4); // -12%5=-2

        int m5 = 12;
        int m6 = -5;
        System.out.println(m5 + "%" + m6 + "=" + m5 % m6); // 12%-5=2

        int m7 = -12;
        int m8 = -5;
        System.out.println(m7 + "%" + m8 + "=" + m7 % m8); // -12%-5=-2

        // 前 ++：先自增1，再运算
        // 后 ++：先运算，再自增1
        // 注意：自增1不会改变本身变量的数据类型
        int a1 = 10;
        int b1 = ++a1;  // 11
        System.out.println(b1); 

        int a2 = 10;
        int b2 = a2++;  // 10
        System.out.println(b2);

        // 前 --：先自减，再运算
        // 后 --；先运算，再自减
    }
}
