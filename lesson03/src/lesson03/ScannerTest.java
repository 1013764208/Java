package lesson03;
/*
    如何从键盘获取不同类型的变量：需要使用Scanner类型
    具体实现步骤：
    1. 导包：import java.util.Scanner
    2. Scanner的实例化 Scanner scan = new Scanner(System.in);
    3. 调用Scanner 类的相关方法，来获取指定类型的变量

    注意：需要根据相应的方法，来输入指定类型的值
         如果输入的数据类型不匹配，会报异常：InputMisMatchException
 */


import  java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // int
        System.out.println("put in name：");
        String name = scan.next();
        System.out.println(name);

        // String
        System.out.println("put in age：");
        int num = scan.nextInt();
        System.out.println(num);

        // double
        System.out.println("put in weight：");
        double wet = scan.nextDouble();
        System.out.println(wet);

        // boolean
        System.out.println("weather ok（true/false）：");
        boolean ok = scan.nextBoolean();
        System.out.println(ok);

        // 对于char类型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("put in gender:");
        String gender = scan.next();
        char genderChar = gender.charAt(0); // 获取索引为0位置的字符
        System.out.println(genderChar);


    }
}
