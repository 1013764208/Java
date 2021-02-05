package lesson08;
/*
    this 关键字的使用
    1. this 可以用来修饰：属性、方法、构造器
    2. this 修饰属性和方法
       this 理解为：当前对象

    2.1 在类的方法中，我们可以使用 "this.属性" 或 "this.方法" 的方法，调用当前对象属性或方法
        但是，通常情况下，省略 "this" ，特殊情况下，如果方法的形参和类的属性名同名时，我必须显式
        的使用 "this.变量" 的方法，表明此变量是属性，而非形参

    2.2 在类的构造器中，我们可以使用 "this.属性" 或 "this.方法" 的方法，调用当前正在创建对象的属性或方法
        但是，通常情况下，省略 "this" ，特殊情况下，如果构造器的形参和类的属性名同名时，我必须显式
        的使用 "this.变量" 的方法，表明此变量是属性，而非形参

    3. this 调用构造器 / 避免冗余
    3.1 在类的构造器中，可以显式使用 "this（形参列表）"方法，调用本类中指定其他构造器
    3.2 构造器中不能通过 "this（形参列表）" 方法调用自己
    3.3 规定："this（形参列表）" 必须声明在当前构造器的首行
    3.4 构造器内部，最多只能声明一个 "this（形参列表）" 用来调用其他构造器
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(1);
        System.out.println("age: " + p1.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
        this.eat();
        // Person初始化时，需要考虑 1,2,3...
    }

    public Person(String name,int age){
        this();         // this 调用构造器
        this.name = name;
        this.age = age;
        // Person初始化时，需要考虑 1,2,3...
    }


    public void setName(String name) {
        this.name = name;       // 当前对象.属性 = 形参
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("eat...");
    }
}