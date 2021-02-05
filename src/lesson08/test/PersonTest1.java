package lesson08.test;
/*
    练习：在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18
    体现：构造器作用  初始化对象

 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        System.out.println(p.getAge());
    }
}
class Person1{
    // 属性
    private int age;

    // 构造器
    public  Person1(){
        age = 18;
    }

    // 方法
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
