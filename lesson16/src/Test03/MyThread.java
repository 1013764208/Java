package Test03;

class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
//                try {
//                    sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority() + " : " +  i);
            }
//            if (i % 20 == 0){
//               yield();
//            }
        }
    }
}
