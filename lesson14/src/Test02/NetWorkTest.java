package Test02;

public class NetWorkTest {

    public static void main(String[] args) {

        Server server = new Server();
        Proxy proxy = new Proxy(server);

        proxy.browse();
    }
}
