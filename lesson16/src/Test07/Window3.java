package Test07;

/**
 * @author HXS
 * @create 2021-02-25 10:22
 */
public class Window3 implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();

        }
    }

    public synchronized void show() { // 同步监视器：this
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
            ticket--;
        }
    }
}
