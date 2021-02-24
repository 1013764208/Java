package Test01;

/**
 * @author HXS
 * @create 2021-02-24 12:22
 */
public class Test {
    public static void main(String[] args) {
        //  1.3 创建 Thread类的子类对象
        MyThread myThread = new MyThread();

        //  1.4 通过此对象调用start方法
        myThread.start();
        // 问题1：我们不能通过直接调用run方法的方式启动线程
//        myThread.run();

        // 问题2；再启动一个线程，遍历100以内的偶数
//        myThread.start();  # 不可以，还让已经 start的线程去执行，需要重新 new MyThread
        MyThread myThread1 = new MyThread();
        myThread1.start();

        // 如下操作在 main 线程中执行
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + "main");
            }
        }
    }
}
