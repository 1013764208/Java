package Test09;

import org.junit.Test;

import java.io.*;

/**
 * @author HXS
 * @create 2021-03-09 17:38
 */

/*
    对象流的使用
    1. ObjectInputStream 和 ObjectOutputStream
    2. 作用：用于存储和读取基本数据类型数据或对象的处理流。它的强大之处就是可以把Java
            中的对象写入到数据源中，也能把对象从数据源中还原回来

    3. 要想一个对象是可序列化，需要满足相应的要求，见Person

    4.序列化机制：
    4.1 允许把内存中的Java对象转换成平台无关的二进制流，从而允许把这种二进制流持久地保存在磁盘上，
        或通过网络将这种二进制流传输到另一个网络节点

    4.2 当其它程序获取了这种二进制流，就可以恢复成原来的Java对象

 */

public class Test01 {


    // 序列化：将内存中的java对象保存到磁盘中或通过网络传输出去
    // 使用objectOutputStream 实现
    @Test
    public void test1() throws IOException {
        // 1. 造流，造文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));

        // 2. 写入
        oos.writeObject(new String("我爱北京天安门"));
        oos.flush(); // 刷新操作

        oos.writeObject(new Person("AA",12,new Account(2000)));
        oos.flush();



        // 3. 关闭
        oos.close();
    }


    // 反序列化：将磁盘文件中的对象还原为内存中的一个对象
    // 使用：objectInputStream 来实现
    @Test
    public void test02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));

        Object object = ois.readObject();
        String str = (String)object;
        System.out.println(str);

        Person p = (Person) ois.readObject();
        System.out.println(p);

        ois.close();
    }
}
