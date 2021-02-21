package Test03;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    finally 使用

    1. finally 是可选的
    2. finally 中声明的是一定会被执行的代码,即使catch中又出现异常，try中 return,catch 中有
       return 语句等情况

    3. 像数据库连接、输入输出流、网络编程socket等资源，JVM不能自动的回收的，我们需要自己手动的进行资源
       释放，此时的资源释放，就需要声明再finally中
 */
public class FinallyTest {

    @Test
    public void testMethod(){
        int num = method();
        System.out.println(num);
    }

    public int method(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("我一定会被执行");
            return 3;
        }
    }

    @Test
    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
//            e.printStackTrace();
            int [] arr = new int[10];
            System.out.println(arr[10]);  // 出现异常

        }finally {
            System.out.println("hello");    // 一定会被执行
        }
    }

    @Test
    public void test2() {
        File file = new File("hello.txt");
        FileInputStream fileInputStream = null;  // 声明放前，赋值
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int data = 0;
        try {
            data = fileInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (data != -1){
            System.out.println((char)data);
            try {
                data = fileInputStream.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
