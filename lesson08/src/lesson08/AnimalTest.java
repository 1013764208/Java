package lesson08;

/*
    面向对象的特征 ：封装与隐藏

    为什么需要封装？封装的作用和含义？
    我要用洗衣机，只需要按一下开关和洗涤模式就可以了。有必要了解洗衣机内部的结构吗？有必要碰电动机吗？

    我们程序设计追求“高内聚，低耦合”
    高内聚 ：类的内部数据操作细节自己完成，不允许外部干涉
    低耦合 ：仅对外暴露少量的方法用于使用

    隐藏对象内部的复杂性，只对外公开简单的接口。便于外界调用，从而提高系统的可扩展性、可维护性
    通俗的说，把该隐藏的隐藏起来，该暴露的暴露出来。这就是封装性的设计思想

    1. 问题引入
       当我们创建一个类的对象以后，我们可以通过 "对象.属性" 的方式，对对象的属性进行赋值
       这里的赋值操作受到属性的数据类型和存储范围的限制，但除此之外，没有其他制约条件
       但在实际问题中，我们往往给属性赋值加入额外条件限制 EX- setLegs
       同时，我们需要避免用户再使用 ”对象.属性“ 的方式对属性进行赋值，将属性声明为 private
       - > 此时，针对属性就体现了封装性

    2. 封装性的体现
       将类的属性私有化 private ，同时提供公共 public 的方法获取 get.. 和 设置 set.. 此属性的值

       拓展：封装性的体现：1.如上  2. 不对外暴漏私有的方法  3. 单例模式...

    3. 封装性的体现，需要权限修饰符来配合
    3.1 JAVA 规定： private - 缺省 - protected - public   / ASC
    3.2 4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
    3.3 具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
        修饰类时，只能用 public、缺省

    总结：JAVA 提供4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构再被调用时的可见性的大小

 */
public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "花花";
//        a.age = 1;    // 已经私有化，不能直接修改，需要使用 set 方法
//        a.legs = 4;   // 已经私有化，不能直接修改，需要使用 set 方法

//        System.out.println(a.age);  // 已经私有化，不能直接访问，需要使用 get 方法


        a.show();
        a.setLegs(-6);  // error, 加入额外条件
        a.show();
    }
}

class Animal{
    String name;
    private int age;
    private int legs;

    // setLegs
    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }
    }
    // getLegs
    public int getLegs(){
        return  legs;
    }
    // setAge
    public void setAge(int a) {
        age = a;
    }
    // getAge
    public int getAge() {
        return age;
    }


    public void eat(){
        System.out.println("eat...");
    }
    public void show(){
        System.out.println("name: " + name + " age: " + age + " legs: " + legs);
    }
}