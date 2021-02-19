package Test01;
/*
    类的成员之四：代码块（或初始化块）

    1. 代码块的作用：用来初始化类、对象
    2. 代码块如果有修饰的话，只能使用static
    3. 分类：静态代码块 vs 非静态代码块

    4. 静态代码块
    4.1 内部可以有输出语句
    4.2 随着类的加载而执行，而且只执行一次
    4.3 作用：初始化类的信息
    4.4 如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
    4.5 静态代码块的执行要优先于非静态代码块的执行
    4.6 静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构

    5. 非静态代码块
    5.1 内部可以有输出语句
    5.2 随着对象的创建而执行
    5.3 每创建一个对象，就执行一次非静态代码块
    5.4 作用：可以再创建对象时，对对象的属性等进行初始化
    5.5 如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
    5.6 非静态代码块内可以调用静态的属性、方法，或非静态的属性、方法



    对属性可以赋值的为：
    1. 默认初始化
    2. 显式初始化
    3. 构造器中初始化
    4. 有了对象以后，可以通过 "对象.属性" 或 "对象.方法" 的方式，进行赋值
    5. 在代码块中赋值

    执行顺序：1 - 2/5 - 3 - 4

 */

public class Person {

    // 属性
    String name;
    int age;
    static String desc = "person";

    // 构造器
    public Person(){

    }


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // static 代码块
    static {
        System.out.println("hello, static block-1");
    }

    static {
        System.out.println("hello, static block-2");
    }

    // 非static 代码块
    {
        System.out.println("hello, block-1");
    }

    {
        System.out.println("hello, block-2");
    }

    // 方法
    public void eat(){
        System.out.println("eat");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("lm person");
    }
}
