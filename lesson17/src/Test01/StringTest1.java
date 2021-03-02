package Test01;

import org.junit.Test;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author HXS
 * @create 2021-03-02 10:51
 */

/*
    涉及到string类与其他结构之间的转换
 */
public class StringTest1 {
    /*
        复习：
        string 与 基本数据类型、包装类之间的转换

        string -> 基本数据类型，包装类: 调用包装类的静态方法 parsxxx
        基本数据类型、包装类 -> string： 调用string 重载的  valueOf
     */
    @Test
    public void test1(){
        String str1 = "123";
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);  // "123"
    }

    /*
        string 与字符数组转换

        String -> char[]: 调用string 的toCharArray()
        char[] -> String: 调用String 的构造器
     */
    @Test
    public void test2(){
        String str1 = "abc123";

        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

    /*
        string 与 byte[] 之间转换
        编码：string -> byte[]: 调用string的 getbytes()
        解码：byte[] -> String: 调用String的构造器

        编码：字符串 -> 字节  # 看得懂 -> 看不懂的
        解码：编码的逆过程 ，字节 -> 字符串 # 看不懂的二进制 —> 看到懂

        说明：解码时，要求解码使用的字符集必须与编码时的使用的字符集一致，否则会出现乱码

     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();     // 使用默认的字符集，进行编码
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");     // 使用gbk字符集进行编码
        System.out.println(Arrays.toString(gbks));

        String s1 = new String(bytes);       // 解码，看不懂  —> 看的懂的
        System.out.println(s1);
    }
}
