package Test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author HXS
 * @create 2021-03-10 11:50
 */

/*
    1. 网络编程中有两个主要的问题
    1.1 如何准确地定位网络上一台或多台主机，定位主机上的特定的应用
    1.2 找到主机后如何可靠高效地进行数据传输

    2. 网络编程中的两个要素
    2.1 对应问题1：IP和端口号
    2.2 对应问题2：提供网络通信协议：TCP/IP 参考模型（应用层，传输层，网络层，物理+数据链路层）

    3. 通信要素1：IP和端口号
    3.1 IP：唯一的标识 Internet 上的计算机（通信实体）
    3.2 在JAVA中属于 InetAddress 类代表IP
    3.3 IP分类：IPv4 和 IPv6， 万维网 和 局域网
    3.4 域名：www.baidu.com  / www.mi.com  ...
    3.5 本地路径地址：127.0.0.1  对应着：localhost
    3.6 如何实例化 InetAddress：两个方法：getByName(String host)，getLocalHost()
        连个常用方法：getHostName() / getHostAddress()
    3.7 端口号：正在计算机上运行的进程
    　　　要求：不同的进程有不同的端口号
    　　　范围：被规定为一个 16 位的整数 0~65535
    3.8 端口号与IP地址的组合得出一个网络套接字：Socket



 */
public class Test01 {
    public static void main(String[] args) {
        try {
            // File file = new File("hello.txt");
            InetAddress intet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(intet1);

            // 获取本地IP
            InetAddress inte2 = InetAddress.getLocalHost();
            System.out.println(inte2);

            // getHostName()  / 域名
            System.out.println(inte2.getHostName());

            // getHostAddress()  / 地址
            System.out.println(inte2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
