package lesson09;
/*
    面向对象的特征之二：继承

    1. 继承性的好处
    1.1 减少冗余
    1.2 便于功能的扩展
    1.3 为之后多态性的使用，提供前提

    2. 语法格式：  class A extends B
        A 子类 subclass
        B 父类 superclass

    2.1 体现：一旦子类A继承B类以后，子类A中就获取父类B中声明的结构：属性、方法
    注：父类中声明为private是属性或方法，子类继承父类之后，仍然认为获取到父类中私有的结构
    是因为封装性的影响，使得子类不能直接调用父类的结构而已

    2.2 子类继承父类后，还可以声明自己特有的属性或方法：实现功能的扩展

    3. JAVA 中关于继承性的规定
    3.1 一个类可以被多个子类继承
    3.2 JAVA中类的单继承性：一个类只能有一个父类
    3.3 子父类是相对概念
    3.4 子类直接继承的父类，称为直接父类   间接继承的父类，称间接父类
    3.5 子类继承父类之后，就获取了直接父类以及所有间接父类中声明的属性和方法

    4.1 如果我们没有显示声明一个类的父类时，则此类继承 java.lang.Object 类
    4.2 所有的 java 类（除 lang.object） 都直接或间接继承 java.lang.Object 类
    4.3 意味着，所有 java 类 都具有 lang.object 的功能
 */
public class Extends {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        Student s1 = new Student();
        s1.setName("Tome");     // 继承 Person  private
        s1.eat();               // 继承 Person
        s1.study();

        s1.breath();            // 间接继承
    }
}
