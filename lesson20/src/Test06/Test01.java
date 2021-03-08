package Test06;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import org.junit.Test;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author HXS
 * @create 2021-03-07 20:19
 */

/*
    // 流的分类
    1. 操作数据单位：字符流，字节流     # 2bit， 4 bit
    2. 数据的流向：输入流，输出流
    3. 流的角色：节点流，处理流

    // 流的体系结构
       抽象基类               节点流 （文件流）                                缓存流（处理流的一种）
       InputStream           FileInputStream（read(byte[] cbuf）            BufferedInputStream （read(byte[] cbuf）
       OutPutStream          FileOutPutStream（write(byte[] cbuf,0,Len）    BufferedOutPutStream （write(byte[] cbuf,0,Len）
       Reader                FileReader（read(char[] cbuf）                 BufferedReader （read(char[] cbuf） / readLine()
       Writer                FileWrite （write(char[] cbuf,0,Len）          BufferedWriter （write(char[] cbuf,0,Len）







 */
public class Test01 {
    public static void main(String[] args) {
        File file = new File("hello.txt");  // 相对路径：相较于当前 Project
    }


    // 将lesson20下的hello.txt文件内容读入程序中，并输出到控制台  # 将硬盘中的数据读取
    /*
        说明点
        1. read()的理解：返回读入的一个字符，如果达到文件末尾，返回 -1
        2. 异常的处理，为了保证流资源一定可以执行关闭操作，需要使用 try-catch-finally 处理
        3. 读入的文件一定要存在，否则就会报 FileNotFoundException
     */
    @Test
    public void test1() {
        FileReader fileReader = null;
        try {
            // 1. 实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");   // 相对路径：相较于当前 Module

            // 2. 提供具体的流  # 节点流 / 管道
            fileReader = new FileReader(file);

            // 3. 数据的读入
            // read()：返回读入的一个字符，如果达到文件末尾，返回-1
            // 方式 1：
            int data = fileReader.read();       // 默认一个一个的读
            while (data != -1) {
                System.out.print((char) data);  // 只读了一个，还要再去读 ， return ASC码
                data = fileReader.read();
            }

            // 方式 2：语法上针对方式 1 的修改
            int data1;
            while ((data1 = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. 流的关闭操作
        try {
            if (fileReader != null)
                fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 对read()操作升级：使用read重载
    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            // 1. File类的实例化
            File file = new File("hello.txt");

            // 2. 流的实例化
            fileReader = new FileReader(file);

            // 3. 读入的操作
            // read(char[] cubf)：返回每次读入cbuf数组的字符个数，如果达到文件末尾，返回-1
            // read： Reads characters into an array  # 将字符读入数组
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                // 方式 1:
                // 错误写法
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);
//                }
                // 正确的写法
                for (int i = 0; i < len; i++) {    // 读入几个，遍历几个
                    System.out.print(cbuf[i]);
                }

                // 方式 2：
                // 错误的写法，对应方式1的错误写法
//                String string = new String(cbuf);
                // 正确写法：改为string再输出
                String string = new String(cbuf, 0, len);
                System.out.print(string);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 4. 流的关闭
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /*
        从内存中写出数据到硬盘的文件里

        说明
        1. 输出操作，对应的file可以不存在，并不会报异常
        2. file对应硬盘中的文件  若不存在，在输出的过程中，会自动创建此文件
           file对应硬盘中的文件  若存在：
                  如果流使用的构造器是：FileWriter(File file, boolean append（false）) ：对原有文件的覆盖
                  如果流使用的构造器是：FileWriter(File file, boolean append（true）) ：不会对原有文件覆盖，而是在原有文件的基础上追加内容
     */

    @Test
    public void test3() {
        FileWriter fileWriter = null;
        try {
            // 1. 提供File类的对象，指明写出到的文件
            File file = new File("hello1.txt");

            // 2. 提供FileWrite 的对象，用于数据的写出
            fileWriter = new FileWriter(file,false);

            // 3. 写出的操作
            fileWriter.write("l have dream\n");
            fileWriter.write("you need to have a dream");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 4. 流资源的关闭
            if (fileWriter != null) {    // 若流（水龙头）没有关闭，则关闭流

                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test4() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            // 1. 创建File类的对象，指明读入和写出的文件
            File file1 = new File("hello.txt");
            File file2 = new File("hello1.txt");

            // 2. 创建输入流和输出流的对象
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file2);

            // 3. 数据的读入和写出
            char[] cbuf = new char[5];
            int len;  // 记录每次读入到cbuf数组中的字符长度
            while ((len = fileReader.read(cbuf)) != -1){
                // 每次写出len个字符
                fileWriter.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 4. 关闭流资源
            if (fileReader != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
