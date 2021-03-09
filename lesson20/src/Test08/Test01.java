package Test08;

import org.junit.Test;

import java.io.*;

/**
 * @author HXS
 * @create 2021-03-09 12:09
 */
public class Test01 {

    // 图片的加密
    @Test
    public void test1() {
            FileInputStream fileInputStream1 = null;
            FileOutputStream fileOutputStream1 = null;
        try {
            // 方式 1：
            File file = new File("2021-3-8.png");
            FileInputStream fileInputStream = new FileInputStream(file);

            // 方式 2：  # 直接导入路径也行
            fileInputStream1 = new FileInputStream("2021-3-8.png");
            fileOutputStream1 = new FileOutputStream("2021-3-8-4.png");

            byte[] buff = new byte[20];
            int len;
            while ((len = fileInputStream1.read(buff)) != -1) {
                // 字节数字进行修改
                for (int i = 0; i < len; i++) {
                    buff[i] = (byte) (buff[i] ^ 5);  // 加密
                }
                fileOutputStream1.write(buff,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream1 != null) {
                try {
                    fileOutputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream1 != null) {
                try {
                    fileInputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 图片的解密
    @Test
    public void test2() {
        FileInputStream fileInputStream1 = null;
        FileOutputStream fileOutputStream1 = null;
        try {
            // 方式 1：
            File file = new File("2021-3-8.png");
            FileInputStream fileInputStream = new FileInputStream(file);

            // 方式 2：  # 直接导入路径也行
            fileInputStream1 = new FileInputStream("2021-3-8-4.png");
            fileOutputStream1 = new FileOutputStream("2021-3-8-5.png");

            byte[] buff = new byte[20];
            int len;
            while ((len = fileInputStream1.read(buff)) != -1) {
                // 字节数字进行修改
                for (int i = 0; i < len; i++) {
                    buff[i] = (byte) (buff[i] ^ 5);  // 解密
                }
                fileOutputStream1.write(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream1 != null) {
                try {
                    fileOutputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream1 != null) {
                try {
                    fileInputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
