package Test02;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HXS
 * @create 2021-03-10 13:20
 */

/*
    实现TCP的网络编程
    EX2- 客户端发送文件给服务器，服务端将文件保存再文本
 */
public class Test02 {
    @Test
    public void client() throws IOException {
        // 1. 创建socket对象，指明服务器端的ip和端口号
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);

        // 2. 获取输出流
        OutputStream os = socket.getOutputStream();

        // 3. 获取输入流
        FileInputStream fis = new FileInputStream("101.png");

        // 4. 读写
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer,0,len);
        }

        // 5. 资源关闭
        fis.close();
        os.close();
        socket.close();
    }


    @Test
    public void server() throws IOException {
        // 1. 创建服务区端的serversocket，指明自己的端口号
        ServerSocket ss = new ServerSocket(9090);

        // 2. 调用accept()表示接受来自客服端的socket
        Socket socket = ss.accept();

        // 3. 获取客户端输入流
        InputStream is = socket.getInputStream();

        // 4. 创建本地文件，获取输出流
        FileOutputStream fos = new FileOutputStream("101-1.png");

        // 5. 读写过程
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer,0,len);
        }

        // 6. 资源关闭
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
