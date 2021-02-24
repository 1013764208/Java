package lesson02;
/*
    运算符.比较运算符
    == != > < >= <= instanceof

    结论：1. 比较运算符的结果是boolean类型
         2. 区分 == （等号） 和 = （赋值）
 */
public class CompareTest {
    public static void main(String[] args){
        int i = 10;
        int j = 20;

        System.out.println(i == j);  // false
        System.out.println(i = j);   // 20  将j赋值为i，打印i

    }
}
