package lesson10.test03;

public class Student extends Person {
    String major;
    int id = 1707011052;  // 学号
    public Student(){

    }
    public Student(String major){
        super();             // 无参构造器
        this.major = major;
    }

    public Student(String name, int age,String major) {
        super(name, age);    // 调用有参构造器
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生：多吃有营养的事物");
    }

    public void study(){
        System.out.println("学生：学习知识");
    }

    public void show(){
        System.out.println("name = " + this.name + "  age = " + super.age);

        // this.id 子类属性    super.id 父类属性
        System.out.println("id = " + this.id + "  id = " + super.id);
    }
}
