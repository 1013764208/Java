package Test05;

// 饿汉式
public class Bank {

    // 1. 私有化类的构造器
    private Bank(){

    }

    // 2. 内部创建类的对象
    // 4. 要求此对象必须声明为静态的
    private static Bank instance = new Bank();

    // 3. 提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
