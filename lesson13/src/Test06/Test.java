package Test06;

import Test04.Person;
import Test04.Student;

/*
    抽象类的匿名子类
 */
public class Test {
    public static void main(String[] args) {

        method(new Student()); // 匿名对象

        Work work = new Work();
        method(work);        // 非匿名的类非匿名的对象

        method(new Work());     // 非匿名的类匿名的对象

        // 创建一匿名子类的对象：person
        Person p = new Person(){
            @Override
            public void eat() {

            }
        };
        method(p);
    }

    public static void method(Person person){
        System.out.println("learn");
    }
}
