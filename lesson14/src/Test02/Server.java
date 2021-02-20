package Test02;

// 被代理类
public class Server implements NetWork {
    @Override
    public void browse() {
        System.out.println("真实服务器访问网络");
    }
}
