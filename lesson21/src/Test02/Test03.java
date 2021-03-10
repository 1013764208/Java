package Test02;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HXS
 * @create 2021-03-10 13:36
 */

/*
    实现TCP的网络编程
    EX3- 从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端，并关闭相应的连接
 */
public class Test03 {
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
        // 关闭数据的输出
        socket.shutdownOutput();


        // 5. 接收来自服务器端的数据，并显示到控制台上
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[20];
        int len1;
        while ((len1 = is.read(buffer1)) != -1){
            baos.write(buffer1,0,len1);
        }

        System.out.println(baos.toString());


        // 6. 资源关闭
        baos.close();
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

        // 6. 服务器端给予客服端反馈
        OutputStream os = socket.getOutputStream();
        os.write("照片已收到".getBytes());

        // 7. 资源关闭
        os.close();
        fos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
