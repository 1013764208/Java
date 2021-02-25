package Test17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author HXS
 * @create 2021-02-25 15:40
 */

/*
    创建线程的方式四：使用线程池

    好处： 提高响应速度（减少了创建新线程的时间）
          降低资源消耗（重复利用线程池中线程，不需要每次都创建）
          便于线程管理

    面试题：创建多线程有四种方式

 */

class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+ ":" + i);
            }
        }
    }
}
class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+ ":" + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {

        // 1. 提供执行线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        // 设置线程池的属性
//        service1.setCorePoolSize(15);
//         service1.setKeepAliveTime();


        // 2. 执行指定的线程的操作. 需要提供实现 Runnable接口或 Callable 接口实现类的对象
        service.execute(new NumberThread());  // 适合使用于 Runnbale
        service.execute(new NumberThread1());  // 适合使用于 Runnbale

//        service.submit(Callable callable); // 适合使用于 Callable

        // 3. 关闭连接池
        service.shutdown();
    }
}

