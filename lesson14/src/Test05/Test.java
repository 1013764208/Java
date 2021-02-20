package Test05;

/*
    类的内部成员之五：内部类
    1. JAVA 中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类

    2. 内部类的分类：成员内部类 VS 局部内部类 （方法内、代码块、构造器内）

    3. 成员内部类
       一方面，作为外部类的成员：
           1. 调用外部类的结构
           2. 可以被static 修饰
           3. 可以被 4 种不同的权限修饰

       另一方面，作为一个类：
           1. 类内可以定义属性、方法、构造器等
           2. 可以被final修饰，表示此类不能被继承 言外之意，不使用final，可以被继承
           3. 可以被abstract修饰

    4. 关注如下问题
    4.1 如何实例化成语内部类的对象
    4.2 如果在成员内部类中区分调用外部类的结构
    4.3 开发中局部内部类的使用  见 Test06

 */

public class Test {
    public static void main(String[] args) {

        // 创建Dog 实例（静态的成员内部类）
        Person.Dog dog = new Person.Dog();
        dog.method();

        // 创建 Bird 实例 （非静态成员内部类）
        Person person = new Person();
        Person.Bird bird = person.new Bird();

        bird.disPlay("黄鹂");
    }
}
