package Test06;

/**
 * @author HXS
 * @create 2021-02-24 15:44
 */

/*
    使用同步代码块解决继承Thread类的方式的线程安全问题
    例子：创建三个窗口卖票，总票数为100张

    说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当监视器
 */


class Window extends Thread {
    private static int ticket = 100;
    static Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            // synchronized (obj) {  // this 这边不行
            synchronized (Window.class) {  // 类也是对象，只会加载一次
                if (ticket > 0){
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ": 卖票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
