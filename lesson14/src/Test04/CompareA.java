package Test04;

/*
    JDK8：出了定义全局变量和抽象方法之外，还可以定义静态方法、默认方法
 */
public interface CompareA {

    // 静态方法
    public static void method1(){
        System.out.println("compareA: 北京");
    }

    // 默认方法
    public default void method2(){
        System.out.println("compareA: 上海");
    }
}
