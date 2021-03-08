package Test07;

import com.sun.media.sound.JDK13Services;
import org.junit.Test;

import java.io.*;

/**
 * @author HXS
 * @create 2021-03-08 12:28
 */

/*
    // 缓存流的使用

    1. 缓存流
       BufferedInputStream
       BufferedOutputStream
       BufferedRead
       BufferedWriter

    2. 作用：提高流的读取，写入的速度
       提高读写速度的原因：内部提供了一个缓冲区

    3. 处理流，就是 "套接" 在已有的流的基础上



 */
public class Test01 {

    // 实现非文本文件的复制  bufferedRead，bufferedWrite
    @Test
    public void test1() {

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            // 1. 造文件
            File srcFile = new File("2021-3-8.png");
            File destFile = new File("2021-3-8-3.png");

            // 2.造流
            // 2.1 造节点流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);

            // 2.2 造缓存流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


            // 3. 复制的细节；读取，写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 资源关闭
            // 要求：先关闭外层的流，再关闭内存的流
            // 说明：关闭外层流的同时，内存流也会自动的进行关系，关于内存流的关闭，我们可以省略
            // fileOutputStream.close();
            // fileInputStream.close();
            if (bufferedInputStream != null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 实现文件复制的方法
    public void copyFileWithBuffered(String scrPath,String destPath) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            // 1. 造文件
            File srcFile = new File(scrPath);
            File destFile = new File(destPath);

            // 2.造流
            // 2.1 造节点流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);

            // 2.2 造缓存流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);


            // 3. 复制的细节；读取，写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 资源关闭
            // 要求：先关闭外层的流，再关闭内存的流
            // 说明：关闭外层流的同时，内存流也会自动的进行关系，关于内存流的关闭，我们可以省略
            // fileOutputStream.close();
            // fileInputStream.close();
            if (bufferedInputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){

        long start = System.currentTimeMillis();
        copyFileWithBuffered("2021-3-8.png","2021-3-8-4.png");
        long end = System.currentTimeMillis();
        System.out.println(("复制操作花费的时间：" + (end - start)));
    }


    @Test
    public void test4(){

    }
}
