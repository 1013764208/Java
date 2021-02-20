package Test;
/*
    接口的使用
    1. 接口使用interface来定义
    2. Java中，接口和类是并列的两个结构

    3. 如何定义接口：定义接口中的成员
    3.1 JDK7及以前：只能定义全局常量和抽象方法
        全局常量：public static final , 可省略
        抽象方法：public abstract

    3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法

    4. 接口中不能定义构造器！ 意味着接口不可以实例化

    5. JAVA 开发中，接口通过让类去实现implement的方式来使用
       如果实现类覆盖了接口中所有的抽象方法，则此实现类就可以实例化
       如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类

    6. JAVA 类可以实现多个接口 —> 弥补了java单继承的局限性
       格式：class AA extends BB implements CC,DD...

    7. 接口与接口之间可以继承，可以多继承

    8. 接口的具体使用：体现多态性

    9. 接口，实际上可以看做一种规范

    面试题：抽象类与接口有哪些异同 ?

 */
public class Interface {
    public static void main(String[] args) {

        Plane plane = new Plane();
        plane.fly();

    }
}
