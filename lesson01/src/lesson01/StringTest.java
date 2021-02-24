package lesson01;
/*
    String 类型变量的使用
    1. String 属于引用数据类型
    2. 声明String类型变量时，使用 ""
    3. String 可以和8种基本数据类型做运算
    4. 运算的结果仍然为　String 类型
 */
public class StringTest {
    public static void main(String[] args){
        String s1 = "hello world";

        String s2 = ""; // 可以为空
        // char c1 = '';   char 不能为空

        int number = 1001;
        String numberStr = "xue hao:";
        boolean b1 = true;
        String info = numberStr + number; // + 连接运算
        String info1 = numberStr + b1;

        System.out.println(info1);
    }
}
class Test01{
    public static void main(String[] args){
        char c = 'a';   // 97
        int num = 10;
        String  str = "hello";
        // 只有遇到 String 时，+ 表示连接运算
        System.out.println(c + num + str); // 第一个加号表达 加法运算  97+10=107
        System.out.println('*' + '\t' + '*'); // char ,加法运算
    }
}

