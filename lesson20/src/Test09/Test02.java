package Test09;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author HXS
 * @create 2021-03-09 19:16
 */

/*
    RandomAccessFile
    1. RandomAccessFile 直接继承于 java.lang.Object 类，实现了DateInput和DateOutput接口
    2. RandomAccessFile既可以作为一个输入流，又可以作为一个输出流
    3. 如果 RandomAccessFile 作为输出流是，写出到的文件如果不存在，则在执行过程中自动创建
       如果写出到的文件存在，则会对原有的文件的内存，进行覆盖，默认：从头到尾

    4. 可以通过相关操作，实现RandomAccessFil "插入" 数据的效果

 */
public class Test02 {

    @Test
    public void test1() throws IOException {
        RandomAccessFile randomAccessFile1 = new RandomAccessFile(new File("hello.txt"),"r");
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File("hello.txt"),"rw");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = randomAccessFile1.read(buffer)) != -1 ) {
            randomAccessFile2.write(buffer,0,len);
        }

        randomAccessFile2.close();
        randomAccessFile1.close();
    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello1.txt", "rw");

        raf1.seek(3);  // 将指针调到角标为3的位置
        raf1.write("xyz".getBytes());

        raf1.close();
    }


    //  使用 RandomAccessFile 显示插入效果
    @Test
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello1.txt", "rw");

        raf1.seek(3);      // 将指针掉到角标为3的位置
        // 保存指针3后面的所有数据到StringBuilder 中
        byte[] buffer = new byte[20];
        StringBuffer stringBuffer = new StringBuffer((int) new File("hello1.txt").length());
        int len;
        while ((len = raf1.read(buffer)) != -1){
            stringBuffer.append(new String(buffer, 0, len));
        }
        // 调回执行，写入"XYY"
        raf1.seek(3);
        raf1.write("xyz".getBytes());

        // 将stringbuilder 中是数据写入到文件中
        raf1.write(stringBuffer.toString().getBytes());

        raf1.close();
    }
}
