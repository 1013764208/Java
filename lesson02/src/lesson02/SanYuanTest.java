package lesson02;
/*
    运算符.三元运算符
    1. 结构：（条件表达式）?表达式1：表达式2
    2. 说明
        2.1 条件表达式的结果为boolean类型
        2.2 如果表达式为true，则执行表达式1
            如果表达式为false，则执行表达式2
    3. 凡是可以使用三元运算符的地方，都可以改写为 if-else，反之不成立
    4. 优先 三元运算符，简洁、效率高
 */
public class SanYuanTest {
    public static void main(String[] args){
        // 获取两个整数的较大值
        int m = 12;
        int n = 5;

        int max = (m > n)? m : n;
        System.out.println(max);

        // 练习：获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;
        int tep = (n1 > n2)? n1 : n2;
        int re_max = (tep > n3)? tep : n3;
        System.out.println(re_max);
    }
}
