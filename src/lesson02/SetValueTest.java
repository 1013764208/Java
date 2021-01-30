package lesson02;
/*
    运算符.赋值运算符
    = += -= *= /= %=
 */
public class SetValueTest {
    public static void main(String[] args){
        // 赋值符号：=  ,等号为 ==
        int j1 = 10;

        int num1 = 10;
        num1 += 2;  // num1 = num + 2
        System.out.println(num1);

        int num2 = 12;
        num2 %= 5;  // num2 = num2 % 5
        System.out.println(num2);

        // 开发中，如果希望实现变量+2的操作，有几种方式
        int num = 10;
        //方式1：num = num + 2;
        //方式2：num += 2; // 推荐
    }
}
