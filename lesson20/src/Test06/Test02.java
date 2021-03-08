package Test06;

import org.junit.Test;
import java.io.*;

/**
 * @author HXS
 * @create 2021-03-08 11:41
 */

/*
    FileInputStream / FileOutPutStream

    1. 对于文本文件（txt，java，c...），使用字符流处理
    2. 对于非文件文件（jpg，mp3，mp4，doc，ppt，avi），使用字节流处理

 */
public class Test02 {

    // 使用字节流fileInputStream处理文本文件，
    @Test
    public void test1() throws IOException {
        // 1.造文件
        File file = new File("hello.txt");

        // 2. 造流
        FileInputStream fileInputStream = new FileInputStream(file);

        // 3. 读数据
        byte[] buffer = new byte[5];
        int len;    // 记录每次读取的字节的个数
        while ((len = fileInputStream.read(buffer)) != -1) {
            String str = new String(buffer, 0, len);
            System.out.print(str);
        }

        // 4. 关闭流
        fileInputStream.close();
    }


    // 处理非文本文件，实现对图片的复制操作
    @Test
    public void test2() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            // 1. 造文件
            File scrFile = new File("2021-3-8.png");
            File destFile = new File("2021-3-8-1.png");

            // 2. 造流
            fileInputStream = new FileInputStream(scrFile);
            fileOutputStream = new FileOutputStream(destFile);

            // 3. 读写
            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 4. 关流
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    // 指定路径文件下的复制
    public void copyFile(String srcPath, String destPath) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            // 1. 造文件
            File scrFile = new File(srcPath);
            File destFile = new File(destPath);

            // 2. 造流
            fileInputStream = new FileInputStream(scrFile);
            fileOutputStream = new FileOutputStream(destFile);

            // 3. 读写
            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 4. 关流
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test3(){

        long start = System.currentTimeMillis();
        copyFile("2021-3-8.png","2021-3-8-2.png");
        long end = System.currentTimeMillis();
        System.out.println("复制操作花费的时间为：" + (end - start));

    }
}

