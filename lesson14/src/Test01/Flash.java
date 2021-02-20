package Test01;

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘启动");
    }

    @Override
    public void stop() {
        System.out.println();
    }
}
