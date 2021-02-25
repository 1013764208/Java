package Test08;

/**
 * @author HXS
 * @create 2021-02-24 15:44
 */


//使用同步方法解决继承Thread类的方式的线程安全问题

class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            show();
        }
    }

//    private synchronized void show() {      // 同步监视器：this  # t1 t2 t3  Error
    private static synchronized void show() { // 同步监视器：Window4
        if (ticket > 0) {
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
            ticket--;
        }
    }
}
