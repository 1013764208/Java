package lesson11.Test03;
/*
    Java.lang.Object
    1. Object 类是所有Java类的根父类
    2. 如果在类的声明中未使用extends 关键字指名其父类，则默认父类为 Java.lang.Object 类
    3. Object 类中的功能 （属性和方法）就具有通用性
    4. Object 类只声明一个空参构造器

    属性 无
    方法 ...

 */
public class Object1 {
    public static void main(String[] args) {

        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order{

}
