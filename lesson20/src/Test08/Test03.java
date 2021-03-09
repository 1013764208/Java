package Test08;


import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author HXS
 * @create 2021-03-09 13:56
 */

/*
    其他流的使用
    1. 标准的输入、输出流
    2. 打印流
    3. 数据流



 */
public class Test03 {
    /*
        1. 标准的输入、输出流
        1.1 system.in：标准的输入流，默认从键盘输入
            system.out：标准的输出流，默认从控制台输出

        1.2 system类的setIn(InputStream is) / setOut(OutputStream os) 方式重新指定输入流和输出流
     */

    /*
        练习：
        从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，直至当输入 "e"
        或者 "exit" 时，退出程序

        方法1：使用 scanner 实现，调用 next() 返回一个字符串
        方法2：使用 system.in 实现， system.in ->  转换流 —> bufferedRead 的 readLine()


     */
    @Test
    public void test1() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while (true) {
            System.out.println("请输入字符串：");
            String readLine = bufferedReader.readLine();
            if ("e".equalsIgnoreCase(readLine) || "exit".equalsIgnoreCase(readLine)) {
                System.out.println("程序结束");
                break;
            }
            String upperCase = readLine.toUpperCase();
            System.out.println(upperCase);
        }
    }

    public static void main(String[] args) throws IOException {
        Test03 test03 = new Test03();
        test03.test1();
    }

    /*
        2. 打印流：printStream 和 printWrite
        2.1 提供了一系列重载的print() 和 println()
     */
    @Test
    public void test2(){

    }
}
