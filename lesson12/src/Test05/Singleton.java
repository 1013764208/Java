package Test05;
/*
    单例设计模式：
    1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例

    2. 如何实现 ?
       饿汉式 VS 懒汉式

    3. 区分饿汉式和懒汉式
       饿汉式：好处，线程安全              坏处，对象加载时间过长
       懒汉式：好处, 延迟对象的创建         坏处，目前写法，线程不安全


 */
public class Singleton {
    public static void main(String[] args) {
//        Bank b1 = new Bank();    构造器私有化，无法 new
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();

        System.out.println(b1 == b2);
    }
}
