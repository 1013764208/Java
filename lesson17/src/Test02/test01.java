package Test02;

import org.junit.Test;

/**
 * @author HXS
 * @create 2021-03-02 11:29
 */

/*
    关于 stringBuffer 和 stringBuilder 使用
 */
public class test01 {

    /*
        string, stringBuffer, stringBuilder 三者异同 ?
        string ： 不可变的字符序列；底层使用 char[]
        stringBuffer：可变的字符序列，线程安全，效率低   底层使用 char[]
        stringBuilder：可变的字符序列，线程不安全，效率高， JDK 5.0  底层使用 char[]

        源码分析
        String str2 = new String()          //  char[] value = new char[];
        String str2 = new String("abc")     // char[] value = new char[]{'a','b','c'}

        StringBuffer sb1 = new StringBuffer()   // char[] value = new char[16] 底层创建一个长度为16的数组
        sb1.append('a') // value[0] = 'a'
        sb1.append('b') // value[1] = 'b'

        StringBuffer sb2 = new StringBuffer("abc") // char[] value = new char["abc.length() + 16"]

        // 问题 1：System.out.println(sb2.length()); // 3
        // 问题 2：扩容问题：如果要添加的数据底层数组盛不下了，那就需要扩容底层的数组
                  默认情况下，扩容为原来容量的 2倍 +2，同时将原有数组中的元素复制到新的数组

         // 指导意义：开发中建议大家使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)


     */

    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);      // stringBuffer 可变

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());   // 0


    }
}
