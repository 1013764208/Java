package Test01;
import org.junit.Test;


/**
 * @author HXS
 * @create 2021-02-25 18:13
 */

/*
    String 使用
 */
public class StringTest {

    /*
        String : 字符串，使用 " " 引起来表示
        1. String 声明为 final ,不可被继承
        2. String 实现了serializable 接口：表示字符串支持可序列化
                  实现了Comparable接口：表达String可比较大小
        3. String内部定义了 final char[] value 用于存储字符串数据

        4. String：代表不可变的字符序列，不可变性   # 要新造，不改之前的
        4.1 当对字符串重新赋值时，需要重新指定内存区域赋值，不能使用原有的value进行赋值
        4.2 当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值
        4.3 当调用String.replace 方法修改指定字符或字符串时，也要重新指定内存区域赋值

        5. 通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串声明在字符串常量池中
        6. 字符串常量池是不会存储相同内容的字符串
     */

    @Test
    public void test1() {
        String s1 = "abc";  // 字面量的定义方法 # 与new还不太相同

        String s2 = "abc";
        System.out.println(s1 == s2);

        s1 = "hello";

        System.out.println(s1);         // hello
        System.out.println(s2);         // abc

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);         // abcdef
    }



    /*
        String 实例化方法：
        方式 1: 通过字面量定义的方法
        方式 2: 通过 new + 构造器的方式

        面试题：String s = new String("abc") 方式创建对象，在内存中创建了几个对象
               两个：一个是堆空间中new结果，另一个是char[] 对应常量池中的数据 "abc"
     */
    @Test
    public void test2() {
        // 通过字面量定义的方法：此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中
        String s1 = "JAVAEE";
        String s2 = "JAVAEE";

        // 通过new + 构造器的方式：此时的s3和s4 保存的地址值，是数据堆空间中开辟空间以后对应的地址值
        String s3 = new String("JAVAFF");
        String s4 = new String("JAVAFF");

        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // false


    }
}
