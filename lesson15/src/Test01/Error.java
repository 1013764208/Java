package Test01;
/*
    Error   # 一般不处理
    java 虚拟机无法解决的严重问题 EX- JVM系统内部错误、资源耗尽等严重情况  StackOverflowError
 */
public class Error {
    public static void main(String[] args) {

        //1. 栈溢出 StackOverflow
        main(args);

        // 2. 堆溢出 OutOfMemoryError
        Integer[] arr = new Integer[1024*1024*1024];
    }
}
