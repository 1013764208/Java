package Test07;

/**
 * @author HXS
 * @create 2021-02-25 10:21
 */

/*
    使用同步方法解决实现Runnable接口的线程安全问题

    关于同步方法的总结
    1. 同步方法仍然涉及到同步监视器，只是不需要显式的声明
    2. 非静态的同步方法，同步监视器：this
       对于静态的同步，同步监视器：当前类本身

 */
public class Test {
    public static void main(String[] args) {
        Window3 w1 = new Window3();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.start();
        t2.start();
        t3.start();
    }
}
