package Test;

interface Flyable {

    //全局常量
    public static final int MAX_SPEED = 7900; // 第一宇宙速度
    int MIN_SPEED = 1;  // 可省略

    // 抽象方法
    public abstract void fly();
    void step();   // 可省略

}
