package Test03;

import org.junit.Test;
import java.io.IOException;
import java.net.*;

/**
 * @author HXS
 * @create 2021-03-10 14:02
 */

// UDpd 协议的网络编程
public class Test01 {
    // 发送端
    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();

        String str = "我是UPD方式发送的导弹";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);

        socket.send(packet);
        socket.close();
    }


    // 接受端
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buffer = new byte[200];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);

        System.out.println(new String(packet.getData(), 0, packet.getLength()));

        socket.close();
    }
}
