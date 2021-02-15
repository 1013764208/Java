package lesson10;

public class Student extends Person {

    String major;
    public Student(){

    }
    public Student(String major){
        this.major = major;
    }

    // 对父类中eat方法进行重写
    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    public void study(){
        System.out.println("major: " + major);
    }
}
