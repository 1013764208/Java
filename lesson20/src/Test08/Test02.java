package Test08;

import org.junit.Test;
import java.io.*;

/**
 * @author HXS
 * @create 2021-03-09 12:39
 */

/*
    处理流之二：转换流的使用
    1. 转换流：属于字符流
       InputSteamReader：将一个字节的输入流转换为字符的输入流
       OutPutWrite：：将一个字节的输出流转换为字符的输出流

    2. 作用：提供字节流于字符流之间的转换

    3. 解码：字节、字符数值 -> 字符数组，字符串   # 看不懂 -> 看的懂的
       编码：字符数组、字符串 -> 字符、字符数组   # 看得懂 -> 看不懂的

    4. 字符集
       ASCII：美国标准信息交换码，用一个字节的7位可以表示
       ISO8859-1：拉丁码表。欧洲码表，用一个字节的8位表示
       GB2312：中国的中文编码表。最多两个字节编码所有字符
       GBK：中国的中文编码表升级，融合了更多的中文文字符号。最多两个字节编码
       Unicode：国际标准码，融合了目前人类使用的所有字符。为每个字符分配唯一的字符码。所有的文字都用两个字节来表示。
       UTF-8：变长的编码方式，可用1-4个字节来表示一个字符

 */
public class Test02 {

    // 此时处理异常的话，仍然应该使用try-catch-finally
    // 字节流 -> 字符流
    @Test
    public void test1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("dbcp.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);  // 使用系统默认的字符集
        // 参数2指明了字符集，具体使用哪个字符集，取决于文件dbcp.txt保存时使用的字符集
        InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream,"UTF-8");

        char[] cbuf = new char[20];
        int len;
        while ((len = inputStreamReader1.read(cbuf)) != -1) {
            String str = new String(cbuf, 0, len);
            System.out.print(str);
        }
        inputStreamReader1.close();
    }


    // 综合使用InputStreamRead和 OutPutStreamWrite
    // 字符流（utf-8） —> 字节流  —>  字符流（gbk）
    @Test
    public void test2() throws IOException {
        // 1. 造文件，造流
        FileInputStream inputStream = new FileInputStream("dbcp.txt");
        FileOutputStream outputStream = new FileOutputStream("dbcp_gbk.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"gbk");

        // 2. 读写过程
        char[] cbuf = new char[20];
        int len;
        while ((len = inputStreamReader.read(cbuf)) != -1) {
            outputStreamWriter.write(cbuf,0,len);
        }

        // 3.资源关闭
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
