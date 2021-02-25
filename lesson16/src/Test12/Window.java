package Test12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author HXS
 * @create 2021-02-25 11:38
 */
public class Window implements Runnable {

    private int ticket = 100;

    // 1. 实例化 ReentrantLock
    private ReentrantLock lock = new ReentrantLock();



    @Override
    public void run() {
        while (true) {
            try {
                //2. 调用锁定方法： lock
                lock.lock();

                if (ticket > 0) {

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": 售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //3. 调用解锁方法：unlock
                lock.unlock();
            }
        }
    }
}
