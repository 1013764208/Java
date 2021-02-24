package Test01;
/**
 * @author HXS
 * @create 2021-02-24 12:10
 */

/*
    1. 多线程的创建, 方式一：继承于 Thread类
    1.1 创建一个继承于 Thread类的子类
    1.2 重写 thread类的 run 方法 -> 将此线程执行的操作声明在run方法中
    1.3 创建 Thread类的子类对象
    1.4 通过此对象调用start方法 : 启动当前线程, 调用当前线性run方法

    EX- 遍历 100 以内的所有的偶数
 */

// 1.1 创建一个继承于 Thread类的子类
class MyThread extends Thread{

    // 1.2 重写 thread类的 run 方法
    @Override
    public void run() {  // 遍历 100 以内的所有的偶数
        for (int i = 0; i < 100; i++) {
            if (i % 2 ==0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}





