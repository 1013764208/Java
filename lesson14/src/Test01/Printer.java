package Test01;

public class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止");
    }
}
