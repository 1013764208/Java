package Test06;

/*
    单例模式的懒汉式实现
 */
public class Singleton2 {
    public static void main(String[] args) {

        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        System.out.println(o1 == o2);


    }
}
