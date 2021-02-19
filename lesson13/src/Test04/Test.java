package Test04;
/*
    abstract 关键字的使用

    1. abstract : 抽象的
    2. abstract 可以用来修饰的结构：类、方法

    3. abstract 修饰类：抽象类
    3.1 此类不能实例化
    3.2 抽象类一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
    3.3 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作

    4. abstract 修饰方法：抽象方法
    4.1 抽象方法只有方法的声明，没有方法体
    4.2 包含抽象方法的类，一定是一个抽象类，反之，抽象类中可以没有抽象方法
    4.3 若子类重写父类中的所有的抽象方法后，此子类可实例化
    4.4 若子类没有重写父类中的所有的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰



 */
public class Test {
    public static void main(String[] args) {

//        abstract Person 不能被实例化
//        Person p1 = new Person();

        Student s1 = new Student();
        s1.eat();
    }
}
