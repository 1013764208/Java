package Test05;

public class Person {

    String name = "person";
    int age;

    public void eat(){
        System.out.println("eat");
    }


    public void method(){
        // 局部内部类
        class AA{

        }
    }

    // 局部内部类
    public Person(){
        abstract class BB{

        }
    }

    // 静态成员内部类
    static class Dog{
        String name;
        int age;

        public void method(){
            System.out.println("dog");

        }

    }

    // 非静态成员内部类
    class Bird{
        String name = "bird";

        public void method(){
            System.out.println("lm bird");
            // 调用外部类的非静态方法
            Person.this.eat(); // Person类的对象的eat方法
        }

        public void disPlay(String name){
            System.out.println(name); // 方法的形参
            System.out.println(this.name); // 内部类的属性
            System.out.println(Person.this.name); // 外部类的属性

        }
    }
}
