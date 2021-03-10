package Test01;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HXS
 * @create 2021-03-10 12:39
 */

/*
    实现TCP的网络编程
    EX1-：客户端发送信息给服务端，服务端将数据显示在控制台上
 */
public class Test02 {

    // 客户端
    @Test
    public void client() {

        Socket socket = null;
        OutputStream os = null;
        try {
            // 1. 创建socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8899);

            // 2. 获取一个输出流，用于输出数据
            os = socket.getOutputStream();

            // 3. 写出数据的操作
            os.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 资源的关闭
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    // 服务端
    @Test
    public void server() {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            // 1. 创建服务区端的serversocket，指明自己的端口号
            ss = new ServerSocket(8899);

            // 2. 调用accept()表示接受来自客服端的socket
            socket = ss.accept();

            // 3. 获取客户端输入流
            is = socket.getInputStream();

//        不建议这样写，可能会有乱码 # 会边输出，边编译， 会将 中文3bit拆分，从而乱码
//        byte[] buffer = new byte[20];
//        int len;
//        while ((len = is.read(buffer)) != -1) {
//            String str = new String(buffer,0,len);
//            System.out.println(str);
//        }

            // 4. 读取输入流中的数据
            // 输出完后，再一块编译
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while ((len = is.read(buffer)) !=-1 ) {
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());  // 在此共同编译
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //5. 资源关闭
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
