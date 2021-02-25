package Test09;

/**
 * @author HXS
 * @create 2021-02-25 10:46
 */


//使用同步机制将单例模式中的懒汉式改写为线程安全的 / 同步方法
public class Test {

}

class Bank{
    private Bank(){}

    private static Bank instance = null;

    public static synchronized Bank getInstance(){
        if (instance == null){
            instance = new Bank();

        }
        return instance;
    }
}