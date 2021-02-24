package Test02;

/**
 * @author HXS
 * @create 2021-02-24 13:53
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println("MyThread1:" + i);
            }
        }
    }
}
