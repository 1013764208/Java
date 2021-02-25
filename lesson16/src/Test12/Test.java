package Test12;

/**
 * @author HXS
 * @create 2021-02-25 11:37
 */

/*
    解决线程安全问题的方式三：Lock 锁 -- JDK 5.0 新增

    1. 面试题：synchronized 与 lock 异同?
       同：二者都可以解决线程安全问题
       不同：synchronized 机制在执行完相应的同步代码以后，自动的释放同步监视器
            lock 需要手动的启动同步，同时结束同步也需要手动实现

    2. 优先使用顺序
    Lock -> 同步代码块（已经进入方法体，分配相应资源） -> 同步方法（在方法体之外）

    3. 面试题：如何解决线程安全问题?有几种方法

 */
public class Test {
    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();

    }

}
