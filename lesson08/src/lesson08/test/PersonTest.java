package lesson08.test;

/*
    类的结构之三：构造器 / 构造方法 / constructor 的使用

    1. 构造器的作用
    1.1 创建对象
    1.2 初始化对象

    2. 说明
    2.1 如果没有显式的定义类的构造器，则系统默认提供一个空参的构造器
    2.2 定义构造器的格式：权限修饰符 类名（形参列表）{}
    2.3 一个类中定义的多个构造器，彼此构成重载
    2.4 一旦我们显式的定义类的构造器之后，系统就不再提供默认的空参构造器
    2.5 一个类中，至少会有一个构造器  默认/自己造
 */
public class PersonTest {
    public static void main(String[] args) {
        // 创建类的对象 : new + 构造器
        Person p = new Person();
        p.eat();
        Person p1 = new Person("tome");
        System.out.println(p1.name);
    }
}
class Person{
    // 属性
    String name;
    int age;

    // 构造器
    public Person(){
        System.out.println("Person()...");
    }
    public Person(String n){            // 重载
        name = n;
    }
    public Person(String n,int i){      // 重载
        name = n;
        age = i;
    }

    // 方法
    public void eat(){
        System.out.println("eat...");
    }
    public void study(){
        System.out.println("studying...");
    }
}
