package Test10;

/**
 * @author HXS
 * @create 2021-02-25 10:46
 */


//使用同步机制将单例模式中的懒汉式改写为线程安全的  / 同步代码块
public class Test {

}

class Bank{
    private Bank(){}

    private static Bank instance = null;

    public static synchronized Bank getInstance(){
        // 方式 1：效率稍差
//        synchronized(Bank.class) {
//            if (instance == null){
//                instance = new Bank();
//
//            }
//            return instance;
//        }
        // 方式 2：效率高
        if (instance == null){

            synchronized(Bank.class) {
                if (instance == null){
                    instance = new Bank();

                }
            }
        }
        return instance;
    }
}