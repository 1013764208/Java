package Test06;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
       抽象基类               节点流 （文件流）            缓存流（处理流的一种）
       InputStream           FileInputStream           BufferedInputStream
       OutPutStream          FileOutPutStream          BufferedOutPutStream
       Reader                FileReader                BufferedReader
       Writer                FileWrite                 BufferedWriter

    //




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
            int data = fileReader.read();
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
}
